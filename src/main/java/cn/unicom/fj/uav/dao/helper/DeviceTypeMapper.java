package cn.unicom.fj.uav.dao.helper;


import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeviceTypeMapper {

    @Select("select device_type from ent_device group by device_type")
    List<String> getAllType();
}
