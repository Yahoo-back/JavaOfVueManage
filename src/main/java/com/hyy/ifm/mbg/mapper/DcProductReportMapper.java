package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcProductReport;
import com.hyy.ifm.mbg.model.DcProductReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcProductReportMapper {
    int countByExample(DcProductReportExample example);

    int deleteByExample(DcProductReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcProductReport record);

    int insertSelective(DcProductReport record);

    List<DcProductReport> selectByExample(DcProductReportExample example);

    DcProductReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcProductReport record, @Param("example") DcProductReportExample example);

    int updateByExample(@Param("record") DcProductReport record, @Param("example") DcProductReportExample example);

    int updateByPrimaryKeySelective(DcProductReport record);

    int updateByPrimaryKey(DcProductReport record);
}