package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.HlbConfigExample;
import com.hyy.ifm.mbg.model.HlbConfig;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HlbConfigMapper {
    int countByExample(HlbConfigExample example);

    int deleteByExample(HlbConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HlbConfig record);

    int insertSelective(HlbConfig record);

    List<HlbConfig> selectByExample(HlbConfigExample example);

    HlbConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HlbConfig record, @Param("example") HlbConfigExample example);

    int updateByExample(@Param("record") HlbConfig record, @Param("example") HlbConfigExample example);

    int updateByPrimaryKeySelective(HlbConfig record);

    int updateByPrimaryKey(HlbConfig record);
}