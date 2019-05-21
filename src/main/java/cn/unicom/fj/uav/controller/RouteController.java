package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.dao.RouteMapper;
import cn.unicom.fj.uav.model.Route;
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
        routeMapper.insert(record);

    }


}
