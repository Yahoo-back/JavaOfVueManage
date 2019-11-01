package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dao.DcProductDao;
import com.hyy.ifm.dto.DcProductParam;
import com.hyy.ifm.dto.ProductType;
import com.hyy.ifm.mbg.mapper.DcProductClassifyMapper;
import com.hyy.ifm.mbg.mapper.DcProductMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserOperateMapper;
import com.hyy.ifm.mbg.model.*;
import com.hyy.ifm.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 商品管理Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class ProductServiceImpl implements ProductService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    private DcProductDao dcProductDao;
    @Autowired
    private DcProductMapper dcProductMapper;
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;
    @Autowired
    private DcProductClassifyMapper dcProductClassifyMapper;

    @Override
    public List<Map<String, Object>> qryProductList(DcProductParam dcProductParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return dcProductDao.qryProductList(dcProductParam);
    }

    @Override
    public List<Map<String, Object>> exportProductList (DcProductParam dcProductParam) {
        return dcProductDao.qryProductList(dcProductParam);
    }

    @Override
    public CommonResult saveProduct(DcProduct dcProduct) {
        int count;
        boolean f = "".equals(dcProduct.getId()) ? true : false;
        DcProductExample example = new DcProductExample();
        DcProductExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(dcProduct.getName());
        criteria.andStatusNotEqualTo("2");
        if(!f) {
            criteria.andIdNotEqualTo(dcProduct.getId());
        }
        List<DcProduct> temp = dcProductMapper.selectByExample(example);
        if(null != temp) {
            return CommonResult.failed("该名称已经被使用，请重新输入");
        }

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        if(f) {
            //创建
            dcProduct.setPosition("0");
            dcProduct.setApplyNum("0");
            dcProduct.setCreateTime(new Date());
            count = dcProductMapper.insertSelective(dcProduct);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("保存商品");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);

        } else {
            //更新
            count = dcProductMapper.updateByPrimaryKeySelective(dcProduct);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("修改商品");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }

    @Override
    public DcProduct qryProductById(Integer id) {
        return dcProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public CommonResult updateProduct(Integer id, String status) {
        int count = 0;
        DcProduct dcProduct = dcProductMapper.selectByPrimaryKey(id);
        if(null != dcProduct) {
            if(ProductType.UNDER_GOODS.equals(status)) {
                //下架商品
                if(ProductType.UNDER_GOODS.equals(dcProduct.getStatus())) {
                    return CommonResult.failed(dcProduct.getName() + "配置已下架，请刷新后重试");
                }
                dcProduct.setStatus("0");
            } else if(ProductType.PUT_GOODS.equals(status)){
                //上架商品
                if(ProductType.PUT_GOODS.equals(dcProduct.getStatus())) {
                    return CommonResult.failed(dcProduct.getName() + "配置已上架，请刷新后重试");
                }
                dcProduct.setStatus("1");
            } else if(ProductType.DELETE_GOODS.equals(status)){
                //删除商品
                dcProduct.setStatus("2");
            }
            count = dcProductMapper.updateByPrimaryKey(dcProduct);

            IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
            ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
            ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("上下架、删除商品");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }

    @Override
    public int topPosition(Integer id) {
        DcProduct dcProduct = dcProductMapper.selectByPrimaryKey(id);
        if(null != dcProduct) {
            dcProduct.setPosition("1");
            dcProduct.setSort(0);
            dcProduct.setHotSort("0");

            IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
            ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
            ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("置顶商品");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return dcProductMapper.updateByPrimaryKey(dcProduct);
    }

    @Override
    public int basePosition(Integer id) {
        DcProduct dcProduct = dcProductMapper.selectByPrimaryKey(id);
        if(null != dcProduct) {
            dcProduct.setPosition("2");
            int count = dcProductMapper.countProductListAll();
            dcProduct.setSort(count+1);
            dcProduct.setHotSort(String.valueOf(count+1));

            IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
            ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
            ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("置尾商品");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return dcProductMapper.updateByPrimaryKey(dcProduct);
    }

    @Override
    public int cancelPosition(Integer id) {
        DcProduct dcProduct = dcProductMapper.selectByPrimaryKey(id);
        if(null != dcProduct) {
            dcProduct.setPosition("0");
            int count = dcProductMapper.countProductListAll();
            //取消置顶或置尾后 排序采用随机数规则
            Random random = new Random();
            dcProduct.setSort(random.nextInt(count));
            dcProduct.setHotSort(String.valueOf(random.nextInt(count)));

            IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
            ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
            ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("取消置顶或置尾商品");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return dcProductMapper.updateByPrimaryKey(dcProduct);
    }

    @Override
    public List<DcProduct> qryProductListAll () {
        DcProductExample example = new DcProductExample();
        example.createCriteria().andStatusNotEqualTo("2");
        return dcProductMapper.selectByExample(example);
    }

    @Override
    public List<Map<String, Object>> qryProductCompanyAll() {
        return dcProductDao.qryProductCompanyAll();
    }

    @Override
    public List<DcProductClassify> qryProductClassifyAll () {
        DcProductClassifyExample example = new DcProductClassifyExample();
        example.createCriteria().andStatusEqualTo("0");
        return dcProductClassifyMapper.selectByExample(example);
    }
}
