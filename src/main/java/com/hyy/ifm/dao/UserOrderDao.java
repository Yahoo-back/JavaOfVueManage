package com.hyy.ifm.dao;

import java.util.List;
import java.util.Map;


/**
 * 用户订单自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface UserOrderDao {
    /**
     * 获取商品列表
     */
    List<Map<String, Object>> qryLoanOrderByOrderId(Integer orderId);

}
