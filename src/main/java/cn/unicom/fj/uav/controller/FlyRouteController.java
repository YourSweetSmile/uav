package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.dao.RouteMapper;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import cn.unicom.fj.uav.service.FlyRouteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/line")

public class FlyRouteController {
    @Autowired
    private FlyRouteService flyRouteService;
    @Autowired
    private RouteMapper routeMapper;

    //查询全部数据
    @RequestMapping("/list")
    public PageInfo<RouteHelper> getAllRoute(
            @RequestParam(value = "page",defaultValue = "1")Integer page,
            @RequestParam(value = "limit",defaultValue = "20")Integer limit,
            @RequestBody RouteHelper routeHelper){

        PageHelper.startPage(page,limit);

        List<RouteHelper> list= flyRouteService.getAllRoute( routeHelper);

        PageInfo<RouteHelper> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
    //添加
    @RequestMapping(value="addlist")
    public void insert(@RequestBody Route record){
        flyRouteService.insert(record);

    }
    //修改
    @RequestMapping(value="updatelist")
    public void update(@RequestBody Route record){
        flyRouteService.update(record);
    }


//    @RequestMapping(value="id")
//    public RouteHelper getRouteById(Short id){
//        return routeService.getRouteById(id);
//    }
    @RequestMapping("/del")
    public int deleteByPrimaryKey(short id) {
        return flyRouteService.deleteByPrimaryKey(id);
    }

    /**
     * 更新IsDelete
     */
    @RequestMapping(value="isdelete")
    public int updateIsDeleteByPrimaryKey(Short id){
        return flyRouteService.updateIsDeleteByPrimaryKey(id);
    }
}
