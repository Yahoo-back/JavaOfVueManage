package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.IfmSysSms;
import com.hyy.ifm.mbg.model.IfmSysSmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IfmSysSmsMapper {
    int countByExample(IfmSysSmsExample example);

    int deleteByExample(IfmSysSmsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IfmSysSms record);

    int insertSelective(IfmSysSms record);

    List<IfmSysSms> selectByExample(IfmSysSmsExample example);

    IfmSysSms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IfmSysSms record, @Param("example") IfmSysSmsExample example);

    int updateByExample(@Param("record") IfmSysSms record, @Param("example") IfmSysSmsExample example);

    int updateByPrimaryKeySelective(IfmSysSms record);

    int updateByPrimaryKey(IfmSysSms record);
}