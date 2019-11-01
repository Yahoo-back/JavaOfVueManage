package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyy.ifm.common.utils.StringUtil;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dao.IfmRoleMuenDao;
import com.hyy.ifm.dao.IfmSysRoleDao;
import com.hyy.ifm.mbg.mapper.*;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.RolesService;
import com.hyy.ifm.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * 角色Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class RolesServiceImpl implements RolesService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RolesServiceImpl.class);
    @Autowired
    private IfmSysUserMapper ifmSysUserMapper;
    @Autowired
    private IfmRoleMuenDao ifmRoleMuenDao;
    @Autowired
    private IfmSysRoleMapper ifmSysRoleMapper;
    @Autowired
    private UmsAdminService umsAdminService;
    @Autowired
    private IfmSysRoleDao ifmSysRoleDao;
    @Autowired
    private IfmUserRoleMapper ifmUserRoleMapper;
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;
    @Autowired
    private IfmRoleMuenMapper ifmRoleMuenMapper;
    @Autowired
    private IfmSysMuenMapper ifmSysMuenMapper;

    @Override
    public List<IfmSysRole> qryRoles(Integer roleId_cnd,String roleName_cnd,String roleCode_cnd, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        IfmSysRoleExample example = new IfmSysRoleExample();
        IfmSysRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleidNotEqualTo(1);
        if (roleId_cnd != null) {
            criteria.andRoleidEqualTo(roleId_cnd);
        }
        if (!StringUtils.isEmpty(roleName_cnd)) {
            criteria.andRoleNameLike("%" + roleName_cnd + "%");
        }
        if (!StringUtils.isEmpty(roleCode_cnd)) {
            criteria.andRoleCodeLike("%" + roleCode_cnd + "%");
        }
        return ifmSysRoleMapper.selectByExample(example);
    }

    @Override
    public List<IfmSysRole> qryUserRole(String userCode) {
        IfmSysUser user = umsAdminService.fetchUserByLngid(userCode);
        return ifmSysRoleDao.qryUserRole(user.getUserid());
    }

    @Override
    public int allocationRoles(Integer roleId,String roleId_cnd) {
        int count;
        List<IfmUserRole> rms = new ArrayList<IfmUserRole>();
        // 其实是用户ID
        IfmSysUser user = umsAdminService.fetchUserByLngid(roleId + "");
        String[] ms = roleId_cnd.split(",");
        for (String m : ms) {
            if (!"".equals(StringUtil.nvl(m))) {
                IfmUserRole rm = new IfmUserRole();
                rm.setUserId(user.getUserid());
                rm.setRoleId(StringUtil.parseInt(m));
                rms.add(rm);
            }
        }
        if (rms.size() > 0) {
            IfmUserRoleExample example = new IfmUserRoleExample();
            example.createCriteria().andUserIdEqualTo(user.getUserid());
            ifmUserRoleMapper.deleteByExample(example);
            ifmSysRoleDao.insertList(rms);
        }
        count = 1;
        return count;
    }

    @Override
    public int saveRoles(IfmSysRole ifmSysRole) {
        int count;
        boolean f = "".equals(ifmSysRole.getRoleid()) ? true : false;
        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        if (f) {
            ifmSysRoleMapper.insertSelective(ifmSysRole);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("添加角色");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        } else {
            ifmSysRoleMapper.updateByPrimaryKeySelective(ifmSysRole);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("修改角色");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        ifmUserOperate.setOperateDate(new Date());
        ifmUserOperate.setOperate("取消置顶或置尾商品");
        ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        count = 1;
        return count;
    }

    @Override
    public int deleteRoles(Integer id) {
        int count;
        ifmSysRoleMapper.deleteByPrimaryKey(id);
        IfmUserRoleExample example = new IfmUserRoleExample();
        IfmUserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(id);
        ifmUserRoleMapper.deleteByExample(example);
        IfmRoleMuenExample example1 = new IfmRoleMuenExample();
        IfmRoleMuenExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andRoleIdEqualTo(id);
        ifmRoleMuenMapper.deleteByExample(example1);

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        ifmUserOperate.setOperateDate(new Date());
        ifmUserOperate.setOperate("删除角色");
        ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        count = 1;
        return count;
    }

    @Override
    public List<Map<String, String>> qryMeunsByRole(Integer roleId) {
        IfmRoleMuenExample example = new IfmRoleMuenExample();
        IfmRoleMuenExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        List<IfmRoleMuen> rms = ifmRoleMuenMapper.selectByExample(example);
        IfmSysMuenExample example1 = new IfmSysMuenExample();
        IfmSysMuenExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andStatusEqualTo("0");
        List<IfmSysMuen> meuns = ifmSysMuenMapper.selectByExample(example1);
        List<Map<String, String>> nres = new ArrayList<Map<String, String>>();
        for (IfmSysMuen m : meuns) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("pId", StringUtil.nvl(m.getParentMuenId()));
            map.put("id", StringUtil.nvl(m.getMuenid()));
            map.put("name", StringUtil.nvl(m.getMuenName()));
            map.put("status", StringUtil.nvl(m.getStatus()));
            if (null != rms && rms.size() > 0) {
                for (IfmRoleMuen rm : rms) {
                    if (StringUtil.nvl(m.getMuenid()).equals(StringUtil.nvl(rm.getMuenId()))) {
                        map.put("checked", "true");
                        break;
                    }
                }
            }
            if ("0".equals(StringUtil.nvl(m.getParentMuenId()))) {
                map.put("icon", "/static/js/ztree/css/zTreeStyle/img/diy/home.png");
                map.put("open", "true");
            } else {
                map.put("icon", "/static/js/ztree/css/zTreeStyle/img/diy/dept1.png");
                map.put("open", "true");
            }
            nres.add(map);
        }
        return nres;
    }

    @Override
    public int allocationMeuns(Integer roleid,String meunids) {
        int count;
        List<IfmRoleMuen> rms = new ArrayList<IfmRoleMuen>();
        String[] ms = meunids.split(",");
        for (String m : ms) {
            if (!"".equals(StringUtil.nvl(m))) {
                IfmRoleMuen rm = new IfmRoleMuen();
                rm.setMuenId(StringUtil.parseInt(m));
                rm.setRoleId(roleid);
                rms.add(rm);
            }
        }
        if (rms.size() > 0) {
            IfmRoleMuenExample example1 = new IfmRoleMuenExample();
            IfmRoleMuenExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andRoleIdEqualTo(roleid);
            ifmRoleMuenMapper.deleteByExample(example1);
            ifmRoleMuenDao.insertList(rms);
        }
        count = 1;
        return count;
    }
}
