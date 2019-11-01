package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcProductVisitLogExample;
import com.hyy.ifm.mbg.model.DcProductVisitLog;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcProductVisitLogMapper {
    int countByExample(DcProductVisitLogExample example);

    int deleteByExample(DcProductVisitLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcProductVisitLog record);

    int insertSelective(DcProductVisitLog record);

    List<DcProductVisitLog> selectByExample(DcProductVisitLogExample example);

    DcProductVisitLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcProductVisitLog record, @Param("example") DcProductVisitLogExample example);

    int updateByExample(@Param("record") DcProductVisitLog record, @Param("example") DcProductVisitLogExample example);

    int updateByPrimaryKeySelective(DcProductVisitLog record);

    int updateByPrimaryKey(DcProductVisitLog record);
}