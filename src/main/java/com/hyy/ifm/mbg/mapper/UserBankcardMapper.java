package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.UserBankcard;
import com.hyy.ifm.mbg.model.UserBankcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBankcardMapper {
    int countByExample(UserBankcardExample example);

    int deleteByExample(UserBankcardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBankcard record);

    int insertSelective(UserBankcard record);

    List<UserBankcard> selectByExample(UserBankcardExample example);

    UserBankcard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBankcard record, @Param("example") UserBankcardExample example);

    int updateByExample(@Param("record") UserBankcard record, @Param("example") UserBankcardExample example);

    int updateByPrimaryKeySelective(UserBankcard record);

    int updateByPrimaryKey(UserBankcard record);
}