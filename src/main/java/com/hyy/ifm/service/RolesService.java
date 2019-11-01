package com.hyy.ifm.service;

import com.hyy.ifm.mbg.model.IfmSysRole;

import java.util.List;
import java.util.Map;

/**
 * 角色Service
 * Created by macro on 2019/08/29.
 */
public interface RolesService {
    /**
     * 查询所有角色
     */
    List<IfmSysRole> qryRoles(Integer roleId_cnd,String roleName_cnd,String roleCode_cnd, Integer pageSize, Integer pageNum);

    /**
     * 查询员工所属角色
     */
    List<IfmSysRole> qryUserRole(String userCode);

    /**
     * 保存员工分配的角色
     */
    int allocationRoles(Integer roleId,String roleId_cnd);

    /**
     * 保存角色
     */
    int saveRoles(IfmSysRole ifmSysRole);

    /**
     * 删除角色
     */
    int deleteRoles(Integer id);

    /**
     * 保存角色下的菜单
     */
    int allocationMeuns(Integer roleId,String meunId);

    /**
     * 根据角色查询菜单
     */
    List<Map<String, String>> qryMeunsByRole(Integer id);
}
