package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.DcDictParam;
import com.hyy.ifm.mbg.model.DcDict;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务配置Service
 * Created by macro on 2019/08/29.
 */
public interface ConfigDictService {

    /**
     * 根据data_type查询字段表
     */
    List<DcDict> qryDictByDataType(String data_type);

    /**
     * 列表
     */
    List<DcDict> qryDictConfigList(DcDictParam dcDictParam, Integer pageSize, Integer pageNum);

    /**
     * 导出
     */
    List<DcDict> exportDictConfigList(DcDictParam dcDictParam);

    /**
     * 保存
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    CommonResult saveConfigDict(DcDict dcDict);

    /**
     * 保存
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    CommonResult saveConfig(DcDict dcDict);

    /**
     * 根据id查询
     */
    DcDict qryDictById(Integer id);

    /**
     *
     */
    List<DcDict> qryDictByDataShow();

    /**
     * 修改业务配置状态
     */
    CommonResult updateConfigDict(Integer id, String status);

}
