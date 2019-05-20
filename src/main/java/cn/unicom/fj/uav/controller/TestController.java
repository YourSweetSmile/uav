package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.helper.DeviceHelper;
import cn.unicom.fj.uav.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class TestController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping("/say")
    public Map sayHello(){

        Map<String,Object> res = new HashMap<>();

        res.put("msg", "hello word");
        return res;
    }

    @RequestMapping("/d1")
    public Map getTestDevice(){

        Map<String,Object> res = new HashMap<>();

        DeviceHelper deviceHelper = new DeviceHelper();
        deviceHelper.setId(new Short("1"));

        List<DeviceHelper> list = deviceService.getDevice(deviceHelper);
        res.put("msg", list);
        return res;
    }
}
