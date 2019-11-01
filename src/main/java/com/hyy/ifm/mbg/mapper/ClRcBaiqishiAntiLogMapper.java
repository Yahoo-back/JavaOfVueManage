package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClRcBaiqishiAntiLog;
import com.hyy.ifm.mbg.model.ClRcBaiqishiAntiLogExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClRcBaiqishiAntiLogMapper {
    int countByExample(ClRcBaiqishiAntiLogExample example);

    int deleteByExample(ClRcBaiqishiAntiLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClRcBaiqishiAntiLog record);

    int insertSelective(ClRcBaiqishiAntiLog record);

    List<ClRcBaiqishiAntiLog> selectByExampleWithBLOBs(ClRcBaiqishiAntiLogExample example);

    List<ClRcBaiqishiAntiLog> selectByExample(ClRcBaiqishiAntiLogExample example);

    ClRcBaiqishiAntiLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClRcBaiqishiAntiLog record, @Param("example") ClRcBaiqishiAntiLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ClRcBaiqishiAntiLog record, @Param("example") ClRcBaiqishiAntiLogExample example);

    int updateByExample(@Param("record") ClRcBaiqishiAntiLog record, @Param("example") ClRcBaiqishiAntiLogExample example);

    int updateByPrimaryKeySelective(ClRcBaiqishiAntiLog record);

    int updateByPrimaryKeyWithBLOBs(ClRcBaiqishiAntiLog record);

    int updateByPrimaryKey(ClRcBaiqishiAntiLog record);
}