package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcUserRefund;
import com.hyy.ifm.mbg.model.DcUserRefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcUserRefundMapper {
    int countByExample(DcUserRefundExample example);

    int deleteByExample(DcUserRefundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcUserRefund record);

    int insertSelective(DcUserRefund record);

    List<DcUserRefund> selectByExample(DcUserRefundExample example);

    DcUserRefund selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcUserRefund record, @Param("example") DcUserRefundExample example);

    int updateByExample(@Param("record") DcUserRefund record, @Param("example") DcUserRefundExample example);

    int updateByPrimaryKeySelective(DcUserRefund record);

    int updateByPrimaryKey(DcUserRefund record);
}