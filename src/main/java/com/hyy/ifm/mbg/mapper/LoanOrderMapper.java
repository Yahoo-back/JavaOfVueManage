package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.LoanOrder;
import com.hyy.ifm.mbg.model.LoanOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanOrderMapper {
    int countByExample(LoanOrderExample example);

    int deleteByExample(LoanOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(LoanOrder record);

    int insertSelective(LoanOrder record);

    List<LoanOrder> selectByExample(LoanOrderExample example);

    LoanOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LoanOrder record, @Param("example") LoanOrderExample example);

    int updateByExample(@Param("record") LoanOrder record, @Param("example") LoanOrderExample example);

    int updateByPrimaryKeySelective(LoanOrder record);

    int updateByPrimaryKey(LoanOrder record);
}