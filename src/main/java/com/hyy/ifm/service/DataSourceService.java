package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DataSourceChartParam;
import com.hyy.ifm.dto.DataSourceParam;
import com.hyy.ifm.dto.QudaoSlParam;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 点击来源Service
 * Created by macro on 2019/08/29.
 */
public interface DataSourceService {

    /**
     * 查询所有来源
     */
    List<Map<String, Object>> qrySourceAll();

    /**
     * 点击来源数据统计
     */
    List<Map<String, Object>> qryDataSourceSum(DataSourceParam dataSourceParam);

    /**
     * 点击来源数据统计
     */
    List<Map<String, Object>> qryDataSourceList(DataSourceParam dataSourceParam,Integer pageSize,Integer pageNum);

    /**
     * 统计图
     */
    List<Map<String, Object>> qryDataEchartsSourceBySource(DataSourceChartParam dataSourceParam);

    /**
     * 渠道统计-点击来源数据统计
     */
    List<Map<String, Object>> qryQuDaoDataSourceSum(DataSourceParam dataSourceParam);

    /**
     * 渠道统计-点击来源数据统计
     */
    List<Map<String, Object>> qryQuDaoDataSourceList(DataSourceParam dataSourceParam, Integer pageSize, Integer pageNum);

    /**
     * 渠道缩量-列表
     */
    List<Map<String, Object>> qryQuDaoSl(DataSourceParam dataSourceParam, Integer pageSize, Integer pageNum);

    /**
     * 根据id查询
     */
    Map<String, Object> qrySourceByLgnId(Integer id);

    /**
     * 保存
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    CommonResult saveQdaoSlList(QudaoSlParam slQdao);

    /**
     * 我的渠道统计
     */
    CommonPage<Map<String, Object>> qryMyChannelList(DataSourceParam dataSourceParam, Integer pageSize, Integer pageNum);
}
