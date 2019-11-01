package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmSysSession;
import com.hyy.ifm.mbg.model.IfmSysSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfmSysSessionMapper {
    int countByExample(IfmSysSessionExample example);

    int deleteByExample(IfmSysSessionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfmSysSession record);

    int insertSelective(IfmSysSession record);

    List<IfmSysSession> selectByExample(IfmSysSessionExample example);

    IfmSysSession selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfmSysSession record, @Param("example") IfmSysSessionExample example);

    int updateByExample(@Param("record") IfmSysSession record, @Param("example") IfmSysSessionExample example);

    int updateByPrimaryKeySelective(IfmSysSession record);

    int updateByPrimaryKey(IfmSysSession record);
}