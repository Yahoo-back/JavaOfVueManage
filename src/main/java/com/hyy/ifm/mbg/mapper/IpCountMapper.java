package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IpCount;
import com.hyy.ifm.mbg.model.IpCountExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpCountMapper {
    int countByExample(IpCountExample example);

    int deleteByExample(IpCountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpCount record);

    int insertSelective(IpCount record);

    List<IpCount> selectByExample(IpCountExample example);

    IpCount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpCount record, @Param("example") IpCountExample example);

    int updateByExample(@Param("record") IpCount record, @Param("example") IpCountExample example);

    int updateByPrimaryKeySelective(IpCount record);

    int updateByPrimaryKey(IpCount record);
}