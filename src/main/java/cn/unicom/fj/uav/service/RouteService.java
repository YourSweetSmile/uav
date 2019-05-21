package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.RouteMapper;
import cn.unicom.fj.uav.dao.helper.RouteHelperMapper;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    @Autowired
    private RouteHelperMapper routeHelperMapper;
    @Autowired
    private RouteMapper routeMapper;

    //查询全部数据
    public List<RouteHelper> getAllRoute(RouteHelper routeHelper){
        return routeHelperMapper.getAllRoute(routeHelper);
    }
    //添加数据
    public int insert(Route record){
        return routeMapper.insert(record);
    }
}
