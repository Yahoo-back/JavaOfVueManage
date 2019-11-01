package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.CustomerStatisticsParam;
import com.hyy.ifm.dto.RefundMailParam;
import com.hyy.ifm.dto.RefundParam;
import com.hyy.ifm.dto.RefundSaveParam;
import com.hyy.ifm.service.RefundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 客诉模块Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "RefundController", description = "客诉模块")
@RequestMapping("/refund")
public class RefundController {
    @Autowired
    private RefundService refundService;

    @ApiOperation("客户列表")
    @RequestMapping(value = "/qryRefund", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> qryRefund(RefundParam param,
                                                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String,Object>> product = refundService.qryRefund(param, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("根据id查询客户")
    @RequestMapping(value = "/qryRefundAttachById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Map<String,Object>> qryRefundAttachById(@PathVariable Integer id) {
        Map<String,Object> dcProduct = refundService.qryRefundAttachById(id);
        return CommonResult.success(dcProduct);
    }

    @ApiOperation("跟单")
    @RequestMapping(value = "/updateOrderAuditStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateOrderAuditStatus(@RequestParam("id") Integer id, @RequestParam("status") String status) {
        return refundService.updateOrderAuditStatus(id, status);
    }

    @ApiOperation("我的客户列表")
    @RequestMapping(value = "/qryMyRefund", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> qryMyRefund(RefundParam param,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String,Object>> product = refundService.qryMyRefund(param, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("我的客户列表-退款/驳回")
    @RequestMapping(value = "/saveRefund", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveRefund(@RequestBody RefundSaveParam saveRefundParam) {
        int count = refundService.saveRefund(saveRefundParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("退款列表")
    @RequestMapping(value = "/qryRefundList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> qryRefundList(RefundParam param,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String,Object>> product = refundService.qryRefundList(param, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("客服业绩统计")
    @RequestMapping(value = "/listStatistics", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> listStatistics(CustomerStatisticsParam param,
                                                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String,Object>> product = refundService.listStatistics(param, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("邮件退款列表")
    @RequestMapping(value = "/mailRefundList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> mailRefundList(RefundMailParam param,
                                                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String,Object>> product = refundService.mailRefundList(param, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }
}
