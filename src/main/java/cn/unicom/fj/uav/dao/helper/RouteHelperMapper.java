package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.RouteMapper;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RouteHelperMapper extends RouteMapper {
    @Select({
            "select * from ent_route"
    })
    List<RouteHelper> getAllRoute(RouteHelper routeHelper);
}
