package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcProduct;
import com.hyy.ifm.mbg.model.DcProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DcProductMapper {
    int countByExample(DcProductExample example);

    int deleteByExample(DcProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcProduct record);

    int insertSelective(DcProduct record);

    List<DcProduct> selectByExampleWithBLOBs(DcProductExample example);

    List<DcProduct> selectByExample(DcProductExample example);

    DcProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcProduct record, @Param("example") DcProductExample example);

    int updateByExampleWithBLOBs(@Param("record") DcProduct record, @Param("example") DcProductExample example);

    int updateByExample(@Param("record") DcProduct record, @Param("example") DcProductExample example);

    int updateByPrimaryKeySelective(DcProduct record);

    int updateByPrimaryKeyWithBLOBs(DcProduct record);

    int updateByPrimaryKey(DcProduct record);

    int countProductListAll();

}
