package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.StringUtil;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dao.CustomerDao;
import com.hyy.ifm.dto.CustomerStatisticsParam;
import com.hyy.ifm.dto.RefundMailParam;
import com.hyy.ifm.dto.RefundParam;
import com.hyy.ifm.dto.RefundSaveParam;
import com.hyy.ifm.mbg.mapper.*;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.RefundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 客诉模块Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class RefundServiceImpl implements RefundService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RefundServiceImpl.class);
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private DcProductMapper dcProductMapper;
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;
    @Autowired
    private DcProductClassifyMapper dcProductClassifyMapper;
    @Autowired
    private DcUserRefundMapper dcUserRefundMapper;
    @Autowired
    private DcUserAttachMapper dcUserAttachMapper;
    @Autowired
    private UserOrderMapper userOrderMapper;


    @Override
    public List<Map<String,Object>> qryRefund(RefundParam param, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return customerDao.qryRefund(param);
    }

    @Override
    public Map<String,Object> qryRefundAttachById(Integer id) {
        Map<String,Object> record = customerDao.qryCustomerById(id);
        DcUserRefundExample example = new DcUserRefundExample();
        DcUserRefundExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<DcUserRefund> dcUserRefund = dcUserRefundMapper.selectByExample(example);
        DcUserAttachExample example1 = new DcUserAttachExample();
        DcUserAttachExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andUserIdEqualTo(id);
        List<DcUserAttach> dcUserAttaches =  dcUserAttachMapper.selectByExample(example1);
        record.put("refund", dcUserRefund);
        record.put("attach", dcUserAttaches);
        return record;
    }

    @Override
    public CommonResult updateOrderAuditStatus(Integer id, String status) {
        int count = 0;
        UserOrderExample example = new UserOrderExample();
        UserOrderExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<UserOrder> userOrder = userOrderMapper.selectByExample(example);
        if (null != userOrder && !userOrder.isEmpty()) {
            if("0".equals(StringUtil.nvl(status))) {
                if ("5".equals(userOrder.get(0).getUserAuth())) {
                    return CommonResult.failed("该用户已申请退款");
                }
                userOrder.get(0).setStatus("1");
                userOrder.get(0).setUserAuth("5");
                userOrder.get(0).setSysUserId(UserUtils.getCurrentHr().getUserid());
            } else if("1".equals(StringUtil.nvl(status))) {
                if(userOrder.get(0).getPayAmt() >= userOrder.get(0).getApplyAmt()){
                    userOrder.get(0).setStatus("1");
                }else{
                    userOrder.get(0).setStatus("0");
                }
                userOrder.get(0).setUserAuth("0");
                userOrder.get(0).setSysUserId(null);
            }
            count = userOrderMapper.updateByPrimaryKey(userOrder.get(0));

            IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
            ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
            ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("修改跟单");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }

    @Override
    public List<Map<String,Object>> qryMyRefund(RefundParam param, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return customerDao.qryMyRefund(param,UserUtils.getCurrentHr().getUserid());
    }

    @Override
    public int saveRefund(RefundSaveParam refund) {
        int count;
        UserOrderExample example = new UserOrderExample();
        UserOrderExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(refund.getId());
        List<UserOrder> userOrder = userOrderMapper.selectByExample(example);

        DcUserRefund dcUserRefund = new DcUserRefund();
        dcUserRefund.setUserId(refund.getId());
        dcUserRefund.setPath(refund.getFile_url());
        dcUserRefund.setCreateTime(new Date());

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        ifmUserOperate.setOperateDate(new Date());
        if(null != refund.getMoney()){
            userOrder.get(0).setUserAuth("1");
            userOrder.get(0).setRefundAmt( new BigDecimal(refund.getMoney()).doubleValue());
            userOrder.get(0).setRefundTime(new Date());
            dcUserRefund.setType("8");
            ifmUserOperate.setOperate("保存退款");
        }else{
            userOrder.get(0).setUserAuth("0");
            if(userOrder.get(0).getApplyAmt() > userOrder.get(0).getPayAmt()){
                userOrder.get(0).setStatus("0");
            }
            userOrder.get(0).setRefundTime(new Date());
            dcUserRefund.setType("9");
            ifmUserOperate.setOperate("驳回退款");
        }
        userOrderMapper.updateByPrimaryKey(userOrder.get(0));
        dcUserRefundMapper.insertSelective(dcUserRefund);
        ifmSysUserOperateMapper.insertSelective(ifmUserOperate);

        count = 1;
        return count;
    }

    @Override
    public List<Map<String,Object>> qryRefundList(RefundParam param, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return customerDao.qryRefundList(param);
    }

    @Override
    public List<Map<String,Object>> listStatistics(CustomerStatisticsParam param, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return customerDao.listStatistics(param);
    }

    @Override
    public List<Map<String,Object>> mailRefundList(RefundMailParam param, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return customerDao.mailRefundList(param);
    }





}
