package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmSysLogin;
import com.hyy.ifm.mbg.model.IfmSysLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfmSysLoginMapper {
    int countByExample(IfmSysLoginExample example);

    int deleteByExample(IfmSysLoginExample example);

    int deleteByPrimaryKey(Integer lgnid);

    int insert(IfmSysLogin record);

    int insertSelective(IfmSysLogin record);

    List<IfmSysLogin> selectByExample(IfmSysLoginExample example);

    IfmSysLogin selectByPrimaryKey(Integer lgnid);

    int updateByExampleSelective(@Param("record") IfmSysLogin record, @Param("example") IfmSysLoginExample example);

    int updateByExample(@Param("record") IfmSysLogin record, @Param("example") IfmSysLoginExample example);

    int updateByPrimaryKeySelective(IfmSysLogin record);

    int updateByPrimaryKey(IfmSysLogin record);
}