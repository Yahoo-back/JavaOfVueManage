package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.XfCallbackLog;
import com.hyy.ifm.mbg.model.XfCallbackLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XfCallbackLogMapper {
    int countByExample(XfCallbackLogExample example);

    int deleteByExample(XfCallbackLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XfCallbackLog record);

    int insertSelective(XfCallbackLog record);

    List<XfCallbackLog> selectByExample(XfCallbackLogExample example);

    XfCallbackLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XfCallbackLog record, @Param("example") XfCallbackLogExample example);

    int updateByExample(@Param("record") XfCallbackLog record, @Param("example") XfCallbackLogExample example);

    int updateByPrimaryKeySelective(XfCallbackLog record);

    int updateByPrimaryKey(XfCallbackLog record);
}