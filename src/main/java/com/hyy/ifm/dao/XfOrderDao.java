package com.hyy.ifm.dao;

import com.hyy.ifm.mbg.model.XfOrder;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface XfOrderDao {

    XfOrder selectByRequestNo(String requestNo);

    /**
     * 根据表名查询表数量
     * @param tableName
     * @return
     */
    int countTable(String tableName);

    /**
     * 根据表名创建表
     * @param tableName
     */
    void createTable(@Param("tableName") String tableName);

    /**
     * (分表)新增
     * @param tableName
     * @param xfOrder
     * @return
     */
    int saveShard(@Param("tableName") String tableName, @Param("item") XfOrder xfOrder);

    /**
     * 根据参数(分表)查询
     * @param tableName
     * @param params
     * @return
     */
    XfOrder selectLastByUserIdAndTypeAndOuterId(
            @Param("tableName") String tableName,
            @Param("params") Map<String, Object> params);

}
