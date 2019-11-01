package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcUserAttach;
import com.hyy.ifm.mbg.model.DcUserAttachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcUserAttachMapper {
    int countByExample(DcUserAttachExample example);

    int deleteByExample(DcUserAttachExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcUserAttach record);

    int insertSelective(DcUserAttach record);

    List<DcUserAttach> selectByExample(DcUserAttachExample example);

    DcUserAttach selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcUserAttach record, @Param("example") DcUserAttachExample example);

    int updateByExample(@Param("record") DcUserAttach record, @Param("example") DcUserAttachExample example);

    int updateByPrimaryKeySelective(DcUserAttach record);

    int updateByPrimaryKey(DcUserAttach record);
}