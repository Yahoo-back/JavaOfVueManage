package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClYoudunScoreDetail;
import com.hyy.ifm.mbg.model.ClYoudunScoreDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClYoudunScoreDetailMapper {
    int countByExample(ClYoudunScoreDetailExample example);

    int deleteByExample(ClYoudunScoreDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClYoudunScoreDetail record);

    int insertSelective(ClYoudunScoreDetail record);

    List<ClYoudunScoreDetail> selectByExample(ClYoudunScoreDetailExample example);

    ClYoudunScoreDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClYoudunScoreDetail record, @Param("example") ClYoudunScoreDetailExample example);

    int updateByExample(@Param("record") ClYoudunScoreDetail record, @Param("example") ClYoudunScoreDetailExample example);

    int updateByPrimaryKeySelective(ClYoudunScoreDetail record);

    int updateByPrimaryKey(ClYoudunScoreDetail record);
}