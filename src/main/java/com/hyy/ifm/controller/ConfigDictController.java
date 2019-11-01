package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DcDictParam;
import com.hyy.ifm.mbg.model.DcDict;
import com.hyy.ifm.service.ConfigDictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 业务配置Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "ConfigDictController", description = "业务配置")
@RequestMapping("/dictConfig")
public class ConfigDictController {
    @Autowired
    private ConfigDictService configDictService;

    @ApiOperation("根据data_type查询字段表")
    @RequestMapping(value = "/qryDictByDataType", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<DcDict>> qryDictByDataType(@RequestParam("data_type") String data_type) {
        List<DcDict> dcDict = configDictService.qryDictByDataType(data_type);
        return CommonResult.success(dcDict);
    }

    @ApiOperation("业务配置列表")
    @RequestMapping(value = "/qryDictConfigList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DcDict>> qryDictConfigList(DcDictParam dcDictParam,
                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DcDict> dcDict = configDictService.qryDictConfigList(dcDictParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dcDict));
    }

    @ApiOperation("导出业务配置列表")
    @RequestMapping(value = "/exportDictConfigList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<DcDict>> exportDictConfigList(DcDictParam dcDictParam) {
        List<DcDict> dcDict = configDictService.exportDictConfigList(dcDictParam);
        return CommonResult.success(dcDict);
    }

    @ApiOperation("保存业务配置")
    @RequestMapping(value = "/saveConfigDict", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveConfigDict(@RequestBody DcDict dcDict, BindingResult bindingResult) {
        return configDictService.saveConfigDict(dcDict);
    }

    @ApiOperation("业务配置-保存业务配置")
    @RequestMapping(value = "/saveConfig", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveConfig(@RequestBody DcDict dcDict, BindingResult bindingResult) {
        return configDictService.saveConfig(dcDict);
    }

    @ApiOperation("根据id获取业务配置")
    @RequestMapping(value = "/qryDictById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<DcDict> qryDictById(@PathVariable Integer id) {
        DcDict dcDict = configDictService.qryDictById(id);
        return CommonResult.success(dcDict);
    }

    @ApiOperation("业务配置-配置参数")
    @RequestMapping(value = "/qryDictByShow", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<DcDict>> qryDictByShow() {
        List<DcDict> dcDict = configDictService.qryDictByDataShow();
        return CommonResult.success(dcDict);
    }

    @ApiOperation("修改业务配置状态")
    @RequestMapping(value = "/updateConfigDict", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateConfigDict(@RequestParam("id") Integer id, @RequestParam("status") String status) {
        return configDictService.updateConfigDict(id, status);
    }

}
