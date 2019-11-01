package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmRoleMuenExample;
import com.hyy.ifm.mbg.model.IfmRoleMuen;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfmRoleMuenMapper {
    int countByExample(IfmRoleMuenExample example);

    int deleteByExample(IfmRoleMuenExample example);

    int insert(IfmRoleMuen record);

    int insertSelective(IfmRoleMuen record);

    List<IfmRoleMuen> selectByExample(IfmRoleMuenExample example);

    int updateByExampleSelective(@Param("record") IfmRoleMuen record, @Param("example") IfmRoleMuenExample example);

    int updateByExample(@Param("record") IfmRoleMuen record, @Param("example") IfmRoleMuenExample example);
}