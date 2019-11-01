package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmSysUserExample;
import com.hyy.ifm.mbg.model.IfmSysUser;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfmSysUserMapper {
    int countByExample(IfmSysUserExample example);

    int deleteByExample(IfmSysUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(IfmSysUser record);

    int insertSelective(IfmSysUser record);

    List<IfmSysUser> selectByExample(IfmSysUserExample example);

    IfmSysUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") IfmSysUser record, @Param("example") IfmSysUserExample example);

    int updateByExample(@Param("record") IfmSysUser record, @Param("example") IfmSysUserExample example);

    int updateByPrimaryKeySelective(IfmSysUser record);

    int updateByPrimaryKey(IfmSysUser record);
}