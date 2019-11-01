package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DataReportParam;
import com.hyy.ifm.service.DataReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 财务统计Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "DataReportController", description = "财务统计")
@RequestMapping("/dataReport")
public class DataReportController {
    @Autowired
    private DataReportService dataReportService;

    @ApiOperation("财务统计报表")
    @RequestMapping(value = "/qryDataFinanceReportList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String, Object>>> qryDataFinanceReportList(DataReportParam dataSourceParam, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        CommonPage<Map<String, Object>> customer = dataReportService.qryDataFinanceReportList(dataSourceParam, pageSize, pageNum);
        return CommonResult.success(customer);
    }

}
