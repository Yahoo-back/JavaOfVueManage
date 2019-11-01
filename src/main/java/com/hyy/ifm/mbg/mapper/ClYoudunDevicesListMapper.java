package com.hyy.ifm.mbg.mapper;

import com.hyy.ifm.mbg.model.ClYoudunDevicesList;
import com.hyy.ifm.mbg.model.ClYoudunDevicesListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClYoudunDevicesListMapper {
    int countByExample(ClYoudunDevicesListExample example);

    int deleteByExample(ClYoudunDevicesListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClYoudunDevicesList record);

    int insertSelective(ClYoudunDevicesList record);

    List<ClYoudunDevicesList> selectByExampleWithBLOBs(ClYoudunDevicesListExample example);

    List<ClYoudunDevicesList> selectByExample(ClYoudunDevicesListExample example);

    ClYoudunDevicesList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClYoudunDevicesList record, @Param("example") ClYoudunDevicesListExample example);

    int updateByExampleWithBLOBs(@Param("record") ClYoudunDevicesList record, @Param("example") ClYoudunDevicesListExample example);

    int updateByExample(@Param("record") ClYoudunDevicesList record, @Param("example") ClYoudunDevicesListExample example);

    int updateByPrimaryKeySelective(ClYoudunDevicesList record);

    int updateByPrimaryKeyWithBLOBs(ClYoudunDevicesList record);

    int updateByPrimaryKey(ClYoudunDevicesList record);
}