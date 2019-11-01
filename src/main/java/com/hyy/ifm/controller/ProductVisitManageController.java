package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DcProductVisitManageParam;
import com.hyy.ifm.dto.DcProductVisitManageResult;
import com.hyy.ifm.mbg.model.DcProductVisitManage;
import com.hyy.ifm.service.ProductVisitManageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 商品访问管理Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "ProductVisitManageController", description = "商品访问管理")
@RequestMapping("/productVisitManage")
public class ProductVisitManageController {
    @Autowired
    private ProductVisitManageService productVisitManageService;

    @ApiOperation("获取商品访问管理列表")
    @RequestMapping(value = "/qryProductVisitManageList", method = RequestMethod.GET)
    @ResponseBody
//    @PreAuthorize("hasAuthority('productVisitManage:read')")
    public CommonResult<CommonPage<DcProductVisitManageResult>> qryProductVisitManageList(DcProductVisitManageParam dcProductVisitManageParam,
                                                                                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DcProductVisitManageResult> product = productVisitManageService.qryProductVisitManageList(dcProductVisitManageParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("保存商品")
    @RequestMapping(value = "/saveProductVisitManage", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult savePrductVisitManage(@RequestBody DcProductVisitManage dcProductVisitManage, BindingResult bindingResult) {
        int count = productVisitManageService.saveProductVisitManage(dcProductVisitManage);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据id获取商品")
    @RequestMapping(value = "/qryProductVisitManageById/{id}", method = RequestMethod.GET)
    @ResponseBody
//    @PreAuthorize("hasAuthority('productVisitManage:read')")
    public CommonResult<DcProductVisitManage> qryProductVisitManageById(@PathVariable Integer id) {
        DcProductVisitManage dcProductVisitManage = productVisitManageService.qryProductVisitManageById(id);
        return CommonResult.success(dcProductVisitManage);
    }

    @ApiOperation("查询商品当天访问数")
    @RequestMapping(value = "/qryProductVisitCount/{id}", method = RequestMethod.GET)
    @ResponseBody
//    @PreAuthorize("hasAuthority('productVisitManage:read')")
    public CommonResult qryProductVisitCount(@PathVariable Integer id) {
        Map<String, Object> count = productVisitManageService.qryProductVisitCount(id);
        return CommonResult.success(count);
    }

    @ApiOperation("修改商品访问管理状态")
    @RequestMapping(value = "/updateProductVisitManage", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateProductVisitManage(@RequestParam("id") Integer id, @RequestParam("status") String status) {
        return productVisitManageService.updateProductVisitManage(id, status);
    }

    @ApiOperation("查询所有商品列表不包括删除和已管理的")
    @RequestMapping(value = "/qryVisitProductListAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Map<String, Object>>> qryVisitProductListAll() {
        List<Map<String, Object>> product = productVisitManageService.qryVisitProductListAll();
        return CommonResult.success(product);
    }
}
