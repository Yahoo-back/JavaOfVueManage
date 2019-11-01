package com.hyy.ifm.dao;

import com.hyy.ifm.dto.DcProductVisitManageParam;
import com.hyy.ifm.dto.DcProductVisitManageResult;

import java.util.List;
import java.util.Map;


/**
 * 商品访问管理自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface DcProductVisitManageDao {

    List<DcProductVisitManageResult> qryProductVisitManageList(DcProductVisitManageParam dcProductVisitManageParam);

    Map<String, Object> qryProductVisitCount(Integer id);

    List<Map<String, Object>> qryVisitProductListAll();

}
