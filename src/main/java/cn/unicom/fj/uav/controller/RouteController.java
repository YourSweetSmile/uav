package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.dao.RouteMapper;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.helper.RouteChartLine1;
import cn.unicom.fj.uav.model.helper.RouteChartPie;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import cn.unicom.fj.uav.service.RouteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="route")

public class RouteController {
    @Autowired
    private RouteService routeService;
    @Autowired
    private RouteMapper routeMapper;

    //查询全部数据
    @RequestMapping(value="list")
    public PageInfo<RouteHelper> getAllRoute(
            @RequestParam(value = "page",defaultValue = "1")Integer page,
            @RequestParam(value = "limit",defaultValue = "20")Integer limit,
            @RequestBody RouteHelper routeHelper){

        PageHelper.startPage(page,limit);

        List<RouteHelper> list=routeService.getAllRoute( routeHelper);

        PageInfo<RouteHelper> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
    //添加
    @RequestMapping(value="addlist")
    public void insert(@RequestBody Route record){
        routeService.insert(record);

    }
    //修改
    @RequestMapping(value="updatelist")
    public void update(@RequestBody Route record){
        routeService.update(record);
    }

    //修改路线状态
    @RequestMapping(value="setstaus")
    public void updateStatus(@RequestBody Route record){
        routeService.updateStatus(record);
    }

//    @RequestMapping(value="id")
//    public RouteHelper getRouteById(Short id){
//        return routeService.getRouteById(id);
//    }

    //获取路线管理模块中饼图数据
    @RequestMapping(value="chart")
    public List<RouteChartPie> getChart(String cityId){
        return routeService.getChart(cityId);
    }

    //获取路线管理模块中折线图数据飞行路线数
    @RequestMapping(value="chartline1")
    public List<RouteChartLine1> gerChartLine1(String cityId){
        return routeService.getChartLine1(cityId);
    };
    //获取路线管理模块中折线图数据机器数
    @RequestMapping(value="chartline2")
    public List<RouteChartLine1> gerChartLine2(String cityId){
        return routeService.getChartLine2(cityId);
    };
    //查询柱形图折线图中预计飞行路线总数
    @RequestMapping(value="chartlinebar1")
    public List<RouteChartLine1> gerChartLineBar1(String cityId){
        return routeService.gerChartLineBar1(cityId);
    };
    //查询柱形图折线图中实际飞行路线总数
    @RequestMapping(value="chartlinebar2")
    public List<RouteChartLine1> gerChartLineBar2(String cityId){
        return routeService.gerChartLineBar2(cityId);
    };
}
