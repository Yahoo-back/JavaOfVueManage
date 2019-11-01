package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.CustomerModifyParam;
import com.hyy.ifm.dto.CustomerParam;
import com.hyy.ifm.dto.CustomerPayParam;
import com.hyy.ifm.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 客户列表Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "CustomerController", description = "客户列表")
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @ApiOperation("获取客户列表")
    @RequestMapping(value = "/qryCustomerList", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('product:read')")
    public CommonResult<CommonPage<Map<String, Object>>> qryCustomerList(CustomerParam customerParam,
                                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String, Object>> customer = customerService.qryCustomerList(customerParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(customer));
    }

    @ApiOperation("客户扣费汇总")
    @RequestMapping(value = "/qryCustomerMoneyAll", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<Map<String, Object>>> qryCustomerMoneyAll(CustomerParam customerParam) {
        List<Map<String, Object>> customer = customerService.qryCustomerMoneyAll(customerParam);
        return CommonResult.success(customer);
    }

    @ApiOperation("导出商品列表")
    @RequestMapping(value = "/exportCustomerList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Map<String, Object>>> exportCustomerList(CustomerParam dcProductParam) {
        List<Map<String, Object>> customer = customerService.exportCustomerList(dcProductParam);
        return CommonResult.success(customer);
    }

    @ApiOperation("获取客户支付列表")
    @RequestMapping(value = "/qryCustomerMoneyAllSys", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<Map<String, Object>>> qryCustomerMoneyAllSys(CustomerPayParam customerParam,
                                                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        CommonPage<Map<String, Object>> customer = customerService.qryCustomerMoneyAllSys(customerParam, pageSize, pageNum);
        return CommonResult.success(customer);
    }


    @ApiOperation("根据id查询客户")
    @RequestMapping(value = "/qryCustomerById/{id}", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('product:read')")
    public CommonResult qryCustomerById(@PathVariable Integer id) {
        Map<String,Object> customer = customerService.qryCustomerById(id);
        return CommonResult.success(customer);
    }

    @ApiOperation("更新用户")
    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateCustomer(@RequestParam("id") Integer id, @RequestParam("status") String status) {
        return customerService.updateCustomer(id, status);
    }

    @ApiOperation("根据id修改客户")
    @RequestMapping(value = "/updateCustomerById", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateCustomerById(@RequestBody CustomerModifyParam user) {
        return customerService.updateCustomerById(user);
    }
}
