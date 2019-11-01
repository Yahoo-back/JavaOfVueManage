package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcUserExample;
import com.hyy.ifm.mbg.model.DcUser;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcUserMapper {
    int countByExample(DcUserExample example);

    int deleteByExample(DcUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcUser record);

    int insertSelective(DcUser record);

    List<DcUser> selectByExample(DcUserExample example);

    DcUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcUser record, @Param("example") DcUserExample example);

    int updateByExample(@Param("record") DcUser record, @Param("example") DcUserExample example);

    int updateByPrimaryKeySelective(DcUser record);

    int updateByPrimaryKey(DcUser record);
}