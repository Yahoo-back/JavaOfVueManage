package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.DcNewsAssociate;
import com.hyy.ifm.mbg.model.DcNewsAssociateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcNewsAssociateMapper {
    int countByExample(DcNewsAssociateExample example);

    int deleteByExample(DcNewsAssociateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcNewsAssociate record);

    int insertSelective(DcNewsAssociate record);

    List<DcNewsAssociate> selectByExample(DcNewsAssociateExample example);

    DcNewsAssociate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcNewsAssociate record, @Param("example") DcNewsAssociateExample example);

    int updateByExample(@Param("record") DcNewsAssociate record, @Param("example") DcNewsAssociateExample example);

    int updateByPrimaryKeySelective(DcNewsAssociate record);

    int updateByPrimaryKey(DcNewsAssociate record);
}