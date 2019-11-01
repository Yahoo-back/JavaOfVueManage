package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcProductVisitManage;
import com.hyy.ifm.mbg.model.DcProductVisitManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcProductVisitManageMapper {
    int countByExample(DcProductVisitManageExample example);

    int deleteByExample(DcProductVisitManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcProductVisitManage record);

    int insertSelective(DcProductVisitManage record);

    List<DcProductVisitManage> selectByExample(DcProductVisitManageExample example);

    DcProductVisitManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcProductVisitManage record, @Param("example") DcProductVisitManageExample example);

    int updateByExample(@Param("record") DcProductVisitManage record, @Param("example") DcProductVisitManageExample example);

    int updateByPrimaryKeySelective(DcProductVisitManage record);

    int updateByPrimaryKey(DcProductVisitManage record);
}