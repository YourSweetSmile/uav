package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.service.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dev/type")
public class DeviceTypeController {

    @Autowired
    private DeviceTypeService deviceTypeService;

    /**
     * 获取所有类型
     * @return
     */
    @RequestMapping("/list")
    public List<String> getAllType(){
        return deviceTypeService.getAll();
    }
}
