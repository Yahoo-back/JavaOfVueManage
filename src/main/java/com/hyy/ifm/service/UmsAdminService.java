package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.UserManageParam;
import com.hyy.ifm.dto.UserParam;
import com.hyy.ifm.mbg.model.IfmSysLogin;
import com.hyy.ifm.mbg.model.IfmSysMuen;
import com.hyy.ifm.mbg.model.IfmSysUser;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 后台管理员Service
 * Created by macro on 2018/4/26.
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    IfmSysLogin getAdminByUsername(String username);

    /**
     * 根据登录id查询
     */
    IfmSysUser fetchUserByLngid(String loginId);

    /**
     * 注册功能
     */
    IfmSysLogin register(IfmSysLogin ifmSysLogin);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<IfmSysMuen> getPermissionList(Long userId);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<Map<String,Object>> qryUserList(UserManageParam user, Integer pageSize,Integer pageNum);

    /**
     * 根据登录id查询员工
     */
    Map<String,Object> qryUserByLgnId(Long userId);

    /**
     * 更改员工状态
     */
    int updateUserStatus(Integer id, String status);

    /**
     * 保存
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    CommonResult saveUser(UserParam user);

    /**
     * 重置员工密码
     */
    int resetPassword(Integer roleId);

    /**
     * 用户登录信息
     */
    Map<String,Object> qryUserlogin();

    /**
     * 用户最近七天登录
     */
    List<Map<String,Object>> qryDataEchartsLogin();


}
