package com.hyy.ifm.dao;

import com.hyy.ifm.dto.DcProductParam;
import com.hyy.ifm.mbg.model.DcProduct;

import java.util.List;
import java.util.Map;


/**
 * 商品自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface DcProductDao {
    /**
     * 获取商品列表
     */
    List<Map<String, Object>> qryProductList(DcProductParam dcProductParam);

    /**
     * 查询产品公司名称
     */
    List<Map<String, Object>> qryProductCompanyAll();

    /**
     * 查询未删除的商品
     * @return
     */
    List<DcProduct> qryProductListWithOutDelete();
}
