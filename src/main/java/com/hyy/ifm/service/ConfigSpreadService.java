package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DcConfigParam;
import com.hyy.ifm.dto.DcConfigResult;
import com.hyy.ifm.mbg.model.DcConfig;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 推广配置Service
 * Created by macro on 2019/08/29.
 */
public interface ConfigSpreadService {

    /**
     * 列表
     */
    List<DcConfigResult> qrySpreadConfigList(DcConfigParam dcConfigParam, Integer pageSize, Integer pageNum);

    /**
     * 导出
     */
    List<DcConfigResult> exportSpreadConfigList(DcConfigParam dcConfigParam);

    /**
     * 保存
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    CommonResult saveSpreadConfig(DcConfig dcConfig);

    /**
     * 根据id查询
     */
    DcConfig qrySpreadConfigById(Integer id);

    /**
     * 修改推广配置状态
     */
    CommonResult updateSpreadConfig(Integer id, String status);

}
