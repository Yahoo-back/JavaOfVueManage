package com.hyy.ifm.dao;

import com.hyy.ifm.dto.DataSourceChartParam;
import com.hyy.ifm.dto.DataSourceParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 点击来源自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface DataSourceDao {
    /**
     * 查询来源
     */
    List<Map<String, Object>> qrySourceAll();

    /**
     * 统计注册数和uv数
     */
    Map<String, Object> qryRegisterAndUvCount(DataSourceParam dataSourceParam);

    List<Map<String, Object>> qryDataRoorList(@Param("item")DataSourceParam dataSourceParam,@Param("condition2") String condition2,@Param("condition3") String condition3);

    List<Map<String, Object>> qryDataRoorList1(@Param("item")DataSourceParam dataSourceParam, @Param("condition3")String condition3);

    /**
     * 统计图
     */
    List<Map<String, Object>> qryDataEchartsSourceBySource(@Param("item") DataSourceChartParam dcProductParam, @Param("condition")String condition);

    /**
     * 列表
     * @param
     * @return
     */
    List<Map<String, Object>> qryQuDaoSl(String source);

    List<Map<String, Object>> qryDataSumList(String userCode, String startTime, String endTime);

    /**
     * 放款数
     */
    List<Map<String, Object>> qryQuDaoLoan(String userCode, String startTime, String endTime);

    /**
     * 放款数
     */
    List<Map<String, Object>> qryQuDaoSlAllSource(@Param("item")DataSourceParam dataSourceParam,@Param("userId")Integer userId);

    /**
     * 查询产品当日点击次数
     * @param id
     * @return
     */
    Map<String, Object> countDayOfVisitCountByProduct(int id);
}
