package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClYoudunModelLog;
import com.hyy.ifm.mbg.model.ClYoudunModelLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClYoudunModelLogMapper {
    int countByExample(ClYoudunModelLogExample example);

    int deleteByExample(ClYoudunModelLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClYoudunModelLog record);

    int insertSelective(ClYoudunModelLog record);

    List<ClYoudunModelLog> selectByExampleWithBLOBs(ClYoudunModelLogExample example);

    List<ClYoudunModelLog> selectByExample(ClYoudunModelLogExample example);

    ClYoudunModelLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClYoudunModelLog record, @Param("example") ClYoudunModelLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ClYoudunModelLog record, @Param("example") ClYoudunModelLogExample example);

    int updateByExample(@Param("record") ClYoudunModelLog record, @Param("example") ClYoudunModelLogExample example);

    int updateByPrimaryKeySelective(ClYoudunModelLog record);

    int updateByPrimaryKeyWithBLOBs(ClYoudunModelLog record);

    int updateByPrimaryKey(ClYoudunModelLog record);
}