package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dto.DcConfigParam;
import com.hyy.ifm.dto.DcConfigResult;
import com.hyy.ifm.mbg.mapper.DcConfigMapper;
import com.hyy.ifm.mbg.mapper.DcNewsMapper;
import com.hyy.ifm.mbg.mapper.DcProductMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserOperateMapper;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.ConfigSpreadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 业务配置Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class ConfigSpreadServiceImpl implements ConfigSpreadService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigSpreadServiceImpl.class);
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;
    @Autowired
    private DcConfigMapper dcConfigMapper;
    @Autowired
    private DcProductMapper dcProductMapper;
    @Autowired
    private DcNewsMapper dcNewsMapper;

    @Override
    public List<DcConfigResult> qrySpreadConfigList(DcConfigParam dcConfigParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DcConfigExample example = new DcConfigExample();
        DcConfigExample.Criteria criteria = example.createCriteria();
        criteria.andStatusIn(Arrays.asList("0","1"));
        //根据名称模糊查询
        if (StringUtils.isEmpty(dcConfigParam.getName_cnd())) {
            criteria.andNameLike("%" + dcConfigParam.getName_cnd() + "%");
        }
        //根据链接模糊查询
        if (StringUtils.isEmpty(dcConfigParam.getUrl_cnd())) {
            criteria.andUrlLike("%" + dcConfigParam.getUrl_cnd() + "%");
        }
        //根据位置查询
        if (StringUtils.isEmpty(dcConfigParam.getPosition_cnd())) {
            criteria.andPositionEqualTo(dcConfigParam.getPosition_cnd());
        }
        //根据状态查询
        if (StringUtils.isEmpty(dcConfigParam.getStatus_cnd())) {
            criteria.andStatusEqualTo(dcConfigParam.getStatus_cnd());
        }
        //根据开始时间模糊查询
        if(StringUtils.isEmpty(dcConfigParam.getStart_time_FROM_cnd())) {
            criteria.andStartTimeGreaterThanOrEqualTo(dcConfigParam.getStart_time_FROM_cnd());
        }
        if(StringUtils.isEmpty(dcConfigParam.getStart_time_TO_cnd())) {
            criteria.andStartTimeLessThanOrEqualTo(dcConfigParam.getStart_time_TO_cnd() +" 23:59:59 ");
        }
        //根据结束时间模糊查询
        if(StringUtils.isEmpty(dcConfigParam.getEnd_time_FROM_cnd())) {
            criteria.andEndTimeGreaterThanOrEqualTo(dcConfigParam.getEnd_time_FROM_cnd());
        }
        if(StringUtils.isEmpty(dcConfigParam.getEnd_time_TO_cnd())) {
            criteria.andEndTimeLessThanOrEqualTo(dcConfigParam.getStart_time_TO_cnd() +" 23:59:59 ");
        }
        example.setOrderByClause("sort asc");
        List<DcConfig> dcConfig = dcConfigMapper.selectByExample(example);
        List<DcConfigResult> dcConfigResult = new ArrayList<>();
        BeanUtils.copyProperties(dcConfig,dcConfigResult);
        for(int i = 0; i < dcConfigResult.size(); i++) {
            if("0".equals(dcConfigResult.get(i).getAssociateType())) {
                //商品
                DcProduct dcProduct = dcProductMapper.selectByPrimaryKey(dcConfigResult.get(i).getAssociateId());
                dcConfigResult.get(i).setAssociate_name(dcProduct.getName());
            } else if("1".equals(dcConfigResult.get(i).getAssociateType())) {
                //资讯
                DcNews dcNews = dcNewsMapper.selectByPrimaryKey(dcConfigResult.get(i).getAssociateId());
                dcConfigResult.get(i).setAssociate_name(dcNews.getTitle());
            }
        }
        return dcConfigResult;
    }

    @Override
    public List<DcConfigResult> exportSpreadConfigList (DcConfigParam dcConfigParam) {
        DcConfigExample example = new DcConfigExample();
        DcConfigExample.Criteria criteria = example.createCriteria();
        criteria.andStatusIn(Arrays.asList("0","1"));
        //根据名称模糊查询
        if (StringUtils.isEmpty(dcConfigParam.getName_cnd())) {
            criteria.andNameLike("%" + dcConfigParam.getName_cnd() + "%");
        }
        //根据链接模糊查询
        if (StringUtils.isEmpty(dcConfigParam.getUrl_cnd())) {
            criteria.andUrlLike("%" + dcConfigParam.getUrl_cnd() + "%");
        }
        //根据位置查询
        if (StringUtils.isEmpty(dcConfigParam.getPosition_cnd())) {
            criteria.andPositionEqualTo(dcConfigParam.getPosition_cnd());
        }
        //根据状态查询
        if (StringUtils.isEmpty(dcConfigParam.getStatus_cnd())) {
            criteria.andStatusEqualTo(dcConfigParam.getStatus_cnd());
        }
        //根据开始时间模糊查询
        if(StringUtils.isEmpty(dcConfigParam.getStart_time_FROM_cnd())) {
            criteria.andStartTimeGreaterThanOrEqualTo(dcConfigParam.getStart_time_FROM_cnd());
        }
        if(StringUtils.isEmpty(dcConfigParam.getStart_time_TO_cnd())) {
            criteria.andStartTimeLessThanOrEqualTo(dcConfigParam.getStart_time_TO_cnd() +" 23:59:59 ");
        }
        //根据结束时间模糊查询
        if(StringUtils.isEmpty(dcConfigParam.getEnd_time_FROM_cnd())) {
            criteria.andEndTimeGreaterThanOrEqualTo(dcConfigParam.getEnd_time_FROM_cnd());
        }
        if(StringUtils.isEmpty(dcConfigParam.getEnd_time_TO_cnd())) {
            criteria.andEndTimeLessThanOrEqualTo(dcConfigParam.getStart_time_TO_cnd() +" 23:59:59 ");
        }
        example.setOrderByClause("sort asc");
        List<DcConfig> dcConfig = dcConfigMapper.selectByExample(example);
        List<DcConfigResult> dcConfigResult = new ArrayList<>();
        BeanUtils.copyProperties(dcConfig,dcConfigResult);
        for(int i = 0; i < dcConfigResult.size(); i++) {
            if("0".equals(dcConfigResult.get(i).getAssociateType())) {
                //商品
                DcProduct dcProduct = dcProductMapper.selectByPrimaryKey(dcConfigResult.get(i).getAssociateId());
                dcConfigResult.get(i).setAssociate_name(dcProduct.getName());
            } else if("1".equals(dcConfigResult.get(i).getAssociateType())) {
                //资讯
                DcNews dcNews = dcNewsMapper.selectByPrimaryKey(dcConfigResult.get(i).getAssociateId());
                dcConfigResult.get(i).setAssociate_name(dcNews.getTitle());
            }
        }
        return dcConfigResult;
    }

    @Override
    public CommonResult saveSpreadConfig(DcConfig dcConfigParam) {
        int count;
        boolean f = "".equals(dcConfigParam.getId()) ? true : false;
        DcConfigExample example = new DcConfigExample();
        DcConfigExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(dcConfigParam.getName());
        criteria.andStatusNotEqualTo("2");
        if(!f) {
            criteria.andIdNotEqualTo(dcConfigParam.getId());
        }
        List<DcConfig> temp = dcConfigMapper.selectByExample(example);
        if(null != temp) {
            return CommonResult.failed("该名称已经被使用，请重新输入");
        }

        if("0".equals(dcConfigParam.getPosition()) && "0".equals(dcConfigParam.getStatus())) {
            DcConfig dcConfig1 = dcConfigMapper.qrySpreadConfigByOn();
            if(null != dcConfig1) {
                return CommonResult.failed("首页有且只能有一个上架的首页");
            }
        }

        DcConfig dcConfig = new DcConfig();
        dcConfig.setName(dcConfigParam.getName());
        dcConfig.setPosition(dcConfigParam.getPosition());
        if(StringUtil.isNotEmpty(dcConfigParam.getAssociateType())) {
            dcConfig.setAssociateType(dcConfigParam.getAssociateType());
        } else {
            dcConfig.setAssociateType(null);
        }
        if(dcConfigParam.getAssociateId()!= null) {
            dcConfig.setAssociateId(dcConfigParam.getAssociateId());
        } else {
            dcConfig.setAssociateId(null);
        }
        dcConfig.setPicPath(dcConfigParam.getPicPath());
        dcConfig.setUrl(dcConfigParam.getUrl());
        dcConfig.setStartTime(dcConfigParam.getStartTime());
        if(dcConfigParam.getEndTime()!= null) {
            dcConfig.setEndTime(dcConfigParam.getEndTime());
        } else {
            dcConfig.setEndTime(null);
        }
        dcConfig.setRemark(dcConfigParam.getRemark());
        dcConfig.setSort(dcConfigParam.getSort());
        dcConfig.setStatus(dcConfigParam.getStatus());

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());

        if(f) {
            //创建
            count = dcConfigMapper.insertSelective(dcConfig);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("保存配置");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);

        } else {
            //更新
            dcConfig.setId(dcConfigParam.getId());
            count = dcConfigMapper.updateByPrimaryKeySelective(dcConfig);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("修改配置");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }

    @Override
    public DcConfig qrySpreadConfigById(Integer id) {
        return dcConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public CommonResult updateSpreadConfig(Integer id, String status) {
        int count = 0;
        DcConfig dcConfig = dcConfigMapper.selectByPrimaryKey(id);
        if(null != dcConfig) {
            if("1".equals(status)) {
                //下架商品
                if("1".equals(dcConfig.getStatus())) {
                    return CommonResult.failed("配置已下架，请刷新后重试");
                }
                dcConfig.setStatus(status);
            } else if("0".equals(status)){
                //上架商品
                DcConfig dcConfig1 = dcConfigMapper.qrySpreadConfigByOn();
                if(null != dcConfig1) {
                    return CommonResult.failed("首页有且只能有一个上架的首页");
                }
                if("0".equals(dcConfig.getStatus())) {
                    return CommonResult.failed("配置已上架，请刷新后重试");
                }
                dcConfig.setStatus(status);
            } else if("2".equals(status)){
                //删除商品
                dcConfig.setStatus(status);
            }
            count = dcConfigMapper.updateByPrimaryKey(dcConfig);

            IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
            ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
            ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("上下架、配置商品");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }
}
