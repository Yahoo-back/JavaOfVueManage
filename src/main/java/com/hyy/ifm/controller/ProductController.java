package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DcProductParam;
import com.hyy.ifm.mbg.model.DcProduct;
import com.hyy.ifm.mbg.model.DcProductClassify;
import com.hyy.ifm.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 商品列表Controller
 * Created by macro on 2019/8/28.
 */
@Controller
@Api(tags = "ProductController", description = "商品列表")
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @ApiOperation("获取商品列表")
    @RequestMapping(value = "/qryProductList", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('product:read')")
    public CommonResult<CommonPage<Map<String, Object>>> qryProductList(DcProductParam dcProductParam,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String, Object>> product = productService.qryProductList(dcProductParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(product));
    }

    @ApiOperation("导出商品列表")
    @RequestMapping(value = "/exportProductList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Map<String, Object>>> exportProductList(DcProductParam dcProductParam) {
        List<Map<String, Object>> dcProduct = productService.exportProductList(dcProductParam);
        return CommonResult.success(dcProduct);
    }

    @ApiOperation("保存商品")
    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveProduct(@RequestBody DcProduct dcProduct, BindingResult bindingResult) {
        return productService.saveProduct(dcProduct);
    }

    @ApiOperation("根据id获取商品")
    @RequestMapping(value = "/qryProductById/{id}", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('product:read')")
    public CommonResult<DcProduct> qryProductById(@PathVariable Integer id) {
        DcProduct dcProduct = productService.qryProductById(id);
        return CommonResult.success(dcProduct);
    }

    @ApiOperation("上下架删除商品")
    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateProduct(@RequestParam("id") Integer id, @RequestParam("status") String status) {
        return productService.updateProduct(id, status);
    }

    @ApiOperation("置顶商品")
    @RequestMapping(value = "/topPosition", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult topPosition(@RequestParam("id") Integer id) {
        int count = productService.topPosition(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("置尾商品")
    @RequestMapping(value = "/basePosition", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult basePosition(@RequestParam("id") Integer id) {
        int count = productService.basePosition(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("取消置顶或置尾商品")
    @RequestMapping(value = "/cancelPosition", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult cancelPosition(@RequestParam("id") Integer id) {
        int count = productService.cancelPosition(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("查询所有商品不包括删除")
    @RequestMapping(value = "/qryProductListAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<DcProduct>> qryProductListAll() {
        List<DcProduct> dcProduct = productService.qryProductListAll();
        return CommonResult.success(dcProduct);
    }

    @ApiOperation("查询产品公司名称")
    @RequestMapping(value = "/qryProductCompanyAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Map<String, Object>>> qryProductCompanyAll() {
        List<Map<String, Object>> dcProduct = productService.qryProductCompanyAll();
        return CommonResult.success(dcProduct);
    }

    @ApiOperation("查询产品类型")
    @RequestMapping(value = "/qryProductClassifyAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<DcProductClassify>> qryProductClassifyAll() {
        List<DcProductClassify> productClassify = productService.qryProductClassifyAll();
        return CommonResult.success(productClassify);
    }
}
