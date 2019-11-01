package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcNews;
import com.hyy.ifm.mbg.model.DcNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcNewsMapper {
    int countByExample(DcNewsExample example);

    int deleteByExample(DcNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcNews record);

    int insertSelective(DcNews record);

    List<DcNews> selectByExampleWithBLOBs(DcNewsExample example);

    List<DcNews> selectByExample(DcNewsExample example);

    DcNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcNews record, @Param("example") DcNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") DcNews record, @Param("example") DcNewsExample example);

    int updateByExample(@Param("record") DcNews record, @Param("example") DcNewsExample example);

    int updateByPrimaryKeySelective(DcNews record);

    int updateByPrimaryKeyWithBLOBs(DcNews record);

    int updateByPrimaryKey(DcNews record);
}