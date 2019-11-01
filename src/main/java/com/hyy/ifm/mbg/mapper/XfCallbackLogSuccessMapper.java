package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.XfCallbackLogSuccess;
import com.hyy.ifm.mbg.model.XfCallbackLogSuccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XfCallbackLogSuccessMapper {
    int countByExample(XfCallbackLogSuccessExample example);

    int deleteByExample(XfCallbackLogSuccessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XfCallbackLogSuccess record);

    int insertSelective(XfCallbackLogSuccess record);

    List<XfCallbackLogSuccess> selectByExample(XfCallbackLogSuccessExample example);

    XfCallbackLogSuccess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XfCallbackLogSuccess record, @Param("example") XfCallbackLogSuccessExample example);

    int updateByExample(@Param("record") XfCallbackLogSuccess record, @Param("example") XfCallbackLogSuccessExample example);

    int updateByPrimaryKeySelective(XfCallbackLogSuccess record);

    int updateByPrimaryKey(XfCallbackLogSuccess record);
}