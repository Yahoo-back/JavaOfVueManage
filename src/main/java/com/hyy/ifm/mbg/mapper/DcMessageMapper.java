package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcMessage;
import com.hyy.ifm.mbg.model.DcMessageExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcMessageMapper {
    int countByExample(DcMessageExample example);

    int deleteByExample(DcMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcMessage record);

    int insertSelective(DcMessage record);

    List<DcMessage> selectByExample(DcMessageExample example);

    DcMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcMessage record, @Param("example") DcMessageExample example);

    int updateByExample(@Param("record") DcMessage record, @Param("example") DcMessageExample example);

    int updateByPrimaryKeySelective(DcMessage record);

    int updateByPrimaryKey(DcMessage record);
}