package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcValidCode;
import com.hyy.ifm.mbg.model.DcValidCodeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcValidCodeMapper {
    int countByExample(DcValidCodeExample example);

    int deleteByExample(DcValidCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcValidCode record);

    int insertSelective(DcValidCode record);

    List<DcValidCode> selectByExample(DcValidCodeExample example);

    DcValidCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcValidCode record, @Param("example") DcValidCodeExample example);

    int updateByExample(@Param("record") DcValidCode record, @Param("example") DcValidCodeExample example);

    int updateByPrimaryKeySelective(DcValidCode record);

    int updateByPrimaryKey(DcValidCode record);
}