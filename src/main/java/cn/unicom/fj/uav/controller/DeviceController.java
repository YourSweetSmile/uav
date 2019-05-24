package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.helper.DeviceHelper;
import cn.unicom.fj.uav.service.DeviceService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 设备控制器
 * @author yinjw
 */
@RestController
@RequestMapping("/dev")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    /**
     * 获取列表并分页
     * @param pageNo
     * @param pageSize
     * @param deviceHelper
     * @return
     */
    @PostMapping("/list")
    public PageInfo getList(
            @RequestParam("page") Integer pageNo,
            @RequestParam("limit") Integer pageSize,
            @RequestBody DeviceHelper deviceHelper) {

        return deviceService.getScopedDevice(pageNo, pageSize, deviceHelper);
    }

    /**
     * 添加设备
     * @param device
     */
    @PostMapping("/add")
    public void addDevice(@RequestBody Device device){

        deviceService.addDevice(device);
    }

    /**
     * 根据id修改设备字段
     * @param device
     */
    @PostMapping("/edit")
    public void editDevice(@RequestBody Device device){

        deviceService.updateDev(device);
    }

    /**
     * 修改设备状态
     * @param id
     * @param deviceStatus
     */
    @GetMapping("/edit/status")
    public void stopDevice(Short id, String deviceStatus){
        deviceService.stopDev(id, deviceStatus);
    }
}
