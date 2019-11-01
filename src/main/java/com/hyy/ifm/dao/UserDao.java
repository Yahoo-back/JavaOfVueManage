package com.hyy.ifm.dao;

import com.hyy.ifm.dto.DcProductParam;
import com.hyy.ifm.dto.DcProductResult;
import com.hyy.ifm.dto.UserManageParam;

import java.util.List;
import java.util.Map;


/**
 * 用戶自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface UserDao {
    /**
     * 获取商品列表
     */
    List<DcProductResult> qryProductList(DcProductParam dcProductParam);

    /**
     * 查询产品公司名称
     */
    List<Map<String, Object>> qryUserListByType(UserManageParam qudao);

    /**
     * 用户登录信息
     */
    List<Map<String, Object>> qryUserlogin(Integer id);

    /**
     * 用户最近七天登录
     */
    List<Map<String, Object>> qryDataEchartsLogin(Integer id, String condition);
}
