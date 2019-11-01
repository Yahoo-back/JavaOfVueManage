package com.hyy.ifm.component;

import com.alibaba.fastjson.JSONObject;
import com.hyy.ifm.common.utils.DateUtil;
import com.hyy.ifm.common.utils.GetIpAddressUtils;
import com.hyy.ifm.common.utils.StringUtil;
import com.hyy.ifm.common.utils.ZfSignUtil;
import com.hyy.ifm.dao.CustomerDao;
import com.hyy.ifm.dao.DataSourceDao;
import com.hyy.ifm.dao.DcProductDao;
import com.hyy.ifm.mbg.mapper.DcProductReportMapper;
import com.hyy.ifm.mbg.mapper.UserBankcardMapper;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.ConfigDictService;
import com.hyy.ifm.service.PayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by macro on 2019/10/08.
 * 定时器
 */
@Component
public class Task {
    private Logger LOGGER =LoggerFactory.getLogger(Task.class);
    @Autowired
    private DcProductDao dcProductDao;
    @Autowired
    private DataSourceDao dataSourceDao;
    @Autowired
    private DcProductReportMapper dcProductReportMapper;
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private ConfigDictService configDictService;
    @Autowired
    private  UserBankcardMapper userBankcardMapper;
    @Autowired
    private PayService payService;

//    @Scheduled(cron="0 0 1 * * ? ")
    private void DataReportFromJob(){
        List<DcProduct> dcProducts = dcProductDao.qryProductListWithOutDelete();
        for(DcProduct dcProduct : dcProducts) {
            try {
                DcProductReport dcProductReport = new DcProductReport();
                dcProductReport.setProductId(dcProduct.getId());

                //设置当前时间前一天 并保证00:00:00
                String date = DateUtil.getDate(DateUtil.addDay(new Date(), -1));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                dcProductReport.setVisitTime(simpleDateFormat.parse(date + " 00:00:00"));

                Map<String, Object> record = dataSourceDao.countDayOfVisitCountByProduct(dcProduct.getId());
                dcProductReport.setVisitCount(StringUtil.parseInt(record.get("count")));

                dcProductReport.setRegCount(null);
                dcProductReport.setChangeRate(null);
                dcProductReport.setLoanCount(null);
                if(dcProduct.getSettleWayCpa() == null || dcProduct.getSettleWayCpa() == ""){
                    dcProduct.setSettleWayCpa("");
                }
                if(dcProduct.getSettleWayCps() == null || dcProduct.getSettleWayCps() == ""){
                    dcProduct.setSettleWayCps("");
                }
                if(dcProduct.getSettleWayCpa() == "" && dcProduct.getSettleWayCps() == ""){
                    dcProductReport.setSettleWay(dcProduct.getSettleCycle());
                }else if(dcProduct.getSettleWayCpa() != "" && dcProduct.getSettleWayCps() != ""){
                    dcProductReport.setSettleWay(dcProduct.getSettleCycle()+ "CPA" + dcProduct.getSettleWayCpa() + "CPS" + dcProduct.getSettleWayCps());
                }else if(dcProduct.getSettleWayCpa() != "" && dcProduct.getSettleWayCps() == ""){
                    dcProductReport.setSettleWay(dcProduct.getSettleCycle()+ "CPA" + dcProduct.getSettleWayCpa());
                }else if(dcProduct.getSettleWayCpa() == "" && dcProduct.getSettleWayCps() != ""){
                    dcProductReport.setSettleWay(dcProduct.getSettleCycle() + "CPS" + dcProduct.getSettleWayCps());
                }
                dcProductReport.setSettleState("0");
                dcProductReport.setSettleMoney(null);
                dcProductReport.setRemark("");
                dcProductReportMapper.insertSelective(dcProductReport);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//    @Scheduled(cron = "0 0 1,7,13,19 * * ?")
    private void UpdateProductApplyNumFiveDaysJob(){
        LOGGER.info("开始每天的定时扣款");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            Date today = sdf.parse(sdf.format(date));
            Date date1 ;
            Date beforeDay ;
            List<UserOrder> mapList = customerDao.qryUserOrderByStatus();
            String ip = GetIpAddressUtils.getLinuxLocalIp();//获取本机的IP地址
            JSONObject payJson = new JSONObject();
            JSONObject detailJson = null;
            List<DcDict> payMoney = configDictService.qryDictByDataType("PAY_MONEY");
            String [] str = payMoney.get(0).getItemValue().split(",");
            int countMoney = 0;
            for (int i = 0; i < mapList.size(); i++) {
                date1 = mapList.get(i).getApplyTime();
                beforeDay = sdf.parse(sdf.format(date1));
                if (today.after(beforeDay)) {
                    Date changeDate = today;
                    today = beforeDay;
                    beforeDay = changeDate;
                }
                int count = (int) ((beforeDay.getTime() - today.getTime()) / (1000*3600*24));
                today = new Date();
                if(count <= 9  && count >= 8){
                    UserBankcardExample example1 = new UserBankcardExample();
                    UserBankcardExample.Criteria criteria1 = example1.createCriteria();
                    criteria1.andUserIdEqualTo(mapList.get(i).getUserId());
                    List<UserBankcard> userBankcard = userBankcardMapper.selectByExample(example1);

                    payJson.put("uuid", mapList.get(i).getUserId());
                    payJson.put("ip", ip);
                    payJson.put("money",mapList.get(i).getRepayAmt());
                    if("3".equals(userBankcard.get(0).getAuthFrom())){
                        detailJson = payService.xfBindCardPay(payJson);
                        if(detailJson.containsKey("code")){
                            if("-1".equals(detailJson.get("code")) || "2".equals(detailJson.get("code"))){
                                for (int j = 0; j < str.length; j++) {
                                    if(Double.parseDouble(ZfSignUtil.sub(Double.parseDouble(detailJson.get("money").toString()),Double.parseDouble(str[j])))
                                            >= 0){
                                        payJson.put("money", str[j]);
                                        detailJson = payService.xfBindCardPay(payJson);
                                        if("0".equals(detailJson.get("code")) || "1".equals(detailJson.get("code"))){
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    countMoney++;
                }
            }
            LOGGER.info("3天！"+ countMoney);
            LOGGER.info("每天的定时扣款结束！");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
    }

//    @Scheduled(cron = "0 0 2,8,14,20 * * ?")
    private void UpdateProductApplyNumFourDaysJob(){
        LOGGER.info("开始每天的定时扣款");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            Date today = sdf.parse(sdf.format(date));
            Date date1 ;
            Date beforeDay ;
            List<UserOrder> mapList = customerDao.qryUserOrderByStatus();
            String ip = GetIpAddressUtils.getLinuxLocalIp();//获取本机的IP地址
            JSONObject payJson = new JSONObject();
            JSONObject detailJson = null;
            List<DcDict> payMoney = configDictService.qryDictByDataType("PAY_MONEY");
            String [] str = payMoney.get(0).getItemValue().split(",");
            int countMoney = 0;
            for (int i = 0; i < mapList.size(); i++) {
                date1 = mapList.get(i).getApplyTime();
                beforeDay = sdf.parse(sdf.format(date1));
                if (today.after(beforeDay)) {
                    Date changeDate = today;
                    today = beforeDay;
                    beforeDay = changeDate;
                }
                int count = (int) ((beforeDay.getTime() - today.getTime()) / (1000*3600*24));
                today = new Date();
                if(count <= 7  && count >= 6){
                    UserBankcardExample example1 = new UserBankcardExample();
                    UserBankcardExample.Criteria criteria1 = example1.createCriteria();
                    criteria1.andUserIdEqualTo(mapList.get(i).getUserId());
                    List<UserBankcard> userBankcard = userBankcardMapper.selectByExample(example1);
                    payJson.put("uuid", mapList.get(i).getUserId());
                    payJson.put("ip", ip);
                    payJson.put("money",mapList.get(i).getRepayAmt());
                    if("3".equals(userBankcard.get(0).getAuthFrom())){
                        detailJson = payService.xfBindCardPay(payJson);
                        if(detailJson.containsKey("code")){
                            if("-1".equals(detailJson.get("code")) || "2".equals(detailJson.get("code"))){
                                for (int j = 0; j < str.length; j++) {
                                    if(Double.parseDouble(ZfSignUtil.sub(Double.parseDouble(detailJson.get("money").toString()),Double.parseDouble(str[j])))
                                            >= 0){
                                        payJson.put("money", str[j]);
                                        detailJson = payService.xfBindCardPay(payJson);
                                        if("0".equals(detailJson.get("code")) || "1".equals(detailJson.get("code"))){
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    countMoney++;
                }
            }
            LOGGER.info("3天！"+ countMoney);
            LOGGER.info("每天的定时扣款结束！");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
    }

//    @Scheduled(cron = "0 0 5,11,17,23 * * ?")
    private void UpdateProductApplyNumJob(){

        LOGGER.info("开始每天的定时扣款");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            Date today = sdf.parse(sdf.format(date));
            Date date1 ;
            Date beforeDay ;
            List<UserOrder> mapList = customerDao.qryUserOrderByStatus();
            String ip = GetIpAddressUtils.getLinuxLocalIp();//获取本机的IP地址
            JSONObject payJson = new JSONObject();
            JSONObject detailJson = null;
            List<DcDict> payMoney = configDictService.qryDictByDataType("PAY_MONEY");
            String [] str = payMoney.get(0).getItemValue().split(",");
            int countMoney = 0;
            for (int i = 0; i < mapList.size(); i++) {
                date1 = mapList.get(i).getApplyTime();
                beforeDay = sdf.parse(sdf.format(date1));
                if (today.after(beforeDay)) {
                    Date changeDate = today;
                    today = beforeDay;
                    beforeDay = changeDate;
                }
                int count = (int) ((beforeDay.getTime() - today.getTime()) / (1000*3600*24));
                today = new Date();
                if(count < 2){
                    UserBankcardExample example1 = new UserBankcardExample();
                    UserBankcardExample.Criteria criteria1 = example1.createCriteria();
                    criteria1.andUserIdEqualTo(mapList.get(i).getUserId());
                    List<UserBankcard> userBankcard = userBankcardMapper.selectByExample(example1);
                    payJson.put("uuid", mapList.get(i).getUserId());
                    payJson.put("ip", ip);
                    payJson.put("money",mapList.get(i).getRepayAmt());
                    if("3".equals(userBankcard.get(0).getAuthFrom())){
                        detailJson = payService.xfBindCardPay(payJson);
                        if(detailJson.containsKey("code")){
                            if("-1".equals(detailJson.get("code")) || "2".equals(detailJson.get("code"))){
                                for (int j = 0; j < str.length; j++) {
                                    if(Double.parseDouble(ZfSignUtil.sub(Double.parseDouble(detailJson.get("money").toString()),Double.parseDouble(str[j])))
                                            >= 0){
                                        payJson.put("money", str[j]);
                                        detailJson = payService.xfBindCardPay(payJson);
                                        if("0".equals(detailJson.get("code")) || "1".equals(detailJson.get("code"))){
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    countMoney++;
                }
            }
            LOGGER.info("3-10天！"+ countMoney);
            LOGGER.info("每天的定时扣款结束！");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
    }

//    @Scheduled(cron = "0 0 9,18 * * ?")
    private void UpdateProductApplyNumLastDaysJob(){
        LOGGER.info("开始每天的定时扣款");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            Date today = sdf.parse(sdf.format(date));
            Date date1 ;
            Date beforeDay ;
            List<UserOrder> mapList = customerDao.qryUserOrderByStatus();
            String ip = GetIpAddressUtils.getLinuxLocalIp();//获取本机的IP地址
            JSONObject payJson = new JSONObject();
            JSONObject detailJson = null;
            List<DcDict> payMoney = configDictService.qryDictByDataType("PAY_MONEY");
            String [] str = payMoney.get(0).getItemValue().split(",");
            int countMoney = 0;
            for (int i = 0; i < mapList.size(); i++) {
                date1 = mapList.get(i).getApplyTime();
                beforeDay = sdf.parse(sdf.format(date1));
                if (today.after(beforeDay)) {
                    Date changeDate = today;
                    today = beforeDay;
                    beforeDay = changeDate;
                }
                int count = (int) ((beforeDay.getTime() - today.getTime()) / (1000*3600*24));
                today = new Date();
                if(count <= 14 && count >= 10){
                    UserBankcardExample example1 = new UserBankcardExample();
                    UserBankcardExample.Criteria criteria1 = example1.createCriteria();
                    criteria1.andUserIdEqualTo(mapList.get(i).getUserId());
                    List<UserBankcard> userBankcard = userBankcardMapper.selectByExample(example1);
                    payJson.put("uuid", mapList.get(i).getUserId());
                    payJson.put("ip", ip);
                    payJson.put("money",mapList.get(i).getRepayAmt());
                    if("3".equals(userBankcard.get(0).getAuthFrom())){
                        detailJson = payService.xfBindCardPay(payJson);
                        if(detailJson.containsKey("code")){
                            if("-1".equals(detailJson.get("code")) || "2".equals(detailJson.get("code"))){
                                for (int j = 0; j < str.length; j++) {
                                    if(Double.parseDouble(ZfSignUtil.sub(Double.parseDouble(detailJson.get("money").toString()),Double.parseDouble(str[j])))
                                            >= 0){
                                        payJson.put("money", str[j]);
                                        detailJson = payService.xfBindCardPay(payJson);
                                        if("0".equals(detailJson.get("code")) || "1".equals(detailJson.get("code"))){
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    countMoney++;
                }
            }
            LOGGER.info("10-14天人数："+ mapList.size());
            LOGGER.info("每天的定时扣款结束！");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
    }

//    @Scheduled(cron = "0 0 3,9,15,21 * * ?")
    private void UpdateProductApplyNumThreeDaysJob(){
        LOGGER.info("开始每天的定时扣款");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            Date today = sdf.parse(sdf.format(date));
            Date date1 ;
            Date beforeDay ;
            List<UserOrder> mapList = customerDao.qryUserOrderByStatus();
            String ip = GetIpAddressUtils.getLinuxLocalIp();//获取本机的IP地址
            JSONObject payJson = new JSONObject();
            JSONObject detailJson = null;
            List<DcDict> payMoney = configDictService.qryDictByDataType("PAY_MONEY");
            String [] str = payMoney.get(0).getItemValue().split(",");
            int countMoney = 0;
            for (int i = 0; i < mapList.size(); i++) {
                date1 = mapList.get(i).getApplyTime();
                beforeDay = sdf.parse(sdf.format(date1));
                if (today.after(beforeDay)) {
                    Date changeDate = today;
                    today = beforeDay;
                    beforeDay = changeDate;
                }
                int count = (int) ((beforeDay.getTime() - today.getTime()) / (1000*3600*24));
                today = new Date();
                if(count <= 5  && count >= 4){
                    UserBankcardExample example1 = new UserBankcardExample();
                    UserBankcardExample.Criteria criteria1 = example1.createCriteria();
                    criteria1.andUserIdEqualTo(mapList.get(i).getUserId());
                    List<UserBankcard> userBankcard = userBankcardMapper.selectByExample(example1);
                    payJson.put("uuid", mapList.get(i).getUserId());
                    payJson.put("ip", ip);
                    payJson.put("money",mapList.get(i).getRepayAmt());
                    if("3".equals(userBankcard.get(0).getAuthFrom())){
                        detailJson = payService.xfBindCardPay(payJson);
                        if(detailJson.containsKey("code")){
                            if("-1".equals(detailJson.get("code")) || "2".equals(detailJson.get("code"))){
                                for (int j = 0; j < str.length; j++) {
                                    if(Double.parseDouble(ZfSignUtil.sub(Double.parseDouble(detailJson.get("money").toString()),Double.parseDouble(str[j])))
                                            >= 0){
                                        payJson.put("money", str[j]);
                                        detailJson = payService.xfBindCardPay(payJson);
                                        if("0".equals(detailJson.get("code")) || "1".equals(detailJson.get("code"))){
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    countMoney++;
                }
            }
            LOGGER.info("3天！"+ countMoney);
            LOGGER.info("每天的定时扣款结束！");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
    }

//    @Scheduled(cron = "0 0 4,10,16,22 * * ?")
    private void UpdateProductApplyNumTwoDaysJob(){
        LOGGER.info("开始每天的定时扣款");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            Date today = sdf.parse(sdf.format(date));
            Date date1 ;
            Date beforeDay ;
            List<UserOrder> mapList = customerDao.qryUserOrderByStatus();
            String ip = GetIpAddressUtils.getLinuxLocalIp();//获取本机的IP地址
            JSONObject payJson = new JSONObject();
            JSONObject detailJson = null;
            List<DcDict> payMoney = configDictService.qryDictByDataType("PAY_MONEY");
            String [] str = payMoney.get(0).getItemValue().split(",");
            int countMoney = 0;
            for (int i = 0; i < mapList.size(); i++) {
                date1 = mapList.get(i).getApplyTime();
                beforeDay = sdf.parse(sdf.format(date1));
                if (today.after(beforeDay)) {
                    Date changeDate = today;
                    today = beforeDay;
                    beforeDay = changeDate;
                }
                int count = (int) ((beforeDay.getTime() - today.getTime()) / (1000*3600*24));
                today = new Date();
                if(count <= 3  && count >= 2){
                    UserBankcardExample example1 = new UserBankcardExample();
                    UserBankcardExample.Criteria criteria1 = example1.createCriteria();
                    criteria1.andUserIdEqualTo(mapList.get(i).getUserId());
                    List<UserBankcard> userBankcard = userBankcardMapper.selectByExample(example1);
                    payJson.put("uuid", mapList.get(i).getUserId());
                    payJson.put("ip", ip);
                    payJson.put("money",mapList.get(i).getRepayAmt());
                    if("3".equals(userBankcard.get(0).getAuthFrom())){
                        detailJson = payService.xfBindCardPay(payJson);
                        if(detailJson.containsKey("code")){
                            if("-1".equals(detailJson.get("code")) || "2".equals(detailJson.get("code"))){
                                for (int j = 0; j < str.length; j++) {
                                    if(Double.parseDouble(ZfSignUtil.sub(Double.parseDouble(detailJson.get("money").toString()),Double.parseDouble(str[j])))
                                            >= 0){
                                        payJson.put("money", str[j]);
                                        detailJson = payService.xfBindCardPay(payJson);
                                        if("0".equals(detailJson.get("code")) || "1".equals(detailJson.get("code"))){
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    countMoney++;
                }
            }
            LOGGER.info("3天！"+ countMoney);
            LOGGER.info("每天的定时扣款结束！");
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
    }
}
