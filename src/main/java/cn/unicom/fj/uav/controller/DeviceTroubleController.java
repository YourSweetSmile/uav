package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.helper.DeviceTroubleHelper;
import cn.unicom.fj.uav.service.DeviceTroubleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deviceTrouble")
public class DeviceTroubleController {

    @Autowired
    private DeviceTroubleService deviceTroubleService;

    @GetMapping("/list")
    public PageInfo getDeviceTrouble(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                     @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                     @RequestBody DeviceTroubleHelper deviceTroubleHelper) {

        return deviceTroubleService.getDeviceTrouble(pageNo, pageSize, deviceTroubleHelper);
    }

}
