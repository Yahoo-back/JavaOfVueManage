package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClRcXinyanBlackRule;
import com.hyy.ifm.mbg.model.ClRcXinyanBlackRuleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClRcXinyanBlackRuleMapper {
    int countByExample(ClRcXinyanBlackRuleExample example);

    int deleteByExample(ClRcXinyanBlackRuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClRcXinyanBlackRule record);

    int insertSelective(ClRcXinyanBlackRule record);

    List<ClRcXinyanBlackRule> selectByExample(ClRcXinyanBlackRuleExample example);

    ClRcXinyanBlackRule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClRcXinyanBlackRule record, @Param("example") ClRcXinyanBlackRuleExample example);

    int updateByExample(@Param("record") ClRcXinyanBlackRule record, @Param("example") ClRcXinyanBlackRuleExample example);

    int updateByPrimaryKeySelective(ClRcXinyanBlackRule record);

    int updateByPrimaryKey(ClRcXinyanBlackRule record);
}