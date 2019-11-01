package com.hyy.ifm.service.impl;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.StringUtil;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dao.IfmRoleMuenDao;
import com.hyy.ifm.dao.IfmSysRoleDao;
import com.hyy.ifm.mbg.mapper.*;
import com.hyy.ifm.mbg.model.IfmSysMuen;
import com.hyy.ifm.mbg.model.IfmSysMuenExample;
import com.hyy.ifm.mbg.model.IfmSysUserOperate;
import com.hyy.ifm.service.MuenService;
import com.hyy.ifm.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 菜单Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class MuenServiceImpl implements MuenService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MuenServiceImpl.class);
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
    private IfmSysMuenMapper ifmSysMuenMapper;

    @Override
    public List<Map<String, String>> qryAllMeuns() {
        return ifmRoleMuenDao.qryAllMuens();
    }

    @Override
    public CommonResult saveMuen(IfmSysMuen ifmSysMuen) {
        int count;
        boolean f = ifmSysMuen.getMuenid() == null ? true : false;
        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        if (f) {
            IfmSysMuenExample example = new IfmSysMuenExample();
            IfmSysMuenExample.Criteria criteria = example.createCriteria();
            criteria.andUriEqualTo(ifmSysMuen.getUri());
            List<IfmSysMuen> muen1 = ifmSysMuenMapper.selectByExample(example);
            if (muen1 != null && muen1.size() > 0) {
                return CommonResult.failed("路径【" + ifmSysMuen.getUri() + "】出现重复，请重新输入！");
            }
            count = ifmSysMuenMapper.insertSelective(ifmSysMuen);
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("添加菜单");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        } else {
            IfmSysMuenExample example = new IfmSysMuenExample();
            IfmSysMuenExample.Criteria criteria = example.createCriteria();
            criteria.andUriEqualTo(ifmSysMuen.getUri());
            List<IfmSysMuen> muen1 = ifmSysMuenMapper.selectByExample(example);
            if (muen1 != null && muen1.size() > 0) {
                return CommonResult.failed("路径【" + ifmSysMuen.getUri() + "】出现重复，请重新输入！");
            }
            count = ifmSysMuenMapper.updateByPrimaryKeySelective(ifmSysMuen);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("更新菜单");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }

    @Override
    public Map<String, String> qryMeun(Integer id) {
        List<Map<String, String>> res = ifmRoleMuenDao.qryAllMuens();
        Map<String, String> tmp = null;
        for (Map<String, String> r : res) {
            if (id.equals(StringUtil.nvl(r.get("id")))) {
                tmp = r;
                break;
            }
        }
        return tmp;
    }

    @Override
    public int deleteMuen(Integer muenId) {
        int count;
        ifmSysMuenMapper.deleteByPrimaryKey(muenId);

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        ifmUserOperate.setOperateDate(new Date());
        ifmUserOperate.setOperate("删除菜单");
        ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        count = 1;
        return count;
    }
}
