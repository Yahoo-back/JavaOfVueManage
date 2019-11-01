package com.hyy.ifm.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.ShardTableUtil;
import com.hyy.ifm.common.utils.StringUtil;
import com.hyy.ifm.common.utils.ZfSignUtil;
import com.hyy.ifm.common.utils.kq.util.Consts;
import com.hyy.ifm.common.utils.kq.util.JsonUtil;
import com.hyy.ifm.common.utils.xf.util.ECTXmlUtil;
import com.hyy.ifm.common.utils.xf.util.HttpClientUtil;
import com.hyy.ifm.common.utils.xf.util.MerchantSignAndVerify;
import com.hyy.ifm.common.utils.xf.util.R;
import com.hyy.ifm.dao.UserOrderDao;
import com.hyy.ifm.dao.XfCallbackLogDao;
import com.hyy.ifm.dao.XfOrderDao;
import com.hyy.ifm.dto.PayRefundParam;
import com.hyy.ifm.mbg.mapper.*;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.ConfigDictService;
import com.hyy.ifm.service.PayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 支付Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class PayServiceImpl implements PayService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PayServiceImpl.class);
    @Autowired
    private UserOrderMapper userOrderMapper;
    @Autowired
    private UserOrderDao userOrderDao;
    @Autowired
    private UserBankcardMapper userBankcardMapper;
    @Autowired
    private XfCallbackLogDao xfCallbackLogDao;
    @Autowired
    private XfConfigMapper xfConfigMapper;
    @Autowired
    private DcUserInfoMapper dcUserInfoMapper;
    @Autowired
    private BankDictMapper bankDictMapper;
    @Autowired
    private DcUserMapper dcUserMapper;
    @Autowired
    private LoanOrderMapper loanOrderMapper;
    @Autowired
    private ConfigDictService configDictService;
    @Autowired
    private XfOrderDao xfOrderDao;
    @Autowired
    private XfOrderMapper xfOrderMapper;

    @Override
    public CommonResult thirdPay(PayRefundParam param) {
        String money = param.getMoney();
        int id = param.getId();

        DcUser userList = dcUserMapper.selectByPrimaryKey(id);
        DcUserInfoExample example = new DcUserInfoExample();
        DcUserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<DcUserInfo> dcUserInfoList = dcUserInfoMapper.selectByExample(example);

        if (null == dcUserInfoList) {
            return CommonResult.failed("用户不存在");
        }

        if (null == userList) {
            return CommonResult.failed("用户不存在");
        }

        UserBankcardExample example1 = new UserBankcardExample();
        UserBankcardExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andUserIdEqualTo(dcUserInfoList.get(0).getUserId());
        List<UserBankcard> userBankcard = userBankcardMapper.selectByExample(example1);
        if(null == userBankcard || userBankcard.isEmpty()){
            return CommonResult.failed("该用户绑卡关系不存在");
        }

        if(userBankcard.get(0).getAuthFrom().equals("3")){
            DcUserInfo dcUserInfo = dcUserInfoList.get(0);

            DcUser dcUser = userList;
            UserOrderExample example2 = new UserOrderExample();
            UserOrderExample.Criteria criteria2 = example2.createCriteria();
            criteria2.andUserIdEqualTo(dcUser.getId());
            List<UserOrder> userOrder = userOrderMapper.selectByExample(example2);

            if("0".equals(param.getType())){
                if(!userOrder.get(0).getUserAuth().equals("1") && !userOrder.get(0).getUserAuth().equals("4")){
                    return CommonResult.failed("该用户目前状态不属于退款状态");
                }
            }
            List<Map<String,Object>> order = userOrderDao.qryLoanOrderByOrderId(userOrder.get(0).getId());

            if (!CollectionUtils.isEmpty(order)) {

                if ("0".equals(order.get(0).get("status"))) {
                    return CommonResult.failed("当前正在放款中, 请稍后再试");
                } else if ("1".equals(order.get(0).get("status")) || "3".equals(order.get(0).get("status"))) {
                    return CommonResult.failed("当前账单已放款, 不能继续放款");
                }
            }
            String outTradeNo = StringUtil.generateOutTradeNo();
            LoanOrder lo = new LoanOrder();
            lo.setId(outTradeNo);
            lo.setUserName(dcUserInfo.getUserName());
            lo.setBankNo(userOrder.get(0)./*getBankNo()*/getBankNo().replaceAll(" ", ""));
            lo.setBank(userOrder.get(0).getBank());

            lo.setTotalMoney(money);
            lo.setCreateTime(new Date());
            lo.setOrderId(userOrder.get(0).getId().intValue());
            lo.setUserId(userOrder.get(0).getUserId().toString());
            lo.setIdentityNo(dcUserInfo.getIdCard());
            lo.setMobileNo(dcUser.getMobile());
            lo.setPayFrom("3");
            XfConfig xfConfig = xfConfigMapper.selectByPrimaryKey(5);
            if (xfConfig == null) {
                return CommonResult.failed("代发配置丢失");
            }
            try {
                String rtnString = xfsend(xfConfig,money,dcUserInfo,outTradeNo);

                // 分表
                String tableName = ShardTableUtil.generateTableNameById("xf_callback_log", dcUser.getId(), 3);
                int countTable = xfCallbackLogDao.countTable(tableName);
                if (countTable == 0) {
                    xfCallbackLogDao.createTable(tableName);
                }
                XfCallbackLog xfCallbackLog = new XfCallbackLog();
                xfCallbackLog.setUserId(dcUser.getId());
                xfCallbackLog.setType("6");
                xfCallbackLog.setContent("代付请求"+rtnString);
                xfCallbackLog.setCreateTime(new Date());
                xfCallbackLogDao.saveShard(tableName, xfCallbackLog);

                Map<String, String> resultMap = ECTXmlUtil.xmlToMap(rtnString);
                if(resultMap.get("retFlag").equals("T")){
                    lo.setStatus("1");
                    loanOrderMapper.insertSelective(lo);
                    userOrder.get(0).setStatus("1");
                    userOrder.get(0).setUserAuth("3");
                    userOrder.get(0).setRebackAmt(Double.parseDouble(money));
                    userOrderMapper.updateByPrimaryKey(userOrder.get(0));
                    return CommonResult.success("退款成功");
                } else{
                    lo.setStatus("2");
                    loanOrderMapper.insertSelective(lo);
                    userOrder.get(0).setStatus("1");
                    userOrder.get(0).setUserAuth("4");
                    userOrderMapper.updateByPrimaryKey(userOrder.get(0));
                    return CommonResult.failed("退款失败");
                }
            } catch (Exception e) {
                e.printStackTrace();
                return CommonResult.failed("代发失败");
            }
        }
        return CommonResult.failed("退款失败");
    }

    public String xfsend(XfConfig xfConfig,String money,DcUserInfo dcUserInfo,String outTradeNo) throws UnsupportedEncodingException {
        Map<String, String> map = new HashMap<String, String>();
        // 2.1 基本参数
        map.put("version", "1.0.1");// 版本
        map.put("merchantId",xfConfig.getMchntcd());  //商户号
        map.put("orderId", outTradeNo); //订单号
        map.put("reqDate", new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(new Date()));//请求时间
        map.put("amount", money);// 金额
        map.put("name", dcUserInfo.getUserName());// 收款人姓名

        BankDictExample example = new BankDictExample();
        BankDictExample.Criteria criteria = example.createCriteria();
        criteria.andItemValueEqualTo(dcUserInfo.getBankOpen());
        String payBankCode = JSONObject.parseObject(bankDictMapper.selectByExample(example).get(0).getItemKey()).get("xfPay").toString();
        map.put("organCode", payBankCode); // 收款人机构号
        map.put("account", dcUserInfo.getBankCard()); // 收款人账号
        map.put("accountType", "90"); // 收款人账户类型 90 ：储蓄卡
        map.put("idType", "10"); // 收款人证件类型   10：身份证
        map.put("idCode", dcUserInfo.getIdCard()); // 收款人身份证
        map.put("orderBizzType", "130002"); // 业务类型分类
        map.put("subMercId", "");//二级商户编码
        map.put("subMercName", "");//二级商户简称
        //加签
        String to_sign = MerchantSignAndVerify.createLinkString(map);
        //调用CFCA方法得到加签 sign
        String sign = new String(MerchantSignAndVerify.sign(to_sign, xfConfig.getMchntcd()));
        //加签sign放入map
        map.put("sign", sign);
        //拼装成xml请求报文，并发送post请求,
        //这里只是给出了一种写法，开发者可以自由编写只要请求报文符合接口文档的规范
        String xmlString = ECTXmlUtil.mapToXml(map, ECTXmlUtil.CPREQ_SPREQ);
        LOGGER.info("发出报文：" + xmlString);
        String responseString = HttpClientUtil.postToServerByXml(xmlString, xfConfig.getUrl());
        LOGGER.info("返回报文：" + responseString);

        //验签
        //xml解析成map，map中包含了 <CSReq>标签内的元素
        Map<String, String> resultMap = ECTXmlUtil.xmlToMap(responseString);
        String result_sign = resultMap.get("sign");
        String to_verify = MerchantSignAndVerify.createLinkString(resultMap);
        if(MerchantSignAndVerify.verify(to_verify.getBytes(R.PGWConstant.UTF8), result_sign.getBytes(R.PGWConstant.UTF8))){
            LOGGER.info("验签成功");
        }else{
            LOGGER.error("验签失败");
        }
        return responseString;
    }

    @Override
    public JSONObject xfBindCardPay(JSONObject param) {
        JSONObject detail = new JSONObject();
        String uuid = JsonUtil.getJStringAndCheck(param, "uuid", null, true, detail);
        String ip = JsonUtil.getJStringAndCheck(param, "ip", null, true, detail);
        String money = JsonUtil.getJStringAndCheck(param, "money", null, true, detail);
        if (detail.containsKey(Consts.RESULT)) {
            return detail;
        }

        DcUser userDetail = dcUserMapper.selectByPrimaryKey(Integer.valueOf(uuid));
        if (null == userDetail) {
            JsonUtil.setErrorMsg(detail, "user_login.not_login");
        }
        //DcUser userDetail = userDetails.get(0);

        List<DcDict> payType = configDictService.qryDictByDataType("PAY_TYPE");
        if (null == payType.get(0) || StringUtils.isEmpty(payType.get(0).getItemValue().toString())) {
            JsonUtil.setErrorMsg(detail, "系统还款类型丢失！");
            return detail;
        }
        // 分表
        String tableName1 = ShardTableUtil.generateTableNameById("xf_order", userDetail.getId(), 3);
        int countTable1 = xfOrderDao.countTable(tableName1);
        if (countTable1 == 0) {
            xfOrderDao.createTable(tableName1);
        }
        UserOrderExample example = new UserOrderExample();
        UserOrderExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userDetail.getId());
        List<UserOrder> userOrder = userOrderMapper.selectByExample(example);
        UserOrder userOrderDaoByPrimary = userOrder.get(0);
        if (Double.parseDouble(money)>Double.parseDouble(String.valueOf(userOrderDaoByPrimary.getRepayAmt()))){
            money=String.valueOf(userOrderDaoByPrimary.getRepayAmt());
        }
        Map<String, Object> arg = new HashMap<>();
        arg.put("userId", userDetail.getId());
        arg.put("type", "1");
        arg.put("outerId", userOrderDaoByPrimary.getId());
        XfOrder lastOrder = xfOrderDao.selectLastByUserIdAndTypeAndOuterId(tableName1,arg);
