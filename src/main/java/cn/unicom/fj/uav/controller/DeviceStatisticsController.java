package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.helper.DeviceStatistics;
import cn.unicom.fj.uav.service.DeviceStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dev/stat")
public class DeviceStatisticsController {

    @Autowired
    private DeviceStatisticsService deviceStatisticsService;

    @GetMapping("/type")
    public List<DeviceStatistics> getTypeStat(){
        return deviceStatisticsService.getTypeStat();
    }

    @GetMapping("/task")
    public List<DeviceStatistics> getTaskTypeStat(){
        return deviceStatisticsService.getTaskTypeStat();
    }
}
