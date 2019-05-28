package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.helper.DeviceTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTypeService {

    @Autowired
    private DeviceTypeMapper deviceTypeMapper;

    /**
     * 获取所有设备类型
     * @return
     */
    public List<String> getAll(){
        return deviceTypeMapper.getAllType();
    }
}
