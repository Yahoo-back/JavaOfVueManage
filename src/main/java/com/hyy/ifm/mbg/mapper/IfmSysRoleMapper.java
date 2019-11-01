package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmSysRoleExample;
import com.hyy.ifm.mbg.model.IfmSysRole;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfmSysRoleMapper {
    int countByExample(IfmSysRoleExample example);

    int deleteByExample(IfmSysRoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(IfmSysRole record);

    int insertSelective(IfmSysRole record);

    List<IfmSysRole> selectByExample(IfmSysRoleExample example);

    IfmSysRole selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") IfmSysRole record, @Param("example") IfmSysRoleExample example);

    int updateByExample(@Param("record") IfmSysRole record, @Param("example") IfmSysRoleExample example);

    int updateByPrimaryKeySelective(IfmSysRole record);

    int updateByPrimaryKey(IfmSysRole record);
}