package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.helper.DeviceHelperMapper;
import cn.unicom.fj.uav.model.helper.DeviceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceHelperMapper deviceHelperMapper;

    /**
     * 根据条件查询列表
     * @param deviceHelper
     * @return
     */
    public List<DeviceHelper> getDevice(DeviceHelper deviceHelper){

        return deviceHelperMapper.selectByHelper(deviceHelper);
    }
}