package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.RouteMapper;
import cn.unicom.fj.uav.dao.helper.FlyRouteHelperMapper;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlyRouteService {

    @Autowired
    private FlyRouteHelperMapper flyRouteHelperMapper;
    @Autowired
    private RouteMapper routeMapper;

    //查询全部数据
    public List<RouteHelper> getAllRoute(RouteHelper routeHelper){
        return flyRouteHelperMapper.getAllRoute(routeHelper);
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

//    /**
//     * 模糊搜索（根据姓名，性别，管理员职务搜索）
//     */
//    public List<RouteHelper> getNewsByCon(
//            String routeLeave,String userPri,String userSex
//    ){
//        return FlyRouteHelperMapper.getNewsByCondition(routeLeave,userPri,userSex);
//    }
    /**
     * 删除数据
     */
    public int deleteByPrimaryKey(Short shortid) {
        return routeMapper.deleteByPrimaryKey(shortid);
    }

    /**
     * 更新IsDelete
     */
    public int updateIsDeleteByPrimaryKey(Short id){
        return flyRouteHelperMapper.updateIsDeleteByPrimaryKey(id);
    }
}
