package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.RouteMapper;
import cn.unicom.fj.uav.dao.helper.RouteHelperMapper;
import cn.unicom.fj.uav.exception.SysRuntimeExeption;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.helper.RouteChartLine1;
import cn.unicom.fj.uav.model.helper.RouteChartPie;
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
        record.setIsDelete("0");
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

    //获取路线管理模块中饼图数据
    public List<RouteChartPie> getChart(String cityId){
        if(null==cityId){
            throw new SysRuntimeExeption("异常");
        }
        return routeHelperMapper.getChart(cityId);
    }

    //获取折线图数据飞行路线总数
    public List<RouteChartLine1> getChartLine1(String cityId){
        if(null==cityId){
            throw new SysRuntimeExeption("异常");
        }
        return routeHelperMapper.gerChartLine1(cityId);
    }
    //获取折线图数据飞行机器数
    public List<RouteChartLine1> getChartLine2(String cityId){
        if(null==cityId){
            throw new SysRuntimeExeption("异常");
        }
        return routeHelperMapper.gerChartLine2(cityId);
    }
    //查询柱形图折线图中预计飞行路线总数
    public List<RouteChartLine1> gerChartLineBar1(String cityId){
        if(null==cityId){
            throw new SysRuntimeExeption("异常");
        }
        return routeHelperMapper.gerChartLineBar1(cityId);
    }
    //查询柱形图折线图中实际飞行路线总数
    public List<RouteChartLine1> gerChartLineBar2(String cityId){
        if(null==cityId){
            throw new SysRuntimeExeption("异常");
        }
        return routeHelperMapper.gerChartLineBar2(cityId);
    }
}
