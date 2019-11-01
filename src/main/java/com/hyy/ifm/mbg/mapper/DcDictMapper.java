package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcDict;
import com.hyy.ifm.mbg.model.DcDictExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcDictMapper {
    int countByExample(DcDictExample example);

    int deleteByExample(DcDictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcDict record);

    int insertSelective(DcDict record);

    List<DcDict> selectByExample(DcDictExample example);

    DcDict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcDict record, @Param("example") DcDictExample example);

    int updateByExample(@Param("record") DcDict record, @Param("example") DcDictExample example);

    int updateByPrimaryKeySelective(DcDict record);

    int updateByPrimaryKey(DcDict record);

    DcDict qryDictByName(String name);
}