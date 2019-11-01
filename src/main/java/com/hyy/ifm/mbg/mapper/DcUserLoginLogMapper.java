package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcUserLoginLogExample;
import com.hyy.ifm.mbg.model.DcUserLoginLog;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcUserLoginLogMapper {
    int countByExample(DcUserLoginLogExample example);

    int deleteByExample(DcUserLoginLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcUserLoginLog record);

    int insertSelective(DcUserLoginLog record);

    List<DcUserLoginLog> selectByExample(DcUserLoginLogExample example);

    DcUserLoginLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcUserLoginLog record, @Param("example") DcUserLoginLogExample example);

    int updateByExample(@Param("record") DcUserLoginLog record, @Param("example") DcUserLoginLogExample example);

    int updateByPrimaryKeySelective(DcUserLoginLog record);

    int updateByPrimaryKey(DcUserLoginLog record);
}