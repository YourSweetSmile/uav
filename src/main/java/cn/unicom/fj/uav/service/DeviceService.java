package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.helper.DeviceHelperMapper;
import cn.unicom.fj.uav.exception.SysRuntimeExeption;
import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.helper.DeviceHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public void updateDev(Device device){

        if(null == device || null == device.getId()){
            throw new SysRuntimeExeption("传入设备不能为空且唯一识别ID不能为空");
        }
        Device deviceDb = deviceHelperMapper.selectByPrimaryKey(device.getId());


    }
}
