package com.hyy.ifm.service;

import com.hyy.ifm.dto.DataProductChartParam;
import com.hyy.ifm.dto.DataProductParam;

import java.util.List;
import java.util.Map;

/**
 * 产品访问统计Service
 * Created by macro on 2019/08/29.
 */
public interface DataProductService {

    /**
     * 列表
     */
    List<Map<String, Object>> qryDataProductListBy1(DataProductParam dcProductParam, Integer pageSize, Integer pageNum);

    /**
     * 列表
     */
    List<Map<String, Object>> qryDataProductListBy2(DataProductParam dcProductParam, Integer pageSize, Integer pageNum);

    /**
     * 导出
     */
    List<Map<String, Object>> exportDataProductList(DataProductParam dcProductParam);

    /**
     * 根据id查询产品列表数据
     */
    List<Map<String, Object>> qryDataEchartsProductById(DataProductChartParam dcProductParam);

}
