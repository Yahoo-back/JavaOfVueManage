package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.HlbCallbackLog;
import com.hyy.ifm.mbg.model.HlbCallbackLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HlbCallbackLogMapper {
    int countByExample(HlbCallbackLogExample example);

    int deleteByExample(HlbCallbackLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HlbCallbackLog record);

    int insertSelective(HlbCallbackLog record);

    List<HlbCallbackLog> selectByExample(HlbCallbackLogExample example);

    HlbCallbackLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HlbCallbackLog record, @Param("example") HlbCallbackLogExample example);

    int updateByExample(@Param("record") HlbCallbackLog record, @Param("example") HlbCallbackLogExample example);

    int updateByPrimaryKeySelective(HlbCallbackLog record);

    int updateByPrimaryKey(HlbCallbackLog record);
}