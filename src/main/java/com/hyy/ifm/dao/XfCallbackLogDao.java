package com.hyy.ifm.dao;


import com.hyy.ifm.mbg.model.XfCallbackLog;

public interface XfCallbackLogDao {

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
    void createTable(String tableName);

    /**
     * (分表)新增
     * @param tableName
     * @param record
     * @return
     */
    void saveShard(String tableName, XfCallbackLog record);


}
