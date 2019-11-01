package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.KqOrder;
import com.hyy.ifm.mbg.model.KqOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KqOrderMapper {
    int countByExample(KqOrderExample example);

    int deleteByExample(KqOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KqOrder record);

    int insertSelective(KqOrder record);

    List<KqOrder> selectByExample(KqOrderExample example);

    KqOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KqOrder record, @Param("example") KqOrderExample example);

    int updateByExample(@Param("record") KqOrder record, @Param("example") KqOrderExample example);

    int updateByPrimaryKeySelective(KqOrder record);

    int updateByPrimaryKey(KqOrder record);
}