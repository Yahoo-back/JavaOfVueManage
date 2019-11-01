package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.CjConfig;
import com.hyy.ifm.mbg.model.CjConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CjConfigMapper {
    int countByExample(CjConfigExample example);

    int deleteByExample(CjConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CjConfig record);

    int insertSelective(CjConfig record);

    List<CjConfig> selectByExample(CjConfigExample example);

    CjConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CjConfig record, @Param("example") CjConfigExample example);

    int updateByExample(@Param("record") CjConfig record, @Param("example") CjConfigExample example);

    int updateByPrimaryKeySelective(CjConfig record);

    int updateByPrimaryKey(CjConfig record);
}