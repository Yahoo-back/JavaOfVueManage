package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcMsgRead;
import com.hyy.ifm.mbg.model.DcMsgReadExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcMsgReadMapper {
    int countByExample(DcMsgReadExample example);

    int deleteByExample(DcMsgReadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcMsgRead record);

    int insertSelective(DcMsgRead record);

    List<DcMsgRead> selectByExample(DcMsgReadExample example);

    DcMsgRead selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcMsgRead record, @Param("example") DcMsgReadExample example);

    int updateByExample(@Param("record") DcMsgRead record, @Param("example") DcMsgReadExample example);

    int updateByPrimaryKeySelective(DcMsgRead record);

    int updateByPrimaryKey(DcMsgRead record);
}