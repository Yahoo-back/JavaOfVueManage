package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyy.ifm.dto.BusinessCustomerParam;
import com.hyy.ifm.mbg.mapper.DcInterestCustomerMapper;
import com.hyy.ifm.mbg.model.DcInterestCustomer;
import com.hyy.ifm.mbg.model.DcInterestCustomerExample;
import com.hyy.ifm.service.BusinessCustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商务管理Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class BusinessCustomerServiceImpl implements BusinessCustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessCustomerServiceImpl.class);
    @Autowired
    private DcInterestCustomerMapper dcInterestCustomerMapper;


    @Override
    public List<DcInterestCustomer> qryBusinessCustomerList(BusinessCustomerParam businessCustomerParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DcInterestCustomerExample dcInterestCustomerExample = new DcInterestCustomerExample();
        DcInterestCustomerExample.Criteria criteria = dcInterestCustomerExample.createCriteria();
        if (!StringUtils.isEmpty(businessCustomerParam.getName_cnd())) {
            criteria.andNameLike("%" + businessCustomerParam.getName_cnd() + "%");
        }
        if (!StringUtils.isEmpty(businessCustomerParam.getMobile_cnd())) {
            criteria.andMobileLike("%" + businessCustomerParam.getMobile_cnd() + "%");
        }
        if (!StringUtils.isEmpty(businessCustomerParam.getCreate_time_FROM_cnd())) {
            criteria.andCreateTimeGreaterThanOrEqualTo(businessCustomerParam.getCreate_time_FROM_cnd());
        }
        if (!StringUtils.isEmpty(businessCustomerParam.getCreate_time_TO_cnd())) {
            criteria.andCreateTimeLessThanOrEqualTo(businessCustomerParam.getCreate_time_TO_cnd() +" 23:59:59 ");
        }
        return dcInterestCustomerMapper.selectByExample(dcInterestCustomerExample);
    }

    @Override
    public List<DcInterestCustomer> exportBusinessCustomerList(BusinessCustomerParam businessCustomerParam) {
        DcInterestCustomerExample dcInterestCustomerExample = new DcInterestCustomerExample();
        DcInterestCustomerExample.Criteria criteria = dcInterestCustomerExample.createCriteria();
        if (!StringUtils.isEmpty(businessCustomerParam.getName_cnd())) {
            criteria.andNameLike("%" + businessCustomerParam.getName_cnd() + "%");
        }
        if (!StringUtils.isEmpty(businessCustomerParam.getMobile_cnd())) {
            criteria.andMobileLike("%" + businessCustomerParam.getMobile_cnd() + "%");
        }
        if (!StringUtils.isEmpty(businessCustomerParam.getCreate_time_FROM_cnd())) {
            criteria.andCreateTimeGreaterThanOrEqualTo(businessCustomerParam.getCreate_time_FROM_cnd());
        }
        if (!StringUtils.isEmpty(businessCustomerParam.getCreate_time_TO_cnd())) {
            criteria.andCreateTimeLessThanOrEqualTo(businessCustomerParam.getCreate_time_TO_cnd());
        }
        return dcInterestCustomerMapper.selectByExample(dcInterestCustomerExample);
    }

}
