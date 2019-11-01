package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonPage;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.mbg.model.IfmSysRole;
import com.hyy.ifm.service.RolesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 角色管理
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "RolesController", description = "角色管理")
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    private RolesService rolesService;

    @ApiOperation(value = "查询所有角色")
    @RequestMapping(value = "/qryRoles", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<IfmSysRole>> qryRoles(@RequestParam(value = "roleId_cnd", required = false) Integer roleId_cnd,
                                                         @RequestParam(value = "roleName_cnd", required = false) String roleName_cnd,
                                                         @RequestParam(value = "roleCode_cnd", required = false) String roleCode_cnd,
                                                         @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<IfmSysRole> user = rolesService.qryRoles(roleId_cnd,roleName_cnd,roleCode_cnd,pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(user));
    }

    @ApiOperation(value = "查询员工所属角色")
    @RequestMapping(value = "/qryUserRole", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<IfmSysRole>> qryUserRole(@RequestParam("userCode") String userCode) {
        List<IfmSysRole> user = rolesService.qryUserRole(userCode);
        return CommonResult.success(CommonPage.restPage(user));
    }

    @ApiOperation("保存员工分配的角色")
    @RequestMapping(value = "/allocationRoles", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult allocationRoles(@RequestParam("roleId") Integer roleId,@RequestParam("roleId_cnd") String roleId_cnd) {
        int count = rolesService.allocationRoles(roleId,roleId_cnd);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("保存角色")
    @RequestMapping(value = "/saveRoles", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult saveRoles(@RequestBody IfmSysRole ifmSysRole) {
        int count = rolesService.saveRoles(ifmSysRole);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除角色")
    @RequestMapping(value = "/deleteRoles", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteRoles(@RequestParam("id") Integer id) {
        int count = rolesService.deleteRoles(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("保存角色下的菜单")
    @RequestMapping(value = "/allocationMeuns", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult allocationMeuns(@RequestParam("roleId") Integer roleId,@RequestParam("meunId") String meunId) {
        int count = rolesService.allocationMeuns(roleId,meunId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据角色查询菜单")
    @RequestMapping(value = "/qryMeunsByRole/{roleId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult qryMeunsByRole(@PathVariable Integer roleId) {
        List<Map<String, String>> dcProduct = rolesService.qryMeunsByRole(roleId);
        return CommonResult.success(dcProduct);
    }
}
