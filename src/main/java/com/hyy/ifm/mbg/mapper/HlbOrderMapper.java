package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.HlbOrder;
import com.hyy.ifm.mbg.model.HlbOrderExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HlbOrderMapper {
    int countByExample(HlbOrderExample example);

    int deleteByExample(HlbOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HlbOrder record);

    int insertSelective(HlbOrder record);

    List<HlbOrder> selectByExample(HlbOrderExample example);

    HlbOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HlbOrder record, @Param("example") HlbOrderExample example);

    int updateByExample(@Param("record") HlbOrder record, @Param("example") HlbOrderExample example);

    int updateByPrimaryKeySelective(HlbOrder record);

    int updateByPrimaryKey(HlbOrder record);
}