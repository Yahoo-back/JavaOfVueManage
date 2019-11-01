package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClYoudunGraphDetail;
import com.hyy.ifm.mbg.model.ClYoudunGraphDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClYoudunGraphDetailMapper {
    int countByExample(ClYoudunGraphDetailExample example);

    int deleteByExample(ClYoudunGraphDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClYoudunGraphDetail record);

    int insertSelective(ClYoudunGraphDetail record);

    List<ClYoudunGraphDetail> selectByExampleWithBLOBs(ClYoudunGraphDetailExample example);

    List<ClYoudunGraphDetail> selectByExample(ClYoudunGraphDetailExample example);

    ClYoudunGraphDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClYoudunGraphDetail record, @Param("example") ClYoudunGraphDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") ClYoudunGraphDetail record, @Param("example") ClYoudunGraphDetailExample example);

    int updateByExample(@Param("record") ClYoudunGraphDetail record, @Param("example") ClYoudunGraphDetailExample example);

    int updateByPrimaryKeySelective(ClYoudunGraphDetail record);

    int updateByPrimaryKeyWithBLOBs(ClYoudunGraphDetail record);

    int updateByPrimaryKey(ClYoudunGraphDetail record);
}