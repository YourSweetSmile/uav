package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.helper.DeviceHelperMapper;
import cn.unicom.fj.uav.exception.SysRuntimeExeption;
import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.helper.DeviceHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
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

    /**
     * 根据条件查询列表并分页
     * @param deviceHelper
     * @return
     */
    public PageInfo getScopedDevice(Integer pageNo, Integer pageSize, DeviceHelper deviceHelper){

        PageHelper.startPage(pageNo, pageSize);
        List<DeviceHelper> list = deviceHelperMapper.selectByHelper(deviceHelper);

        return new PageInfo<>(list);

    }

    /**
     * 增加一条记录
     * @param device
     */
    public void addDevice(Device device){

        if(null == device || null != device.getId()){

            throw new SysRuntimeExeption("设备信息必须传入且id必须为空");
        }
        deviceHelperMapper.insert(device);
    }

    /**
     * 修改设备
     * @param device
     */
    public void updateDev(Device device){

        if(null == device || null == device.getId()){
            throw new SysRuntimeExeption("传入设备不能为空且唯一识别ID不能为空");
        }
//        Device deviceDb = deviceHelperMapper.selectByPrimaryKey(device.getId());
//
//        if(StringUtils.isBlank(device.getDeviceName())){
//            deviceDb.setDeviceName(device.getDeviceName());
//        }
//        if(StringUtils.isBlank(device.getDeviceDesc())){
//            deviceDb.setDeviceDesc(device.getDeviceDesc());
//        }
//        if(StringUtils.isBlank(device.getDeviceType())){
//            deviceDb.setDeviceType(device.getDeviceType());
//        }
//        if(StringUtils.isBlank(device.getDeviceStatus())){
//            deviceDb.setDeviceStatus(device.getDeviceStatus());
//        }

        deviceHelperMapper.updateByPrimaryKeySelective(device);
    }

    /**
     * 修改状态
     * @param id
     * @param deviceStatus
     */
    public void stopDev(Short id, String deviceStatus){
        Device device = deviceHelperMapper.selectByPrimaryKey(id);

        if(null == device){
            throw new SysRuntimeExeption("此设备未找到");
        }

        if("飞行中".equals(device.getDeviceStatus())){

            throw new SysRuntimeExeption("此设备正在飞行中");
        }

        device.setDeviceStatus(deviceStatus);
        deviceHelperMapper.updateByPrimaryKey(device);
    }
}
