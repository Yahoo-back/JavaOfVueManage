package com.hyy.ifm.service;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.mbg.model.IfmSysMuen;

import java.util.List;
import java.util.Map;

/**
 * 菜单Service
 * Created by macro on 2019/08/29.
 */
public interface MuenService {
    /**
     * 查询所有角色
     */
    List<Map<String, String>> qryAllMeuns();

    /**
     * 保存更新菜单
     */
    CommonResult saveMuen(IfmSysMuen ifmSysMuen);

    /**
     * 根据id查询菜单
     */
    Map<String, String> qryMeun(Integer id);

    /**
     * 删除菜单
     */
    int deleteMuen(Integer id);
}
