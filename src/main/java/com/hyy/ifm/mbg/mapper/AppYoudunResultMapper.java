package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.AppYoudunResult;
import com.hyy.ifm.mbg.model.AppYoudunResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppYoudunResultMapper {
    int countByExample(AppYoudunResultExample example);

    int deleteByExample(AppYoudunResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppYoudunResult record);

    int insertSelective(AppYoudunResult record);

    List<AppYoudunResult> selectByExampleWithBLOBs(AppYoudunResultExample example);

    List<AppYoudunResult> selectByExample(AppYoudunResultExample example);

    AppYoudunResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppYoudunResult record, @Param("example") AppYoudunResultExample example);

    int updateByExampleWithBLOBs(@Param("record") AppYoudunResult record, @Param("example") AppYoudunResultExample example);

    int updateByExample(@Param("record") AppYoudunResult record, @Param("example") AppYoudunResultExample example);

    int updateByPrimaryKeySelective(AppYoudunResult record);

    int updateByPrimaryKeyWithBLOBs(AppYoudunResult record);

    int updateByPrimaryKey(AppYoudunResult record);
}