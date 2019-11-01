package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClYoudunUserFeatures;
import com.hyy.ifm.mbg.model.ClYoudunUserFeaturesExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClYoudunUserFeaturesMapper {
    int countByExample(ClYoudunUserFeaturesExample example);

    int deleteByExample(ClYoudunUserFeaturesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClYoudunUserFeatures record);

    int insertSelective(ClYoudunUserFeatures record);

    List<ClYoudunUserFeatures> selectByExample(ClYoudunUserFeaturesExample example);

    ClYoudunUserFeatures selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClYoudunUserFeatures record, @Param("example") ClYoudunUserFeaturesExample example);

    int updateByExample(@Param("record") ClYoudunUserFeatures record, @Param("example") ClYoudunUserFeaturesExample example);

    int updateByPrimaryKeySelective(ClYoudunUserFeatures record);

    int updateByPrimaryKey(ClYoudunUserFeatures record);
}