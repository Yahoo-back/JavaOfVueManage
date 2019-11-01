package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClSmsTpl;
import com.hyy.ifm.mbg.model.ClSmsTplExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClSmsTplMapper {
    int countByExample(ClSmsTplExample example);

    int deleteByExample(ClSmsTplExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClSmsTpl record);

    int insertSelective(ClSmsTpl record);

    List<ClSmsTpl> selectByExample(ClSmsTplExample example);

    ClSmsTpl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClSmsTpl record, @Param("example") ClSmsTplExample example);

    int updateByExample(@Param("record") ClSmsTpl record, @Param("example") ClSmsTplExample example);

    int updateByPrimaryKeySelective(ClSmsTpl record);

    int updateByPrimaryKey(ClSmsTpl record);
}