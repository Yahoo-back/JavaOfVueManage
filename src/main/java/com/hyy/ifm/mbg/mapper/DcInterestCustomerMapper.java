package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcInterestCustomer;
import com.hyy.ifm.mbg.model.DcInterestCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcInterestCustomerMapper {
    int countByExample(DcInterestCustomerExample example);

    int deleteByExample(DcInterestCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcInterestCustomer record);

    int insertSelective(DcInterestCustomer record);

    List<DcInterestCustomer> selectByExample(DcInterestCustomerExample example);

    DcInterestCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcInterestCustomer record, @Param("example") DcInterestCustomerExample example);

    int updateByExample(@Param("record") DcInterestCustomer record, @Param("example") DcInterestCustomerExample example);

    int updateByPrimaryKeySelective(DcInterestCustomer record);

    int updateByPrimaryKey(DcInterestCustomer record);
}