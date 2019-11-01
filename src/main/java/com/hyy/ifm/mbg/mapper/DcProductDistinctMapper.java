package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcProductDistinctExample;
import com.hyy.ifm.mbg.model.DcProductDistinct;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcProductDistinctMapper {
    int countByExample(DcProductDistinctExample example);

    int deleteByExample(DcProductDistinctExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcProductDistinct record);

    int insertSelective(DcProductDistinct record);

    List<DcProductDistinct> selectByExample(DcProductDistinctExample example);

    DcProductDistinct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcProductDistinct record, @Param("example") DcProductDistinctExample example);

    int updateByExample(@Param("record") DcProductDistinct record, @Param("example") DcProductDistinctExample example);

    int updateByPrimaryKeySelective(DcProductDistinct record);

    int updateByPrimaryKey(DcProductDistinct record);
}