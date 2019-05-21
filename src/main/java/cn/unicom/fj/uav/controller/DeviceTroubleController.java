package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.helper.DeviceTroubleHelper;
import cn.unicom.fj.uav.service.DeviceTroubleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/deviceTrouble")
public class DeviceTroubleController {

    @Autowired
    private DeviceTroubleService deviceTroubleService;

    @RequestMapping("/list")
    public List<DeviceTroubleHelper> getDeviceTrouble() {

        DeviceTroubleHelper deviceTroubleHelpers = new DeviceTroubleHelper();
//        deviceTroubleHelpers.setId(new Short("1"));
        List<DeviceTroubleHelper> list = deviceTroubleService.getDeviceTrouble(deviceTroubleHelpers);
        return list;
    }

}
