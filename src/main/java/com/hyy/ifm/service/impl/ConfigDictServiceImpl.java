package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dto.DcDictParam;
import com.hyy.ifm.mbg.mapper.DcDictMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserOperateMapper;
import com.hyy.ifm.mbg.model.DcDict;
import com.hyy.ifm.mbg.model.DcDictExample;
import com.hyy.ifm.mbg.model.IfmSysUserOperate;
import com.hyy.ifm.service.ConfigDictService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 业务配置Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class ConfigDictServiceImpl implements ConfigDictService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigDictServiceImpl.class);
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;
    @Autowired
    private DcDictMapper dcDictMapper;

    @Override
    public List<DcDict> qryDictByDataType(String data_type) {
        DcDictExample example = new DcDictExample();
        DcDictExample.Criteria criteria = example.createCriteria();
        criteria.andIsUseEqualTo("1");
        if(!StringUtils.isEmpty(data_type)){
            criteria.andDataTypeEqualTo(data_type);
        }
        example.setOrderByClause("xh asc");
        return dcDictMapper.selectByExample(example);
    }

    @Override
    public List<DcDict> qryDictConfigList(DcDictParam dcDictParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        DcDictExample example = new DcDictExample();
        DcDictExample.Criteria criteria = example.createCriteria();
        criteria.andIsUseIn(Arrays.asList("0","1"));
        if(StringUtils.isEmpty(dcDictParam.getData_type())) {
            criteria.andDataTypeEqualTo(dcDictParam.getData_type_cnd());
        } else {
            criteria.andDataTypeEqualTo(dcDictParam.getData_type());
        }
        if (!StringUtils.isEmpty(dcDictParam.getItem_value_cnd())) {
            criteria.andItemValueLike("%" + dcDictParam.getItem_value_cnd() + "%");
        }
        if (!StringUtils.isEmpty(dcDictParam.getIs_use_cnd())) {
            criteria.andIsUseEqualTo(dcDictParam.getIs_use_cnd());
        }
        example.setOrderByClause("xh asc");
        return dcDictMapper.selectByExample(example);
    }

    @Override
    public List<DcDict> exportDictConfigList(DcDictParam dcDictParam) {
        DcDictExample example = new DcDictExample();
        DcDictExample.Criteria criteria = example.createCriteria();
        criteria.andIsUseIn(Arrays.asList("0","1"));
        if(StringUtils.isEmpty(dcDictParam.getData_type())) {
            criteria.andDataTypeEqualTo(dcDictParam.getData_type_cnd());
        } else {
            criteria.andDataTypeEqualTo(dcDictParam.getData_type());
        }
        if (!StringUtils.isEmpty(dcDictParam.getItem_value_cnd())) {
            criteria.andItemValueLike("%" + dcDictParam.getItem_value_cnd() + "%");
        }
        if (!StringUtils.isEmpty(dcDictParam.getIs_use_cnd())) {
            criteria.andIsUseEqualTo(dcDictParam.getIs_use_cnd());
        }
        example.setOrderByClause("xh asc");
        return dcDictMapper.selectByExample(example);
    }

    @Override
    public CommonResult saveConfigDict(DcDict dcDict) {
        int count;
        boolean f = "".equals(dcDict.getId()) ? true : false;
        DcDictExample example = new DcDictExample();
        DcDictExample.Criteria criteria = example.createCriteria();
        criteria.andItemKeyEqualTo(dcDict.getItemValue());
        criteria.andIsUseNotEqualTo("2");
        if(!f) {
            criteria.andIdNotEqualTo(dcDict.getId());
        }
        List<DcDict> temp = dcDictMapper.selectByExample(example);
        if(null != temp) {
            return CommonResult.failed("该名称已经被使用，请重新输入");
        }

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());

        if(f) {
            //创建
            dcDict.setItemKey("0");
            count = dcDictMapper.insertSelective(dcDict);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("保存配置");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);

        } else {
            //更新
            count = dcDictMapper.updateByPrimaryKeySelective(dcDict);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("修改配置");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }

    @Override
    public CommonResult saveConfig(DcDict dcDict) {
        int count;
        boolean f = "".equals(dcDict.getId()) ? true : false;
        DcDictExample example = new DcDictExample();
        DcDictExample.Criteria criteria = example.createCriteria();
        criteria.andItemKeyEqualTo(dcDict.getItemValue());
        criteria.andIsUseNotEqualTo("2");
        if(!f) {
            criteria.andIdNotEqualTo(dcDict.getId());
        }
        List<DcDict> temp = dcDictMapper.selectByExample(example);
        if(null != temp) {
            return CommonResult.failed("该名称已经被使用，请重新输入");
        }
        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        if(f) {
            //创建
            dcDict.setItemKey("0");
            count = dcDictMapper.insertSelective(dcDict);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("保存配置");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);

        } else {
            //更新
            dcDict.setId(dcDict.getId());
            count = dcDictMapper.updateByPrimaryKeySelective(dcDict);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("修改配置");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }

    @Override
    public DcDict qryDictById(Integer id) {
        return dcDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<DcDict> qryDictByDataShow() {
        DcDictExample example = new DcDictExample();
        DcDictExample.Criteria criteria = example.createCriteria();
        criteria.andShoweseEqualTo("1");
        criteria.andIsUseEqualTo("1");
        example.setOrderByClause("xh asc");
        return dcDictMapper.selectByExample(example);
    }

    @Override
    public CommonResult updateConfigDict(Integer id, String status) {
        DcDict dcDict = dcDictMapper.selectByPrimaryKey(id);
        int count = 0;
        if(null != dcDict) {
            if("0".equals(status)) {
                //下架
                if("0".equals(dcDict.getIsUse())) {
                    return CommonResult.failed("配置已下架，请刷新后重试");
                }
                dcDict.setIsUse(status);
            } else if("1".equals(status)){
                //上架
                if("1".equals(dcDict.getIsUse())) {
                    return CommonResult.failed("配置已上架，请刷新后重试");
                }
                dcDict.setIsUse(status);
            } else if("2".equals(status)){
                //删除
                dcDict.setIsUse(status);
            }
            count = dcDictMapper.updateByPrimaryKey(dcDict);

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
