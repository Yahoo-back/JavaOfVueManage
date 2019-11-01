package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmSysUserOperateExample;
import com.hyy.ifm.mbg.model.IfmSysUserOperate;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfmSysUserOperateMapper {
    int countByExample(IfmSysUserOperateExample example);

    int deleteByExample(IfmSysUserOperateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfmSysUserOperate record);

    int insertSelective(IfmSysUserOperate record);

    List<IfmSysUserOperate> selectByExample(IfmSysUserOperateExample example);

    IfmSysUserOperate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfmSysUserOperate record, @Param("example") IfmSysUserOperateExample example);

    int updateByExample(@Param("record") IfmSysUserOperate record, @Param("example") IfmSysUserOperateExample example);

    int updateByPrimaryKeySelective(IfmSysUserOperate record);

    int updateByPrimaryKey(IfmSysUserOperate record);
}