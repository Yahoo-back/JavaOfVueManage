package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.CustomerStatisticsParam;
import com.hyy.ifm.dto.RefundMailParam;
import com.hyy.ifm.dto.RefundParam;
import com.hyy.ifm.dto.RefundSaveParam;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 客诉模块Service
 * Created by macro on 2019/08/29.
 */
public interface RefundService {

    /**
     * 列表
     */
    List<Map<String,Object>> qryRefund(RefundParam param, Integer pageSize, Integer pageNum);

    /**
     * 根据id查询客户
     */
    Map<String,Object> qryRefundAttachById(Integer id);

    /**
     * 跟单
     */
    CommonResult updateOrderAuditStatus(Integer id, String status);

    /**
     * 我的客户列表
     */
    List<Map<String,Object>> qryMyRefund(RefundParam param, Integer pageSize, Integer pageNum);

    /**
     * 保存
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int saveRefund(RefundSaveParam saveRefundParam);

    /**
     * 列表
     */
    List<Map<String,Object>> qryRefundList(RefundParam param, Integer pageSize, Integer pageNum);

    /**
     * 客服业绩统计
     */
    List<Map<String,Object>> listStatistics(CustomerStatisticsParam param, Integer pageSize, Integer pageNum);

    /**
     * 邮件退款列表
     */
    List<Map<String,Object>> mailRefundList(RefundMailParam param, Integer pageSize, Integer pageNum);
}
