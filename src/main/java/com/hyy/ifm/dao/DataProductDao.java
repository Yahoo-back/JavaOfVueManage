package com.hyy.ifm.dao;

import com.hyy.ifm.dto.DataProductChartParam;
import com.hyy.ifm.dto.DataProductParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 产品访问统计自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface DataProductDao {
    /**
     * 列表
     */
    List<Map<String, Object>> qryDataProductListBy1(DataProductParam dcProductParam);

    /**
     * 列表
     */
    List<Map<String, Object>> qryDataProductListBy2(DataProductParam dcProductParam);

    /**
     * 查询产品公司名称
     */
    List<Map<String, Object>> exportDataProductList(DataProductParam dcProductParam);

    /**
     * 产品访问统计
     */
    List<Map<String, Object>> qryDataEchartsProductById(@Param("item")DataProductChartParam dcProductParam, @Param("condition")String condition);
}
