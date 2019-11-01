package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.XfOrder;
import com.hyy.ifm.mbg.model.XfOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XfOrderMapper {
    int countByExample(XfOrderExample example);

    int deleteByExample(XfOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XfOrder record);

    int insertSelective(XfOrder record);

    List<XfOrder> selectByExample(XfOrderExample example);

    XfOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XfOrder record, @Param("example") XfOrderExample example);

    int updateByExample(@Param("record") XfOrder record, @Param("example") XfOrderExample example);

    int updateByPrimaryKeySelective(XfOrder record);

    int updateByPrimaryKey(XfOrder record);
}