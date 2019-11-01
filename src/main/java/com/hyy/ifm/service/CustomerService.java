package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.CustomerModifyParam;
import com.hyy.ifm.dto.CustomerParam;
import com.hyy.ifm.dto.CustomerPayParam;

import java.util.List;
import java.util.Map;

/**
 * 客户列表Service
 * Created by macro on 2019/08/29.
 */
public interface CustomerService {

    /**
     * 列表
     */
    List<Map<String, Object>> qryCustomerList(CustomerParam customerParam, Integer pageSize, Integer pageNum);

    /**
     * 客户扣费汇总
     */
    List<Map<String, Object>> qryCustomerMoneyAll(CustomerParam customerParam);

    /**
     * 客户扣费汇总
     */
    CommonPage<Map<String, Object>> qryCustomerMoneyAllSys(CustomerPayParam customerParam, Integer pageSize, Integer pageNum);

    /**
     * 导出
     */
    List<Map<String, Object>> exportCustomerList(CustomerParam customerParam);

    /**
     * 根据id查询
     */
    Map<String,Object> qryCustomerById(Integer id);

    /**
     * 更新用户
     */
    CommonResult updateCustomer(Integer id, String status);

    /**
     * 根据id修改客户
     */
    CommonResult updateCustomerById(CustomerModifyParam user);
}
