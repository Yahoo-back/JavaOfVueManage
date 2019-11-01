package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcVisitLog;
import com.hyy.ifm.mbg.model.DcVisitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcVisitLogMapper {
    int countByExample(DcVisitLogExample example);

    int deleteByExample(DcVisitLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcVisitLog record);

    int insertSelective(DcVisitLog record);

    List<DcVisitLog> selectByExample(DcVisitLogExample example);

    DcVisitLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcVisitLog record, @Param("example") DcVisitLogExample example);

    int updateByExample(@Param("record") DcVisitLog record, @Param("example") DcVisitLogExample example);

    int updateByPrimaryKeySelective(DcVisitLog record);

    int updateByPrimaryKey(DcVisitLog record);
}