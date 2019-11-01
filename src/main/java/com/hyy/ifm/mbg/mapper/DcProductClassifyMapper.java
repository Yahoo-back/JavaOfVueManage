package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcProductClassify;
import com.hyy.ifm.mbg.model.DcProductClassifyExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcProductClassifyMapper {
    int countByExample(DcProductClassifyExample example);

    int deleteByExample(DcProductClassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcProductClassify record);

    int insertSelective(DcProductClassify record);

    List<DcProductClassify> selectByExample(DcProductClassifyExample example);

    DcProductClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcProductClassify record, @Param("example") DcProductClassifyExample example);

    int updateByExample(@Param("record") DcProductClassify record, @Param("example") DcProductClassifyExample example);

    int updateByPrimaryKeySelective(DcProductClassify record);

    int updateByPrimaryKey(DcProductClassify record);
}