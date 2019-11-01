package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.StringUtil;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dao.CustomerDao;
import com.hyy.ifm.dto.CustomerModifyParam;
import com.hyy.ifm.dto.CustomerParam;
import com.hyy.ifm.dto.CustomerPayParam;
import com.hyy.ifm.mbg.mapper.*;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.ConfigDictService;
import com.hyy.ifm.service.CustomerService;
import com.hyy.ifm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 客户列表Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private ConfigDictService configDictService;
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;
    @Autowired
    private DcUserAttachMapper dcUserAttachMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private DcUserMapper dcUserMapper;
    @Autowired
    private IfmSysLoginMapper ifmSysLoginMapper;
    @Autowired
    private DcUserInfoMapper dcUserInfoMapper;

    @Override
    public List<Map<String, Object>> qryCustomerList(CustomerParam customerParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        if (customerParam.getUser_auth_cnd()!=null && customerParam.getUser_auth_cnd().equals("0")){
            return customerDao.qryCustomerListNone(customerParam);
        }else {
            return customerDao.qryCustomerList(customerParam);
        }
    }

    @Override
    public List<Map<String, Object>> qryCustomerMoneyAll(CustomerParam customerParam) {
        List<Map<String, Object>> res = customerDao.qryCustomerMoneyAll(customerParam);
        //当日支付金额
        StringBuffer cnd = new StringBuffer();
        if("".equals(customerParam.getPay_time_FROM_cnd())) {
            String from  = new SimpleDateFormat("yyyy-MM-dd 00:00:00").format(new Date());
            customerParam.setPay_time_FROM_cnd(from);
        }
        if("".equals(customerParam.getPay_time_TO_cnd())) {
            String to  = new SimpleDateFormat("yyyy-MM-dd 23:59:59").format(new Date());
            customerParam.setPay_time_TO_cnd(to);
        }
        List<DcDict> payOrderList = configDictService.qryDictByDataType("PAYORDER_LIST");
        double amt = 0;
        for (Map<String, Object> re : res) {
            for (DcDict dcDict : payOrderList) {
                String[] split = dcDict.getItemValue().split(",");
                for (String s : split) {
                    List<Map<String, Object>> payAmt =  customerDao.qryPayAmt(customerParam,s);
                    for (Map<String, Object> record : payAmt) {
                        amt = amt + Double.parseDouble(record.get("amt").toString());
                    }
                }
            }
            re.put("pay_time",amt);
        }
        return res;
    }

    @Override
    public CommonPage<Map<String, Object>> qryCustomerMoneyAllSys(CustomerPayParam customerParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        boolean f = null != customerParam.getName_cnd() ? true : false;
        IfmSysLoginExample example = new IfmSysLoginExample();
        IfmSysLoginExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(customerParam.getName_cnd())) {
            criteria.andUserCodeLike("%" + customerParam.getName_cnd() + "%");
        }
        if (!f) {
            criteria.andLgnidGreaterThan(0);
        }
        List<IfmSysLogin> userList = ifmSysLoginMapper.selectByExample(example);
        //将第一次查询到的pageinfo信息保存下来
        PageInfo<IfmSysLogin> pageInfo = new PageInfo<>(userList);
        List<Map<String,Object>> res = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            Map<String,Object> record = customerDao.qrySysNameAllMoney(userList.get(i).getUserCode());
            Map<String,Object> map = new HashMap<>();
            map.put("name",userList.get(i).getUserCode());
            map.put("pay_amt",record.get("pay_amt"));
            res.add(map);
        }
        //将前面分页的信息保存下来复制到新的对象中
        PageInfo<Map<String, Object>> page= new PageInfo<>(res);
        BeanUtils.copyProperties(pageInfo,page);
        page.setList(res);
        CommonPage<Map<String, Object>> result = new CommonPage<Map<String, Object>>();
        result.setTotalPage(page.getPages());
        result.setPageNum(page.getPageNum());
        result.setPageSize(page.getPageSize());
        result.setTotal(page.getTotal());
        result.setList(page.getList());

        return result;
    }

    @Override
    public List<Map<String, Object>> exportCustomerList (CustomerParam customerParam) {
        return customerDao.exportCustomerList(customerParam);
    }

    @Override
    public Map<String,Object> qryCustomerById(Integer id) {
        Map<String,Object> record = customerDao.qryCustomerById(id);
        DcUserAttachExample example = new DcUserAttachExample();
        example.createCriteria().andUserIdEqualTo(id);
        List<DcUserAttach> dcUserAttaches =  dcUserAttachMapper.selectByExample(example);
        record.put("attach", dcUserAttaches);
        return record;
    }

    @Override
    public CommonResult updateCustomer(Integer id, String status) {
        int count = 0;
        DcUser dcUser = dcUserMapper.selectByPrimaryKey(id);

        if (null != dcUser) {
            if("1".equals(status)) {
                if("1".equals(dcUser.getStatus())) {
                    return CommonResult.failed("该用户已被禁用，请刷新后重试");
                }
            } else if("0".equals(status)) {
                if("0".equals(dcUser.getStatus())) {
                    return CommonResult.failed("该用户已被恢复，请刷新后重试");
                }
            }
            dcUser.setStatus(status);
            count = dcUserMapper.updateByPrimaryKey(dcUser);

            IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
            ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
            ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("修改用户");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }

    @Override
    public CommonResult updateCustomerById(CustomerModifyParam user) {
        int count = 0;
        DcUserInfoExample example = new DcUserInfoExample();
        example.createCriteria().andUserIdEqualTo(user.getId());
        List<DcUserInfo> dcUserInfo = dcUserInfoMapper.selectByExample(example);
        String userName = dcUserInfo.get(0).getUserName();
        String idCard = dcUserInfo.get(0).getIdCard();
        dcUserInfo.get(0).setUserName(StringUtil.nvl(user.getUser_name()));
        dcUserInfo.get(0).setIdCard(StringUtil.nvl(user.getId_card()));
        count = dcUserInfoMapper.updateByPrimaryKeySelective(dcUserInfo.get(0));

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        ifmUserOperate.setOperateDate(new Date());
        ifmUserOperate.setOperate("修改用户详情:原名："+userName+"身份证："+idCard+"修改后："+dcUserInfo.get(0).getUserName()+"身份证："+dcUserInfo.get(0).getIdCard());
        ifmSysUserOperateMapper.insertSelective(ifmUserOperate);

        return CommonResult.success(count);
    }
}
