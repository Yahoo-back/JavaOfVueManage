package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.CjOrderExample;
import com.hyy.ifm.mbg.model.CjOrder;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CjOrderMapper {
    int countByExample(CjOrderExample example);

    int deleteByExample(CjOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CjOrder record);

    int insertSelective(CjOrder record);

    List<CjOrder> selectByExample(CjOrderExample example);

    CjOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CjOrder record, @Param("example") CjOrderExample example);

    int updateByExample(@Param("record") CjOrder record, @Param("example") CjOrderExample example);

    int updateByPrimaryKeySelective(CjOrder record);

    int updateByPrimaryKey(CjOrder record);
}