package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClYoudunIdDetail;
import com.hyy.ifm.mbg.model.ClYoudunIdDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClYoudunIdDetailMapper {
    int countByExample(ClYoudunIdDetailExample example);

    int deleteByExample(ClYoudunIdDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClYoudunIdDetail record);

    int insertSelective(ClYoudunIdDetail record);

    List<ClYoudunIdDetail> selectByExample(ClYoudunIdDetailExample example);

    ClYoudunIdDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClYoudunIdDetail record, @Param("example") ClYoudunIdDetailExample example);

    int updateByExample(@Param("record") ClYoudunIdDetail record, @Param("example") ClYoudunIdDetailExample example);

    int updateByPrimaryKeySelective(ClYoudunIdDetail record);

    int updateByPrimaryKey(ClYoudunIdDetail record);
}