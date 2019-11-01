package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmUserRole;
import com.hyy.ifm.mbg.model.IfmUserRoleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfmUserRoleMapper {
    int countByExample(IfmUserRoleExample example);

    int deleteByExample(IfmUserRoleExample example);

    int insert(IfmUserRole record);

    int insertSelective(IfmUserRole record);

    List<IfmUserRole> selectByExample(IfmUserRoleExample example);

    int updateByExampleSelective(@Param("record") IfmUserRole record, @Param("example") IfmUserRoleExample example);

    int updateByExample(@Param("record") IfmUserRole record, @Param("example") IfmUserRoleExample example);
}