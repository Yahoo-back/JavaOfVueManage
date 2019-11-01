package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.XfConfig;
import com.hyy.ifm.mbg.model.XfConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XfConfigMapper {
    int countByExample(XfConfigExample example);

    int deleteByExample(XfConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XfConfig record);

    int insertSelective(XfConfig record);

    List<XfConfig> selectByExample(XfConfigExample example);

    XfConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XfConfig record, @Param("example") XfConfigExample example);

    int updateByExample(@Param("record") XfConfig record, @Param("example") XfConfigExample example);

    int updateByPrimaryKeySelective(XfConfig record);

    int updateByPrimaryKey(XfConfig record);
}