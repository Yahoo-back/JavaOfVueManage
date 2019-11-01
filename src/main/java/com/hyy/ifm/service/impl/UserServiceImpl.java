package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.StringUtil;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dao.UserDao;
import com.hyy.ifm.dto.QudaoParam;
import com.hyy.ifm.dto.UserManageParam;
import com.hyy.ifm.mbg.mapper.IfmSysLoginMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserOperateMapper;
import com.hyy.ifm.mbg.mapper.SlQdaoMapper;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.ConfigDictService;
import com.hyy.ifm.service.UmsAdminService;
import com.hyy.ifm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 用户Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private IfmSysLoginMapper ifmSysLoginMapper;
    @Autowired
    private UserDao userDao;
    @Autowired
    private ConfigDictService configDictService;
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;
    @Autowired
    private SlQdaoMapper slQdaoMapper;
    @Autowired
    private UmsAdminService umsAdminService;
    @Autowired
    private IfmSysUserMapper ifmSysUserMapper;

    @Override
    public List<Map<String,Object>> qryUserListByType(UserManageParam qudao, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String,Object>> res = userDao.qryUserListByType(qudao);
        for (int i = 0; i < res.size() ; i++) {
            List<DcDict> dcDict = configDictService.qryDictByDataType("QD_URL");
            res.get(i).put("url",dcDict.get(0).getItemValue()+"?"+res.get(i).get("USER_CODE"));
            res.get(i).put("uvUrl",dcDict.get(0).getItemKey()+"?"+res.get(i).get("USER_CODE"));
        }
        return res;
    }

    @Override
    public CommonResult saveUserQudao(QudaoParam qudaoParam) {
        int count;
        boolean f = "".equals(qudaoParam.getId()) || null == qudaoParam.getId()? true : false;
        IfmSysLoginExample example = new IfmSysLoginExample();
        IfmSysLoginExample.Criteria criteria = example.createCriteria();
        criteria.andUserCodeEqualTo(qudaoParam.getUserCode());
        if (!f) {
            criteria.andLgnidNotEqualTo(qudaoParam.getId());
        }
        List<IfmSysLogin> tmp = ifmSysLoginMapper.selectByExample(example);
        if (null != tmp && tmp.size() > 0) {
            return CommonResult.failed("该用户名已经被使用，建议使用姓名拼音，若有重复后面加数字区分");
        }

        IfmSysLogin login = new IfmSysLogin();
        login.setRegisterDate(new Date());
        login.setUserCode(StringUtil.nvl(qudaoParam.getUserCode()));

        login.setType(2);
        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());

        if (f) {
            login.setPassword(StringUtil.MD5("123456"));
            ifmSysLoginMapper.insertSelective(login);

            IfmSysLoginExample example1 = new IfmSysLoginExample();
            IfmSysLoginExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andUserCodeEqualTo(login.getUserCode());
            criteria1.andLgnidNotEqualTo(0);
            List<IfmSysLogin> ifmLogin = ifmSysLoginMapper.selectByExample(example);
            SlQdao  qdaoSl = new SlQdao();
            qdaoSl.setLoginId(ifmLogin.get(0).getLgnid());
            qdaoSl.setSource(ifmLogin.get(0).getUserCode());
            qdaoSl.setSl(Double.valueOf(1));
            qdaoSl.setUpdateTime(new Date());
            qdaoSl.setCountCount(Double.valueOf(0));
            qdaoSl.setUv(Double.valueOf(0));
            qdaoSl.setUvCount(Double.valueOf(0));
            qdaoSl.setRemark("");
            count = slQdaoMapper.insertSelective(qdaoSl);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("添加渠道用户");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        } else {
            int appr_id = StringUtil.parseInt(qudaoParam.getId());
            IfmSysLogin log = ifmSysLoginMapper.selectByPrimaryKey(qudaoParam.getId());
            login.setPassword(log.getPassword());
            login.setLgnid(appr_id);
            count = ifmSysLoginMapper.updateByPrimaryKeySelective(login);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("更新用户");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        IfmSysUser user = new IfmSysUser();
        user.setCreatDate(new Date());
        user.setLgnId(login.getLgnid() + "");
        user.setUserName(StringUtil.nvl(qudaoParam.getUserName()));
        user.setCpa(qudaoParam.getCpa());
        user.setLoanrate(qudaoParam.getLoanRate());
        user.setCpatype(qudaoParam.getCpaType());
        IfmSysUser iuser = umsAdminService.fetchUserByLngid(login.getLgnid() + "");
        if (null != iuser) {
            user.setStatus(StringUtil.nvl(iuser.getStatus()));
            user.setUserid(StringUtil.parseInt(iuser.getUserid()));
            count = ifmSysUserMapper.updateByPrimaryKeySelective(user);
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("更新渠道用户的ifm_user表"
                    + "cpa"+qudaoParam.getCpa() +"cpaType"+ qudaoParam.getCpaType()
                    +"loanRate" + qudaoParam.getLoanRate());
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }else {
            user.setStatus("2");
            count = ifmSysUserMapper.insertSelective(user);
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("新增渠道用户的ifm_user表"
                    + "cpa"+qudaoParam.getCpa() +"cpaType"+ qudaoParam.getCpaType()
                    +"loanRate" + qudaoParam.getLoanRate());
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }
}
