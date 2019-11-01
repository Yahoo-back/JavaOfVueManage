package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DcProductVisitManageParam;
import com.hyy.ifm.dto.DcProductVisitManageResult;
import com.hyy.ifm.mbg.model.DcProductVisitManage;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 商品访问管理Service
 * Created by macro on 2019/08/29.
 */
public interface ProductVisitManageService {

    /**
     * 商品访问管理列表
     */
    List<DcProductVisitManageResult> qryProductVisitManageList(DcProductVisitManageParam dcProductVisitManageParam, Integer pageSize, Integer pageNum);

    /**
     * 保存
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int saveProductVisitManage(DcProductVisitManage dcProductVisitManage);

    /**
     * 根据id查询
     */
    DcProductVisitManage qryProductVisitManageById(Integer id);

    /**
     * 查询商品当天访问数
     */
    Map<String, Object> qryProductVisitCount(Integer id);

    /**
     * 修改商品访问管理状态
     */
    CommonResult updateProductVisitManage(Integer id, String status);

    /**
     * 查询所有商品列表不包括删除和已管理的
     */
    List<Map<String, Object>> qryVisitProductListAll();

}
