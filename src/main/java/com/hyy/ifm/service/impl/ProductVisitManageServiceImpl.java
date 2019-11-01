package com.hyy.ifm.service.impl;

import com.github.pagehelper.PageHelper;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.common.utils.UserUtils;
import com.hyy.ifm.dao.DcProductVisitManageDao;
import com.hyy.ifm.dto.DcProductVisitManageParam;
import com.hyy.ifm.dto.DcProductVisitManageResult;
import com.hyy.ifm.dto.ProductType;
import com.hyy.ifm.mbg.mapper.DcProductVisitManageMapper;
import com.hyy.ifm.mbg.mapper.IfmSysUserOperateMapper;
import com.hyy.ifm.mbg.model.DcProductVisitManage;
import com.hyy.ifm.mbg.model.IfmSysUserOperate;
import com.hyy.ifm.service.ProductVisitManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 商品访问管理Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class ProductVisitManageServiceImpl implements ProductVisitManageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductVisitManageServiceImpl.class);
    @Autowired
    private DcProductVisitManageDao dcProductVisitManageDao;
    @Autowired
    private DcProductVisitManageMapper dcProductVisitManageMapper;
    @Autowired
    private IfmSysUserOperateMapper ifmSysUserOperateMapper;

    @Override
    public List<DcProductVisitManageResult> qryProductVisitManageList(DcProductVisitManageParam dcProductVisitManageParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return dcProductVisitManageDao.qryProductVisitManageList(dcProductVisitManageParam);
    }

    @Override
    public int saveProductVisitManage(DcProductVisitManage dcProductVisitManage) {
        int count;
        boolean f = StringUtils.isEmpty(dcProductVisitManage.getId()) ? true : false;
        if(!StringUtils.isEmpty(dcProductVisitManage.getMoney())) {
            dcProductVisitManage.setIsMoney("0");
        }
        dcProductVisitManage.setStatus("0");

        IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
        ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
        ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
        if(f) {
            //创建
            dcProductVisitManage.setCreateTime(new Date());
            dcProductVisitManageMapper.insertSelective(dcProductVisitManage);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("保存商品");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);

        } else {
            //更新
            dcProductVisitManageMapper.updateByPrimaryKeySelective(dcProductVisitManage);

            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("修改商品");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        count = 1;
        return count;
    }

    @Override
    public DcProductVisitManage qryProductVisitManageById(Integer id) {
        return dcProductVisitManageMapper.selectByPrimaryKey(id);
    }

    @Override
    public Map<String, Object> qryProductVisitCount(Integer id) {
        return dcProductVisitManageDao.qryProductVisitCount(id);
    }

    @Override
    public CommonResult updateProductVisitManage(Integer id, String status) {

        DcProductVisitManage dcProductVisitManage = dcProductVisitManageMapper.selectByPrimaryKey(id);
        int count = 0;
        if(null != dcProductVisitManage) {
            if(ProductType.UNDER_GOODS.equals(status)) {
                //开启
                if(ProductType.UNDER_GOODS.equals(dcProductVisitManage.getStatus())) {
                    return CommonResult.failed("已开启，请刷新后重试");
                }
                dcProductVisitManage.setStatus("0");
            } else if(ProductType.PUT_GOODS.equals(status)){
                //关闭
                if(ProductType.PUT_GOODS.equals(dcProductVisitManage.getStatus())) {
                    return CommonResult.failed("已关闭，请刷新后重试");
                }
                dcProductVisitManage.setStatus("1");
            }
            count = dcProductVisitManageMapper.updateByPrimaryKey(dcProductVisitManage);

            IfmSysUserOperate ifmUserOperate = new IfmSysUserOperate();
            ifmUserOperate.setIfmUserId(UserUtils.getCurrentHr().getUserid());
            ifmUserOperate.setAddress(UserUtils.getCurrentHr().getAddress());
            ifmUserOperate.setOperateDate(new Date());
            ifmUserOperate.setOperate("开启关闭商品访问管理");
            ifmSysUserOperateMapper.insertSelective(ifmUserOperate);
        }
        return CommonResult.success(count);
    }

    @Override
    public List<Map<String, Object>> qryVisitProductListAll () {
        return dcProductVisitManageDao.qryVisitProductListAll();
    }
}
