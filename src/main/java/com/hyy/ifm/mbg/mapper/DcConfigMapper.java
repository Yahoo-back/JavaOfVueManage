package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcConfig;
import com.hyy.ifm.mbg.model.DcConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcConfigMapper {
    int countByExample(DcConfigExample example);

    int deleteByExample(DcConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcConfig record);

    int insertSelective(DcConfig record);

    List<DcConfig> selectByExample(DcConfigExample example);

    DcConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcConfig record, @Param("example") DcConfigExample example);

    int updateByExample(@Param("record") DcConfig record, @Param("example") DcConfigExample example);

    int updateByPrimaryKeySelective(DcConfig record);

    int updateByPrimaryKey(DcConfig record);

    /**
     * 查询上架的首页
     * @return
     */
    DcConfig qrySpreadConfigByOn();
}
