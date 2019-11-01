package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcNewsType;
import com.hyy.ifm.mbg.model.DcNewsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcNewsTypeMapper {
    int countByExample(DcNewsTypeExample example);

    int deleteByExample(DcNewsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcNewsType record);

    int insertSelective(DcNewsType record);

    List<DcNewsType> selectByExample(DcNewsTypeExample example);

    DcNewsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcNewsType record, @Param("example") DcNewsTypeExample example);

    int updateByExample(@Param("record") DcNewsType record, @Param("example") DcNewsTypeExample example);

    int updateByPrimaryKeySelective(DcNewsType record);

    int updateByPrimaryKey(DcNewsType record);
}