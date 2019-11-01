package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.KqCallbackLog;
import com.hyy.ifm.mbg.model.KqCallbackLogExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KqCallbackLogMapper {
    int countByExample(KqCallbackLogExample example);

    int deleteByExample(KqCallbackLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KqCallbackLog record);

    int insertSelective(KqCallbackLog record);

    List<KqCallbackLog> selectByExample(KqCallbackLogExample example);

    KqCallbackLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KqCallbackLog record, @Param("example") KqCallbackLogExample example);

    int updateByExample(@Param("record") KqCallbackLog record, @Param("example") KqCallbackLogExample example);

    int updateByPrimaryKeySelective(KqCallbackLog record);

    int updateByPrimaryKey(KqCallbackLog record);
}