package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmSysMuen;
import com.hyy.ifm.mbg.model.IfmSysMuenExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IfmSysMuenMapper {
    int countByExample(IfmSysMuenExample example);

    int deleteByExample(IfmSysMuenExample example);

    int deleteByPrimaryKey(Integer muenid);

    int insert(IfmSysMuen record);

    int insertSelective(IfmSysMuen record);

    List<IfmSysMuen> selectByExample(IfmSysMuenExample example);

    IfmSysMuen selectByPrimaryKey(Integer muenid);

    int updateByExampleSelective(@Param("record") IfmSysMuen record, @Param("example") IfmSysMuenExample example);

    int updateByExample(@Param("record") IfmSysMuen record, @Param("example") IfmSysMuenExample example);

    int updateByPrimaryKeySelective(IfmSysMuen record);

    int updateByPrimaryKey(IfmSysMuen record);
}