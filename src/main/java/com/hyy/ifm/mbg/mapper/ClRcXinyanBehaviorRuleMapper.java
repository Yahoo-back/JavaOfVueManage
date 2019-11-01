package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClRcXinyanBehaviorRuleExample;
import com.hyy.ifm.mbg.model.ClRcXinyanBehaviorRule;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClRcXinyanBehaviorRuleMapper {
    int countByExample(ClRcXinyanBehaviorRuleExample example);

    int deleteByExample(ClRcXinyanBehaviorRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClRcXinyanBehaviorRule record);

    int insertSelective(ClRcXinyanBehaviorRule record);

    List<ClRcXinyanBehaviorRule> selectByExample(ClRcXinyanBehaviorRuleExample example);

    ClRcXinyanBehaviorRule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClRcXinyanBehaviorRule record, @Param("example") ClRcXinyanBehaviorRuleExample example);

    int updateByExample(@Param("record") ClRcXinyanBehaviorRule record, @Param("example") ClRcXinyanBehaviorRuleExample example);

    int updateByPrimaryKeySelective(ClRcXinyanBehaviorRule record);

    int updateByPrimaryKey(ClRcXinyanBehaviorRule record);
}