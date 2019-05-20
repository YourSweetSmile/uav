package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.helper.RouteHelper;
import cn.unicom.fj.uav.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="route")

public class RouteController {
    @Autowired
    private RouteService routeService;

    //查询全部数据
    @RequestMapping(value="list")
    public List<RouteHelper> getAllRoute(@RequestBody RouteHelper routeHelper){

        return routeService.getAllRoute( routeHelper);

    }

}
