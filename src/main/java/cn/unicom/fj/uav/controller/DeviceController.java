package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.helper.DeviceHelper;
import cn.unicom.fj.uav.service.DeviceService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
            Integer pageNo, Integer pageSize,
            @RequestBody DeviceHelper deviceHelper) {

        return deviceService.getScopedDevice(pageNo, pageSize, deviceHelper);
    }
}