//        if (lastOrder != null) {
//            if ("0".equals(lastOrder.getStatus()) || "3".equals(lastOrder.getStatus())) {
//                JsonUtil.setErrorMsg(detail, "账单正在支付中, 请勿重新支付");
//                return detail;
//            } else if ("1".equals(lastOrder.getStatus())) {
//                JsonUtil.setErrorMsg(detail, "账单已支付完成, 无需再次支付");
//                return detail;
//            }
//        }
        DcUserInfoExample example1 = new DcUserInfoExample();
        DcUserInfoExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andUserIdEqualTo(userDetail.getId());
        List<DcUserInfo> dcUserInfo = dcUserInfoMapper.selectByExample(example1);

        //DcUserInfo dcUserInfo = dcUserInfoMapper.selectByUserId(userDetail.get("id").toString()));
        UserBankcardExample example2 = new UserBankcardExample();
        UserBankcardExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andUserIdEqualTo(userDetail.getId());
        criteria2.andCardNoEqualTo(dcUserInfo.get(0).getBankCard());
        criteria2.andAuthFromEqualTo("3");
        List<UserBankcard> userBankcard = userBankcardMapper.selectByExample(example2);


        if (userOrderDaoByPrimary == null) {
            JsonUtil.setErrorMsg(detail, "订单不存在");
            return detail;
        }
        if (!userOrderDaoByPrimary.getUserId().equals(dcUserInfo.get(0).getUserId())) {
            JsonUtil.setErrorMsg(detail, "非本人订单, 不能支付");
            return detail;
        }
        XfConfig xfConfig = xfConfigMapper.selectByPrimaryKey(3);
        if (xfConfig == null) {
            JsonUtil.setErrorMsg(detail,  "绑卡支付丢失！");
            return detail;
        }


        Map<String, String> map = new HashMap<String, String>();
        String outTradeNo = StringUtil.generateOutTradeNo();
        // 2.1 基本参数
        map.put("version", "1.0.1");// 版本
        map.put("merchantId",xfConfig.getMchntcd());  //商户号
        map.put("payOrderId", outTradeNo); //订单号
        Date date = new Date();
        map.put("reqDate", new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(date));//请求时间
        map.put("amount", money);// 金额
        String protocolId = userBankcard.get(0).getRemark();
        map.put("protocolId", protocolId);// 签约协议号
        map.put("name", dcUserInfo.get(0).getUserName());// 客户姓名
        map.put("account", dcUserInfo.get(0).getBankCard()); // 银行账号
        map.put("payType", "140002"); // 支付场景
        map.put("orderDesc", "1#1#支付1支付^"+money+"^1"); // 订单详情
        map.put("subMercId", "");//二级商户编码
        map.put("subMercName", "");//二级商户简称
        map.put("cvv2", "");//信用卡背面签名栏的后三位数字
        map.put("validDate", "");//信用卡有效期
        //加签
        String to_sign = MerchantSignAndVerify.createLinkString(map);
        //调用CFCA方法得到加签 sign
        String sign = new String(MerchantSignAndVerify.sign(to_sign, xfConfig.getMchntcd()));
        //加签sign放入map
        map.put("sign", sign);
        //拼装成xml请求报文，并发送post请求,
        String xmlString = ECTXmlUtil.mapToXml(map, ECTXmlUtil.CPREQ_QPREQ);
        //log.info("发出报文：" + xmlString);
        String responseString = null;
        try {
            responseString = HttpClientUtil.postToServerByXml(xmlString, xfConfig.getUrl());
            //log.info("返回报文：" + responseString);
            //验签
            //xml解析成map，map中包含了 <CSReq>标签内的元素
            Map<String, String> resultMap = ECTXmlUtil.xmlToMap(responseString);
            String result_sign = resultMap.get("sign");
            String to_verify = MerchantSignAndVerify.createLinkString(resultMap);
            if(MerchantSignAndVerify.verify(to_verify.getBytes(R.PGWConstant.UTF8), result_sign.getBytes(R.PGWConstant.UTF8))){
                LOGGER.info("验签成功");
            }else{
                LOGGER.error("验签失败");
            }
        } catch (UnsupportedEncodingException e) {
            LOGGER.error("报文异常！");
            e.printStackTrace();
        }
        XfOrder xfOrder = new XfOrder();
        xfOrder.setUserId(userOrderDaoByPrimary.getUserId());
        xfOrder.setType("1");
        xfOrder.setOuterId(userOrderDaoByPrimary.getId().intValue());
        xfOrder.setRequestNo(outTradeNo);
        xfOrder.setUserIp(ip);
        xfOrder.setAmt(Double.valueOf(money));
        xfOrder.setCreateTime(new Date());
        xfOrder.setStatus("0");

        // 分表
        String tableName = ShardTableUtil.generateTableNameById("xf_callback_log", userDetail.getId(), 3);
        int countTable = xfCallbackLogDao.countTable(tableName);
        if (countTable == 0) {
            xfCallbackLogDao.createTable(tableName);
        }
        XfCallbackLog xfCallbackLog = new XfCallbackLog();
        xfCallbackLog.setUserId(userDetail.getId());
        xfCallbackLog.setType("3");
        xfCallbackLog.setContent(responseString);
        xfCallbackLog.setCreateTime(new Date());
        xfCallbackLogDao.saveShard(tableName, xfCallbackLog);

        if (responseString == null) {
            LOGGER.info("绑卡支付读取内容出错");
        } else {

            Map<String, String> resultMap = ECTXmlUtil.xmlToMap(responseString);
            if(resultMap.get("retFlag").equals("T")&&resultMap.get("resultCode").equals("0032")){
                LOGGER.info("交易成功");

                xfOrder.setStatus("1");
                xfOrder.setPayDate(date);
                xfOrder.setProtocolNo(resultMap.get("payOrderId"));
                xfOrderDao.saveShard(tableName1,xfOrder);
                xfOrderMapper.insertSelective(xfOrder);

                if (userOrderDaoByPrimary.getApplyAmt() <= (Double.parseDouble(money) + userOrderDaoByPrimary.getPayAmt())) {
                    // 更新订单状态
                    userOrderDaoByPrimary.setStatus("1");
                    userOrderDaoByPrimary.setPayTime(date);
                    userOrderDaoByPrimary.setPayAmt(Double.parseDouble(ZfSignUtil.sum(Double.parseDouble(money), userOrderDaoByPrimary.getPayAmt())));
                    userOrderDaoByPrimary.setRepayAmt(0.00);
                    userOrderMapper.updateByPrimaryKeySelective(userOrderDaoByPrimary);
                    detail.put("code", "0");//交易结束
                    return detail;
                } else {
                    userOrderDaoByPrimary.setStatus("0");
                    userOrderDaoByPrimary.setPayTime(date);
                    userOrderDaoByPrimary.setRepayAmt(Double.parseDouble(ZfSignUtil.sub(userOrderDaoByPrimary.getApplyAmt(),
                            Double.parseDouble(ZfSignUtil.sum(Double.parseDouble(money), userOrderDaoByPrimary.getPayAmt())))));
                    userOrderDaoByPrimary.setPayAmt(Double.parseDouble(ZfSignUtil.sum(Double.parseDouble(money), userOrderDaoByPrimary.getPayAmt())));
                    userOrderMapper.updateByPrimaryKeySelective(userOrderDaoByPrimary);
                    detail.put("code", "-1");//进入下一个循环
                    detail.put("money", money);
                    return detail;
                }
            } else if (resultMap.get("retFlag").equals("P")) {
                xfOrder.setStatus("0");
                xfOrderDao.saveShard(tableName1, xfOrder);
                detail.put("code", "0");//处理中
                return detail;
            } else {
                xfOrder.setStatus("2");
                xfOrder.setFailReason(resultMap.get("resultMsg"));
                JsonUtil.setErrorMsg(detail, resultMap.get("resultMsg"));
                xfOrderDao.saveShard(tableName1, xfOrder);
                detail.put("money", money);
                detail.put("code", "2");//失败
                return detail;
            }
        }
        return detail;
    }
}
