package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.Fadd;
import com.hyy.ifm.mbg.model.FaddExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaddMapper {
    int countByExample(FaddExample example);

    int deleteByExample(FaddExample example);

    int insert(Fadd record);

    int insertSelective(Fadd record);

    List<Fadd> selectByExampleWithBLOBs(FaddExample example);

    List<Fadd> selectByExample(FaddExample example);

    int updateByExampleSelective(@Param("record") Fadd record, @Param("example") FaddExample example);

    int updateByExampleWithBLOBs(@Param("record") Fadd record, @Param("example") FaddExample example);

    int updateByExample(@Param("record") Fadd record, @Param("example") FaddExample example);
}