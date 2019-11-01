package com.hyy.ifm.controller;

import com.github.pagehelper.util.StringUtil;
import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.DateUtil;
import com.hyy.ifm.dto.DataSourceChartParam;
import com.hyy.ifm.dto.DataSourceParam;
import com.hyy.ifm.service.DataSourceService;
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
 * 点击来源数据统计Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "DataSourceController", description = "点击来源数据统计")
@RequestMapping("/dataSource")
public class DataSourceController {
    @Autowired
    private DataSourceService dataSourceService;

    @ApiOperation("查询所有来源")
    @RequestMapping(value = "/qrySourceAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Map<String, Object>>> qrySourceAll() {
        List<Map<String, Object>> customer = dataSourceService.qrySourceAll();
        return CommonResult.success(customer);
    }

    @ApiOperation("点击来源数据统计")
    @RequestMapping(value = "/qryDataSourceList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String, Object>>> qryDataSourceList(DataSourceParam dataSourceParam,
                                                                            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String, Object>> customer = dataSourceService.qryDataSourceList(dataSourceParam,pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(customer));
    }

    @ApiOperation("点击来源数据统计")
    @RequestMapping(value = "/qryDataSourceSum", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Map<String, Object>>> qryDataSourceSum(DataSourceParam dataSourceParam) {
        List<Map<String, Object>> customer = dataSourceService.qryDataSourceSum(dataSourceParam);
        return CommonResult.success(customer);
    }

    @ApiOperation("统计图")
    @RequestMapping(value = "/qryDataEchartsSourceBySource", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Map<String, Object>>> qryDataEchartsSourceBySource(DataSourceChartParam dataSourceParam) {
        if(StringUtil.isNotEmpty(dataSourceParam.getDaysFrom()) && StringUtil.isNotEmpty(dataSourceParam.getDaysTo())) {
            if(DateUtil.StringToDate(dataSourceParam.getDaysTo() + ":00:00").getTime() < DateUtil.StringToDate(dataSourceParam.getDaysFrom() + ":00:00").getTime()) {
                return CommonResult.failed("起始时间不能小于终止时间");
            }
        }
        List<Map<String, Object>> customer = dataSourceService.qryDataEchartsSourceBySource(dataSourceParam);
        return CommonResult.success(customer);
    }

}
