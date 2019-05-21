package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.Location;
import cn.unicom.fj.uav.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    //获取所有的地点
    @RequestMapping(value="all")
    public List<Location> selectAll(){
        return locationService.selectAll();
    }
}
