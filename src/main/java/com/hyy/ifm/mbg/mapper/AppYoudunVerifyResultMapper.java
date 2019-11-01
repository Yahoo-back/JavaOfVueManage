package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.AppYoudunVerifyResultExample;
import com.hyy.ifm.mbg.model.AppYoudunVerifyResult;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppYoudunVerifyResultMapper {
    int countByExample(AppYoudunVerifyResultExample example);

    int deleteByExample(AppYoudunVerifyResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppYoudunVerifyResult record);

    int insertSelective(AppYoudunVerifyResult record);

    List<AppYoudunVerifyResult> selectByExample(AppYoudunVerifyResultExample example);

    AppYoudunVerifyResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppYoudunVerifyResult record, @Param("example") AppYoudunVerifyResultExample example);

    int updateByExample(@Param("record") AppYoudunVerifyResult record, @Param("example") AppYoudunVerifyResultExample example);

    int updateByPrimaryKeySelective(AppYoudunVerifyResult record);

    int updateByPrimaryKey(AppYoudunVerifyResult record);
}