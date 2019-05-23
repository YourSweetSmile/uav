package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.helper.DeviceHelper;
import cn.unicom.fj.uav.service.DeviceService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api
@RestController
@RequestMapping("/hello")
public class TestController {

    @Autowired
    private DeviceService deviceService;

    @ApiOperation(value = "testcon---")
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

    @RequestMapping("/page/get")
    public PageInfo getScopedDevice(@RequestParam("pageNo") Integer pageNo,
                                    @RequestParam("pageSize") Integer pageSize,
                                    @RequestBody DeviceHelper deviceHelper){

        return deviceService.getScopedDevice(pageNo, pageSize, deviceHelper);
    }
}
