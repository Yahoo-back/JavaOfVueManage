package com.hyy.ifm.dao;

import com.hyy.ifm.dto.CustomerParam;
import com.hyy.ifm.dto.CustomerStatisticsParam;
import com.hyy.ifm.dto.RefundMailParam;
import com.hyy.ifm.dto.RefundParam;
import com.hyy.ifm.mbg.model.UserOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 客户列表自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface CustomerDao {
    /**
     * 获取商品列表
     */
    List<Map<String, Object>> qryCustomerListNone(CustomerParam customerParam);

    /**
     * 客户列表
     */
    List<Map<String, Object>> qryCustomerList(CustomerParam customerParam);

    /**
     * 导出客户列表
     */
    List<Map<String, Object>> exportCustomerList(CustomerParam customerParam);

    /**
     * 客户扣费汇总
     */
    List<Map<String, Object>> qryCustomerMoneyAll(CustomerParam customerParam);

    List<Map<String, Object>> qryPayAmt(@Param("item")CustomerParam customerParam, @Param("tableName")String table);

    /**
     * 渠道名
     */
    Map<String,Object> qrySysNameAllMoney(String source);

    Map<String,Object> qryCustomerById(Integer id);

    /**
     * 客户列表数目
     */
    int countCustomerList(CustomerParam customerParam);

    int countCustomerListNone(CustomerParam customerParam);

    /**
     * 查看申请退款
     */
    List<Map<String,Object>> qryRefund(RefundParam param);

    /**
     * 查看我的申请退款
     */
    List<Map<String,Object>> qryMyRefund(@Param("item") RefundParam param, @Param("sysUserId")Integer sysUserId);

    /**
     * 退款列表
     */
    List<Map<String,Object>> qryRefundList(RefundParam param);

    /**
     * 客服业绩统计
     */
    List<Map<String,Object>> listStatistics(CustomerStatisticsParam param);

    /**
     * 邮件退款列表
     */
    List<Map<String,Object>> mailRefundList(RefundMailParam param);

    /**
     * 根据用户id查询附件

     * @return
     */
    List<UserOrder> qryUserOrderByStatus();
}
