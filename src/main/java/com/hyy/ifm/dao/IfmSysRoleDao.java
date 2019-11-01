package com.hyy.ifm.dao;

import com.hyy.ifm.mbg.model.IfmSysRole;
import com.hyy.ifm.mbg.model.IfmUserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 角色自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface IfmSysRoleDao {
    /**
     * 查询员工所属角色
     */
    List<IfmSysRole> qryUserRole(Integer userId);

    /**
     * 批量插入员工分配的角色
     */
    int insertList(@Param("list") List<IfmUserRole> rms);
}
