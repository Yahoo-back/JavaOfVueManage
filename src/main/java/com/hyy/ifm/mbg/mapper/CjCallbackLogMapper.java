package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.CjCallbackLog;
import com.hyy.ifm.mbg.model.CjCallbackLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CjCallbackLogMapper {
    int countByExample(CjCallbackLogExample example);

    int deleteByExample(CjCallbackLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CjCallbackLog record);

    int insertSelective(CjCallbackLog record);

    List<CjCallbackLog> selectByExample(CjCallbackLogExample example);

    CjCallbackLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CjCallbackLog record, @Param("example") CjCallbackLogExample example);

    int updateByExample(@Param("record") CjCallbackLog record, @Param("example") CjCallbackLogExample example);

    int updateByPrimaryKeySelective(CjCallbackLog record);

    int updateByPrimaryKey(CjCallbackLog record);
}