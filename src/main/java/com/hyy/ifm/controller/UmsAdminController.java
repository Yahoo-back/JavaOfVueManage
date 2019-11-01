package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dto.UmsAdminLoginParam;
import com.hyy.ifm.dto.UserManageParam;
import com.hyy.ifm.dto.UserParam;
import com.hyy.ifm.mbg.mapper.IfmSysLoginLogMapper;
import com.hyy.ifm.mbg.model.IfmSysLogin;
import com.hyy.ifm.mbg.model.IfmSysLoginLog;
import com.hyy.ifm.mbg.model.IfmSysMuen;
import com.hyy.ifm.mbg.model.IfmSysUser;
import com.hyy.ifm.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台用户管理
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "UmsAdminController", description = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private UmsAdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private IfmSysLoginLogMapper ifmSysLoginLogMapper;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<IfmSysLogin> register(@RequestBody IfmSysLogin ifmSysLoginParam, BindingResult result) {
        IfmSysLogin ifmSysLogin = adminService.register(ifmSysLoginParam);
        if (ifmSysLogin == null) {
            CommonResult.failed();
        }
        return CommonResult.success(ifmSysLogin);
    }

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UmsAdminLoginParam umsAdminLoginParam, HttpServletRequest req) {
        String token = adminService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        IfmSysLogin umsAdmin = adminService.getAdminByUsername(umsAdminLoginParam.getUsername());
        IfmSysUser user = adminService.fetchUserByLngid(umsAdmin.getLgnid() + "");
        IfmSysLoginLog is = new IfmSysLoginLog();
        is.setLogindate(new Date());
        is.setUserCode(umsAdmin.getUserCode());
        is.setAddress(UserUtils.getCurrentHr().getAddress());
        ifmSysLoginLogMapper.insertSelective(is);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        tokenMap.put("userId", user.getUserid().toString());
        tokenMap.put("userName", user.getUserName());
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取用户所有权限")
    @RequestMapping(value = "/permission/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<IfmSysMuen>> getPermissionList(@PathVariable Long userId) {
        List<IfmSysMuen> permissionList = adminService.getPermissionList(userId);
        return CommonResult.success(permissionList);
    }

    @ApiOperation(value = "登出功能")
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult logout() {
        System.out.println(UserUtils.getCurrentHr().getAddress()+"--------------");

        return CommonResult.success(null);
    }

    @ApiOperation(value = "查询所有员工")
    @RequestMapping(value = "/qryUserList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CommonPage<Map<String,Object>>> qryUserList(UserManageParam userManageParam,@RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<Map<String,Object>> user = adminService.qryUserList(userManageParam,pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(user));
    }

    @ApiOperation("根据登录id查询员工")
    @RequestMapping(value = "/qryUserByLgnId/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult qryUserByLgnId(@PathVariable Long userId) {
        Map<String,Object> permissionList = adminService.qryUserByLgnId(userId);
        return CommonResult.success(permissionList);
    }

    @ApiOperation("更改员工状态")
    @RequestMapping(value = "/updateUserStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateUserStatus(@RequestParam("id") Integer id, @RequestParam("status") String status) {
        int count = adminService.updateUserStatus(id, status);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("保存或更新员工")
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveUser(@RequestBody UserParam user, BindingResult bindingResult) {
       return adminService.saveUser(user);
    }

    @ApiOperation("重置员工密码")
    @RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult resetPassword(@RequestParam("id") Integer id) {
        int count = adminService.resetPassword(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "用户最近七天登录")
    @RequestMapping(value = "/qryDataEchartsLogin", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult qryDataEchartsLogin() {
        List<Map<String,Object>> user = adminService.qryDataEchartsLogin();
        return CommonResult.success(user);
    }


}
