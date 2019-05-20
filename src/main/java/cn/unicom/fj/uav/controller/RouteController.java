package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.dao.JSONResult;
import cn.unicom.fj.uav.dao.helper.RouteHelperMapper;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="route")

public class RouteController {
    @Autowired
    private RouteHelperMapper routeHelperMapper;

    //查询全部数据
    @RequestMapping(value="list")
    public JSONResult getAllRoute(@RequestBody RouteHelper routeHelper){
        List<RouteHelper> list=routeHelperMapper.getAllRoute( routeHelper);

        return  new JSONResult().ok(list);

    }

}
