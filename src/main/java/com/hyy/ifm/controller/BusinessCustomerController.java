package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.BusinessCustomerParam;
import com.hyy.ifm.mbg.model.DcInterestCustomer;
import com.hyy.ifm.service.BusinessCustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商务管理Controller
 * Created by macro on 2019/08/24.
 */
@Api(tags = "BusinessCustomerController", description = "商务管理")
@Controller
@RequestMapping("/businessCustomer")
public class BusinessCustomerController {

    @Autowired
    private BusinessCustomerService businessCustomerService;

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessCustomerController.class);

    @ApiOperation("获取商务合作列表")
    @RequestMapping(value = "/qryBusinessCustomerList", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('businessCustomer:read')")
    public CommonResult<CommonPage<DcInterestCustomer>> qryBusinessCustomerList(BusinessCustomerParam businessCustomerParam,
                                                                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DcInterestCustomer> businessCustomer = businessCustomerService.qryBusinessCustomerList(businessCustomerParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(businessCustomer));
    }


    @ApiOperation("导出商务合作列表")
    @RequestMapping(value = "/exportBusinessCustomerList", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('businessCustomer:read')")
    public CommonResult<List<DcInterestCustomer>> exportBusinessCustomerList(BusinessCustomerParam businessCustomerParam){
        List<DcInterestCustomer> businessCustomer = businessCustomerService.exportBusinessCustomerList(businessCustomerParam);
        return CommonResult.success(businessCustomer);
    }

}
