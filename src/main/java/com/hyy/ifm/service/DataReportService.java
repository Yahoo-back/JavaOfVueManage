package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.dto.DataReportParam;

import java.util.Map;

/**
 * 财务统计Service
 * Created by macro on 2019/08/29.
 */
public interface DataReportService {

    /**
     * 财务统计报表
     */
    CommonPage<Map<String, Object>> qryDataFinanceReportList(DataReportParam dataSourceParam, Integer pageSize, Integer pageNum);


}
