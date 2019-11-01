package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcCollection;
import com.hyy.ifm.mbg.model.DcCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcCollectionMapper {
    int countByExample(DcCollectionExample example);

    int deleteByExample(DcCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcCollection record);

    int insertSelective(DcCollection record);

    List<DcCollection> selectByExample(DcCollectionExample example);

    DcCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcCollection record, @Param("example") DcCollectionExample example);

    int updateByExample(@Param("record") DcCollection record, @Param("example") DcCollectionExample example);

    int updateByPrimaryKeySelective(DcCollection record);

    int updateByPrimaryKey(DcCollection record);
}