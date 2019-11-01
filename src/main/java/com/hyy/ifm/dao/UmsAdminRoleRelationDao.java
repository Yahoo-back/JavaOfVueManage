package com.hyy.ifm.dao;


import com.hyy.ifm.dto.UserManageParam;
import com.hyy.ifm.mbg.model.IfmSysMuen;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 后台用户与角色管理自定义Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<IfmSysMuen> getPermissionList(@Param("adminId") Long adminId);


    List<Map<String, Object>> qryUserList(UserManageParam admin);
}
