package com.hyy.ifm.dao;

import com.hyy.ifm.dto.DataReportParam;

import java.util.List;
import java.util.Map;


/**
 * 点击来源自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface DataClannelDao {
    /**
     * 根据渠道已支付金额
     */
    Map<String, Object> findWithholdPayBySource(DataReportParam dataSourceParam);

    /**
     * 根据渠道查询点击Cpa数
     * @param
     * @return
     */
    List<Map<String, Object>> findClickCpaPayBySource(DataReportParam dataSourceParam);

    /**
     * 渠道订单数
     */
    List<Map<String, Object>> findUserBySource(DataReportParam dataSourceParam);

    /**
     * 根据渠道查询支付Cpa支付金额
     * @param
     * @return
     */
    Map<String, Object> findPayCpaPayBySource(DataReportParam dataSourceParam);

    List<Map<String, Object>> fetchOpenLogin(Integer userCode);
}
