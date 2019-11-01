package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.mbg.model.IfmSysMuen;
import com.hyy.ifm.service.MuenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 菜单项管理
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "MeunController", description = "菜单项管理")
@RequestMapping("/meun")
public class MuenController {
    @Autowired
    private MuenService muenService;

    @ApiOperation(value = "查询所有的菜单")
    @RequestMapping(value = "/qryAllMeuns", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult qryAllMeuns() {
        List<Map<String, String>> user = muenService.qryAllMeuns();
        return CommonResult.success(user);
    }

    @ApiOperation("保存更新菜单")
    @RequestMapping(value = "/saveMuen", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveMuen(@RequestBody IfmSysMuen ifmSysMuen) {
        return muenService.saveMuen(ifmSysMuen);
    }

    @ApiOperation("根据id查询菜单")
    @RequestMapping(value = "/qryMeun/{meunId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Map<String, String>> qryMeun(@PathVariable Integer meunId) {
        Map<String, String> dcProduct = muenService.qryMeun(meunId);
        return CommonResult.success(dcProduct);
    }

    @ApiOperation("删除菜单")
    @RequestMapping(value = "/deleteMuen", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteMuen(@RequestParam("meunId") Integer id) {
        int count = muenService.deleteMuen(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

}
