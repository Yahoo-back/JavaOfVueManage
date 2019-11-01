package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClRcAfublackLog;
import com.hyy.ifm.mbg.model.ClRcAfublackLogExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClRcAfublackLogMapper {
    int countByExample(ClRcAfublackLogExample example);

    int deleteByExample(ClRcAfublackLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClRcAfublackLog record);

    int insertSelective(ClRcAfublackLog record);

    List<ClRcAfublackLog> selectByExampleWithBLOBs(ClRcAfublackLogExample example);

    List<ClRcAfublackLog> selectByExample(ClRcAfublackLogExample example);

    ClRcAfublackLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClRcAfublackLog record, @Param("example") ClRcAfublackLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ClRcAfublackLog record, @Param("example") ClRcAfublackLogExample example);

    int updateByExample(@Param("record") ClRcAfublackLog record, @Param("example") ClRcAfublackLogExample example);

    int updateByPrimaryKeySelective(ClRcAfublackLog record);

    int updateByPrimaryKeyWithBLOBs(ClRcAfublackLog record);

    int updateByPrimaryKey(ClRcAfublackLog record);
}