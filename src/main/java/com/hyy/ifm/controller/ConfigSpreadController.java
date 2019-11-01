package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DcConfigParam;
import com.hyy.ifm.dto.DcConfigResult;
import com.hyy.ifm.mbg.model.DcConfig;
import com.hyy.ifm.service.ConfigSpreadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 推广配置Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "ConfigSpreadController", description = "推广配置")
@RequestMapping("/spreadConfig")
public class ConfigSpreadController {
    @Autowired
    private ConfigSpreadService configSpreadService;

    @ApiOperation("推广配置列表")
    @RequestMapping(value = "/qrySpreadConfigList", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('spreadConfig:read')")
    public CommonResult<CommonPage<DcConfigResult>> qrySpreadConfigList(DcConfigParam dcConfigParam,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DcConfigResult> dcConfig = configSpreadService.qrySpreadConfigList(dcConfigParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dcConfig));
    }

    @ApiOperation("导出推广配置列表")
    @RequestMapping(value = "/exportDictConfigList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<DcConfigResult>> exportDictConfigList(DcConfigParam dcConfigParam) {
        List<DcConfigResult> dcConfig = configSpreadService.exportSpreadConfigList(dcConfigParam);
        return CommonResult.success(dcConfig);
    }

    @ApiOperation("保存推广配置")
    @RequestMapping(value = "/saveSpreadConfig", method = RequestMethod.POST)
    @ResponseBody
//    @PreAuthorize("hasAuthority('config:create')")
    public CommonResult saveSpreadConfig(@RequestBody DcConfig dcConfig, BindingResult bindingResult) {
        return configSpreadService.saveSpreadConfig(dcConfig);
    }

    @ApiOperation("根据id获取推广配置")
    @RequestMapping(value = "/qrySpreadConfigById/{id}", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('spreadConfig:read')")
    public CommonResult<DcConfig> qrySpreadConfigById(@PathVariable Integer id) {
        DcConfig dcConfig = configSpreadService.qrySpreadConfigById(id);
        return CommonResult.success(dcConfig);
    }

    @ApiOperation("修改推广配置状态")
    @RequestMapping(value = "/updateSpreadConfig", method = RequestMethod.POST)
    @ResponseBody
//    @PreAuthorize("hasAuthority('config:update')")
    public CommonResult updateSpreadConfig(@RequestParam("id") Integer id, @RequestParam("status") String status) {
        return configSpreadService.updateSpreadConfig(id, status);
    }

}
