package com.hyy.ifm.controller;

import com.github.pagehelper.util.StringUtil;
import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.DateUtil;
import com.hyy.ifm.dto.DataProductChartParam;
import com.hyy.ifm.dto.DataProductParam;
import com.hyy.ifm.service.DataProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 产品访问统计Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "DataProductController", description = "产品访问统计")
@RequestMapping("/dataProduct")
public class DataProductController {
    @Autowired
    private DataProductService dataProductService;

    @ApiOperation("产品访问数据统计列表")
    @RequestMapping(value = "/qryDataProductListBy1", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String, Object>>> qryDataProductListBy1(DataProductParam dcProductParam,
                                                                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String, Object>> product = dataProductService.qryDataProductListBy1(dcProductParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("产品访问数据统计列表")
    @RequestMapping(value = "/qryDataProductListBy2", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String, Object>>> qryDataProductListBy2(DataProductParam dcProductParam,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String, Object>> product = dataProductService.qryDataProductListBy2(dcProductParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("导出产品访问数据统计列表")
    @RequestMapping(value = "/exportDataProductList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Map<String, Object>>> exportDataProductList(DataProductParam dcProductParam) {
        List<Map<String, Object>> dcProduct = dataProductService.exportDataProductList(dcProductParam);
        return CommonResult.success(dcProduct);
    }

    @ApiOperation("根据id查询产品列表数据")
    @RequestMapping(value = "/qryDataEchartsProductById", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult qryDataEchartsProductById(DataProductChartParam dcProductParam) {
        if(StringUtil.isEmpty(dcProductParam.getDaysFrom()) && StringUtil.isEmpty(dcProductParam.getDaysTo())) {
            if(DateUtil.StringToDate(dcProductParam.getDaysTo() + ":00:00").getTime() < DateUtil.StringToDate(dcProductParam.getDaysFrom() + ":00:00").getTime()) {
                return CommonResult.failed("起始时间不能小于终止时间");
            }
        }
        List<Map<String, Object>> product = dataProductService.qryDataEchartsProductById(dcProductParam);
        return CommonResult.success(product);
    }

}
