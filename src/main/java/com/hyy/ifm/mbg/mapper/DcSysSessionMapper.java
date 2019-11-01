package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcSysSession;
import com.hyy.ifm.mbg.model.DcSysSessionExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcSysSessionMapper {
    int countByExample(DcSysSessionExample example);

    int deleteByExample(DcSysSessionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcSysSession record);

    int insertSelective(DcSysSession record);

    List<DcSysSession> selectByExample(DcSysSessionExample example);

    DcSysSession selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcSysSession record, @Param("example") DcSysSessionExample example);

    int updateByExample(@Param("record") DcSysSession record, @Param("example") DcSysSessionExample example);

    int updateByPrimaryKeySelective(DcSysSession record);

    int updateByPrimaryKey(DcSysSession record);
}