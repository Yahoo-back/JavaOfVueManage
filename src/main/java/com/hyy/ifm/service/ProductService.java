package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DcProductParam;
import com.hyy.ifm.mbg.model.DcProduct;
import com.hyy.ifm.mbg.model.DcProductClassify;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 商品管理Service
 * Created by macro on 2019/08/29.
 */
public interface ProductService {

    /**
     * 列表
     */
    List<Map<String, Object>> qryProductList(DcProductParam dcProductParam, Integer pageSize, Integer pageNum);

    /**
     * 导出
     */
    List<Map<String, Object>> exportProductList(DcProductParam dcProductParam);

    /**
     * 保存
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    CommonResult saveProduct(DcProduct dcProduct);

    /**
     * 根据id查询
     */
    DcProduct qryProductById(Integer id);

    /**
     * 上下架删除商品
     */
    CommonResult updateProduct(Integer id, String status);

    /**
     * 置顶商品
     */
    int topPosition(Integer id);

    /**
     * 置尾商品
     */
    int basePosition(Integer id);

    /**
     * 取消置顶或置尾商品
     */
    int cancelPosition(Integer id);

    /**
     * 查询所有商品列表不包括删除
     */
    List<DcProduct> qryProductListAll();

    /**
     * 查询产品公司名称
     */
    List<Map<String, Object>> qryProductCompanyAll();

    /**
     * 查询产品类型
     */
    List<DcProductClassify> qryProductClassifyAll();
}
