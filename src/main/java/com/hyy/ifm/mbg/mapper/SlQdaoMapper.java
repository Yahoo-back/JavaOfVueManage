package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.SlQdao;
import com.hyy.ifm.mbg.model.SlQdaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlQdaoMapper {
    int countByExample(SlQdaoExample example);

    int deleteByExample(SlQdaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SlQdao record);

    int insertSelective(SlQdao record);

    List<SlQdao> selectByExample(SlQdaoExample example);

    SlQdao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SlQdao record, @Param("example") SlQdaoExample example);

    int updateByExample(@Param("record") SlQdao record, @Param("example") SlQdaoExample example);

    int updateByPrimaryKeySelective(SlQdao record);

    int updateByPrimaryKey(SlQdao record);
}