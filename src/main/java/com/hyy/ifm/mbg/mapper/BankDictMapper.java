package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.BankDict;
import com.hyy.ifm.mbg.model.BankDictExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankDictMapper {
    int countByExample(BankDictExample example);

    int deleteByExample(BankDictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankDict record);

    int insertSelective(BankDict record);

    List<BankDict> selectByExample(BankDictExample example);

    BankDict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankDict record, @Param("example") BankDictExample example);

    int updateByExample(@Param("record") BankDict record, @Param("example") BankDictExample example);

    int updateByPrimaryKeySelective(BankDict record);

    int updateByPrimaryKey(BankDict record);
}