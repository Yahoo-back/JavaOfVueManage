package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClSms;
import com.hyy.ifm.mbg.model.ClSmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClSmsMapper {
    int countByExample(ClSmsExample example);

    int deleteByExample(ClSmsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClSms record);

    int insertSelective(ClSms record);

    List<ClSms> selectByExample(ClSmsExample example);

    ClSms selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClSms record, @Param("example") ClSmsExample example);

    int updateByExample(@Param("record") ClSms record, @Param("example") ClSmsExample example);

    int updateByPrimaryKeySelective(ClSms record);

    int updateByPrimaryKey(ClSms record);
}