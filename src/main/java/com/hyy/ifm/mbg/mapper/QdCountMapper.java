package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.QdCount;
import com.hyy.ifm.mbg.model.QdCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QdCountMapper {
    int countByExample(QdCountExample example);

    int deleteByExample(QdCountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QdCount record);

    int insertSelective(QdCount record);

    List<QdCount> selectByExample(QdCountExample example);

    QdCount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QdCount record, @Param("example") QdCountExample example);

    int updateByExample(@Param("record") QdCount record, @Param("example") QdCountExample example);

    int updateByPrimaryKeySelective(QdCount record);

    int updateByPrimaryKey(QdCount record);
}