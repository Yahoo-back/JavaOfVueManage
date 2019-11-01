package com.hyy.ifm.dao;

import com.hyy.ifm.mbg.model.IfmRoleMuen;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 角色自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface IfmRoleMuenDao {

    /**
     * 批量插入员工分配的角色
     */
    int insertList(@Param("list") List<IfmRoleMuen> rms);

    /**
     * 查询所有菜单
     */
    List<Map<String, String>> qryAllMuens();
}
