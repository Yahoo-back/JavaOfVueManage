package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.YoudunConfig;
import com.hyy.ifm.mbg.model.YoudunConfigExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YoudunConfigMapper {
    int countByExample(YoudunConfigExample example);

    int deleteByExample(YoudunConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YoudunConfig record);

    int insertSelective(YoudunConfig record);

    List<YoudunConfig> selectByExample(YoudunConfigExample example);

    YoudunConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YoudunConfig record, @Param("example") YoudunConfigExample example);

    int updateByExample(@Param("record") YoudunConfig record, @Param("example") YoudunConfigExample example);

    int updateByPrimaryKeySelective(YoudunConfig record);

    int updateByPrimaryKey(YoudunConfig record);
}