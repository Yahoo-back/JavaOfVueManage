package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.XfOrderSuccessExample;
import com.hyy.ifm.mbg.model.XfOrderSuccess;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XfOrderSuccessMapper {
    int countByExample(XfOrderSuccessExample example);

    int deleteByExample(XfOrderSuccessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XfOrderSuccess record);

    int insertSelective(XfOrderSuccess record);

    List<XfOrderSuccess> selectByExample(XfOrderSuccessExample example);

    XfOrderSuccess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XfOrderSuccess record, @Param("example") XfOrderSuccessExample example);

    int updateByExample(@Param("record") XfOrderSuccess record, @Param("example") XfOrderSuccessExample example);

    int updateByPrimaryKeySelective(XfOrderSuccess record);

    int updateByPrimaryKey(XfOrderSuccess record);
}