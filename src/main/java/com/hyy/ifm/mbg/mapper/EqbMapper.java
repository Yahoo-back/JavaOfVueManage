package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.EqbExample;
import com.hyy.ifm.mbg.model.Eqb;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EqbMapper {
    int countByExample(EqbExample example);

    int deleteByExample(EqbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Eqb record);

    int insertSelective(Eqb record);

    List<Eqb> selectByExampleWithBLOBs(EqbExample example);

    List<Eqb> selectByExample(EqbExample example);

    Eqb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Eqb record, @Param("example") EqbExample example);

    int updateByExampleWithBLOBs(@Param("record") Eqb record, @Param("example") EqbExample example);

    int updateByExample(@Param("record") Eqb record, @Param("example") EqbExample example);

    int updateByPrimaryKeySelective(Eqb record);

    int updateByPrimaryKeyWithBLOBs(Eqb record);

    int updateByPrimaryKey(Eqb record);
}