package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ZqExample;
import com.hyy.ifm.mbg.model.Zq;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZqMapper {
    int countByExample(ZqExample example);

    int deleteByExample(ZqExample example);

    int insert(Zq record);

    int insertSelective(Zq record);

    List<Zq> selectByExampleWithBLOBs(ZqExample example);

    List<Zq> selectByExample(ZqExample example);

    int updateByExampleSelective(@Param("record") Zq record, @Param("example") ZqExample example);

    int updateByExampleWithBLOBs(@Param("record") Zq record, @Param("example") ZqExample example);

    int updateByExample(@Param("record") Zq record, @Param("example") ZqExample example);
}