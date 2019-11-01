package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.KqConfigExample;
import com.hyy.ifm.mbg.model.KqConfig;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KqConfigMapper {
    int countByExample(KqConfigExample example);

    int deleteByExample(KqConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KqConfig record);

    int insertSelective(KqConfig record);

    List<KqConfig> selectByExample(KqConfigExample example);

    KqConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KqConfig record, @Param("example") KqConfigExample example);

    int updateByExample(@Param("record") KqConfig record, @Param("example") KqConfigExample example);

    int updateByPrimaryKeySelective(KqConfig record);

    int updateByPrimaryKey(KqConfig record);
}