package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClYoudunLoanDetail;
import com.hyy.ifm.mbg.model.ClYoudunLoanDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClYoudunLoanDetailMapper {
    int countByExample(ClYoudunLoanDetailExample example);

    int deleteByExample(ClYoudunLoanDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClYoudunLoanDetail record);

    int insertSelective(ClYoudunLoanDetail record);

    List<ClYoudunLoanDetail> selectByExampleWithBLOBs(ClYoudunLoanDetailExample example);

    List<ClYoudunLoanDetail> selectByExample(ClYoudunLoanDetailExample example);

    ClYoudunLoanDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClYoudunLoanDetail record, @Param("example") ClYoudunLoanDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") ClYoudunLoanDetail record, @Param("example") ClYoudunLoanDetailExample example);

    int updateByExample(@Param("record") ClYoudunLoanDetail record, @Param("example") ClYoudunLoanDetailExample example);

    int updateByPrimaryKeySelective(ClYoudunLoanDetail record);

    int updateByPrimaryKeyWithBLOBs(ClYoudunLoanDetail record);

    int updateByPrimaryKey(ClYoudunLoanDetail record);
}