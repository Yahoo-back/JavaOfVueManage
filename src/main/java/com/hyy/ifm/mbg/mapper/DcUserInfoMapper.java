package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcUserInfo;
import com.hyy.ifm.mbg.model.DcUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcUserInfoMapper {
    int countByExample(DcUserInfoExample example);

    int deleteByExample(DcUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcUserInfo record);

    int insertSelective(DcUserInfo record);

    List<DcUserInfo> selectByExample(DcUserInfoExample example);

    DcUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcUserInfo record, @Param("example") DcUserInfoExample example);

    int updateByExample(@Param("record") DcUserInfo record, @Param("example") DcUserInfoExample example);

    int updateByPrimaryKeySelective(DcUserInfo record);

    int updateByPrimaryKey(DcUserInfo record);
}