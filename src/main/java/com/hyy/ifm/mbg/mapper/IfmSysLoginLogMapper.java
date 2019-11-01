package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmSysLoginLog;
import com.hyy.ifm.mbg.model.IfmSysLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfmSysLoginLogMapper {
    int countByExample(IfmSysLoginLogExample example);

    int deleteByExample(IfmSysLoginLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfmSysLoginLog record);

    int insertSelective(IfmSysLoginLog record);

    List<IfmSysLoginLog> selectByExample(IfmSysLoginLogExample example);

    IfmSysLoginLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfmSysLoginLog record, @Param("example") IfmSysLoginLogExample example);

    int updateByExample(@Param("record") IfmSysLoginLog record, @Param("example") IfmSysLoginLogExample example);

    int updateByPrimaryKeySelective(IfmSysLoginLog record);

    int updateByPrimaryKey(IfmSysLoginLog record);
}