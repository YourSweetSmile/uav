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

//    public RouteHelper getRouteById(Short id){
//        return routeHelperMapper.getRouteById(id);
//    }
    //添加数据
    public int insert(Route record){
        return routeMapper.insert(record);
    }

    //修改数据
    public int update(Route record){
        return routeMapper.updateByPrimaryKey(record);
    }

    //修改路线状态
    public int updateStatus(Route record){

        Route routeDb=routeMapper.selectByPrimaryKey(record.getId());

//        System.out.println(routeDb.getRouteStatus());
        if ("t".equals(routeDb.getRouteStatus())){
            routeDb.setRouteStatus("f");
        }else{
            routeDb.setRouteStatus("t");
        }
//        System.out.println(record);
        return routeMapper.updateByPrimaryKey(routeDb);
    }
}
