package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DataSourceParam;
import com.hyy.ifm.dto.QudaoParam;
import com.hyy.ifm.dto.QudaoSlParam;
import com.hyy.ifm.dto.UserManageParam;
import com.hyy.ifm.service.DataReportService;
import com.hyy.ifm.service.DataSourceService;
import com.hyy.ifm.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 渠道管理Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "QudaoController", description = "渠道管理")
@RequestMapping("/qudao")
public class QudaoController {
    @Autowired
    private UserService userService;
    @Autowired
    private DataSourceService dataSourceService;
    @Autowired
    private DataReportService dataReportService;

    @ApiOperation("查询所有渠道员工")
    @RequestMapping(value = "/qryUserListByType", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> qryUserListByType(UserManageParam qudao,
                                                                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String,Object>> product = userService.qryUserListByType(qudao, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("保存或更新渠道")
    @RequestMapping(value = "/saveUserQudao", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveUserQudao(@RequestBody QudaoParam slQdao, BindingResult bindingResult) {
        return userService.saveUserQudao(slQdao);
    }

    @ApiOperation("渠道统计-点击来源数据统计")
    @RequestMapping(value = "/qryQuDaoDataSourceSum", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult qryQuDaoDataSourceSum(DataSourceParam qudao) {
        List<Map<String,Object>> product = dataSourceService.qryQuDaoDataSourceSum(qudao);
        return CommonResult.success(product);
    }

    @ApiOperation("渠道统计-点击来源数据统计")
    @RequestMapping(value = "/qryQuDaoDataSourceList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> qryQuDaoDataSourceList(DataSourceParam qudao,
                                                                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String,Object>> product = dataSourceService.qryQuDaoDataSourceList(qudao, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("渠道缩量-列表")
    @RequestMapping(value = "/qryQuDaoSl", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> qryQuDaoSl(DataSourceParam qudao,
                                                                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                               @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String,Object>> product = dataSourceService.qryQuDaoSl(qudao, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("根据id获取渠道")
    @RequestMapping(value = "/qrySourceByLgnId/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Map<String, Object>> qrySourceByLgnId(@PathVariable Integer id) {
        Map<String, Object> dcProduct = dataSourceService.qrySourceByLgnId(id);
        return CommonResult.success(dcProduct);
    }

    @ApiOperation("保存或更新渠道缩量")
    @RequestMapping(value = "/saveQdaoSlList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveQdaoSlList(@RequestBody QudaoSlParam slQdao, BindingResult bindingResult) {
        return dataSourceService.saveQdaoSlList(slQdao);
    }

    @ApiOperation("我的渠道统计")
    @RequestMapping(value = "/qryMyChannelList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> qryMyChannelList(DataSourceParam qudao,
                                                                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        CommonPage<Map<String, Object>> product = dataSourceService.qryMyChannelList(qudao, pageSize, pageNum);
        return CommonResult.success(product);
    }
}

