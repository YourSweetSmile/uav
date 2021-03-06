package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.RouteMapper;
import cn.unicom.fj.uav.model.helper.FlyRouteHelper;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface FlyRouteHelperMapper extends RouteMapper {
    //查询所有路线，关联任务类型taskType表及地点Location表
    @Select("<script>" +
            "select * from ent_route where 1=1 and is_delete=0" +
            "<if test='routeLeave!=null'>" +
            "and route_leave = #{routeLeave}" +
            "</if>" +
            "<if test='routeArrival!=null'>" +
            "and route_arrival=#{routeArrival}" +
            "</if>" +
            "<if test='routeStart!=null'>" +
            "and route_start = #{routeStart}" +
            "</if>" +
            "<if test='routeEnd!=null'>" +
            "and route_end = #{routeEnd}" +
            "</if>" +
            "<if test='routeStatus!=null and routeStatus!=\"\"'>" +
            "and route_status = #{routeStatus}" +
            "</if>" +
            "<if test='taskTypeId!=null'>" +
            "and task_type_id = #{taskTypeId}" +
            "</if>" +
            "</script>")
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT, id=true),
            @Result(column="route_no", property="routeNo", jdbcType=JdbcType.VARCHAR),
            @Result(column="route_name", property="routeName", jdbcType=JdbcType.VARCHAR),
            @Result(column="route_leave", property="routeLeave", jdbcType=JdbcType.SMALLINT),
            @Result(column="route_arrival", property="routeArrival", jdbcType=JdbcType.SMALLINT),
            @Result(column="route_start", property="routeStart", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="route_end", property="routeEnd", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
            @Result(column="route_status", property="routeStatus", jdbcType=JdbcType.CHAR),
            @Result(column="task_type_id", property="taskTypeId", jdbcType=JdbcType.SMALLINT),
            @Result(column = "task_type_id",
                    property = "taskType",
                    one = @One(select = "cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType = FetchType.EAGER)
            ),
            @Result(column = "route_leave",
                    property = "leave",
                    one = @One(select = "cn.unicom.fj.uav.dao.LocationMapper.selectByPrimaryKey",
                            fetchType = FetchType.EAGER)
            ),
            @Result(column = "route_arrival",
                    property = "arrival",
                    one = @One(select = "cn.unicom.fj.uav.dao.LocationMapper.selectByPrimaryKey",
                            fetchType = FetchType.EAGER)
            )
    })
    List<RouteHelper> getAllRoute(RouteHelper routeHelper);

    //根据id查route
    @Select("<script>" +
            "select * from ent_route where 1=1 and is_delete=0" +
            "<if test='_parameter!=null'>" +
            "and id = #{id}" +
            "</if>" +
            "</script>")
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT,id=true),
            @Result(column="route_no", property="routeNo", jdbcType=JdbcType.VARCHAR),
            @Result(column="route_name", property="routeName", jdbcType=JdbcType.VARCHAR),
            @Result(column="route_leave", property="routeLeave", jdbcType=JdbcType.SMALLINT),
            @Result(column="route_arrival", property="routeArrival", jdbcType=JdbcType.SMALLINT),
            @Result(column="route_start", property="routeStart", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="route_end", property="routeEnd", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
            @Result(column="route_status", property="routeStatus", jdbcType=JdbcType.CHAR),
            @Result(column="task_type_id", property="taskTypeId", jdbcType=JdbcType.SMALLINT),
            @Result(column = "task_type_id",
                    property = "taskType",
                    one = @One(select = "cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType = FetchType.EAGER)
            ),
            @Result(column = "route_leave",
                    property = "leave",
                    one = @One(select = "cn.unicom.fj.uav.dao.LocationMapper.selectByPrimaryKey",
                            fetchType = FetchType.EAGER)
            ),
            @Result(column = "route_arrival",
                    property = "arrival",
                    one = @One(select = "cn.unicom.fj.uav.dao.LocationMapper.selectByPrimaryKey",
                            fetchType = FetchType.EAGER)
            )
    })
    RouteHelper getRouteById(Short id);


    /**
     * 模糊搜索
     * @param a
     * @param userPri
     * @param userSex
     * @return
     */
    @Select("<script>" +
            "select * from ent_route where 1=1 and is_delete=0" +
            "<if test='routeLeave!=null'>" +
            "and route_leave = #{routeLeave}" +
            "</if>" +
            "<if test='routeArrival!=null'>" +
            "and route_arrival=#{routeArrival}" +
            "</if>" +
            "<if test='routeStart!=null'>" +
            "and route_start = #{routeStart}" +
            "</if>" +
            "<if test='routeEnd!=null'>" +
            "and route_end = #{routeEnd}" +
            "</if>" +
            "<if test='routeStatus!=null and routeStatus!=\"\"'>" +
            "and route_status = #{routeStatus}" +
            "</if>" +
            "<if test='taskTypeId!=null'>" +
            "and task_type_id = #{taskTypeId}" +
            "</if>" +
            "</script>")
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT,id=true),
            @Result(column="route_no", property="routeNo", jdbcType=JdbcType.VARCHAR),
            @Result(column="route_name", property="routeName", jdbcType=JdbcType.VARCHAR),
            @Result(column="route_leave", property="routeLeave", jdbcType=JdbcType.SMALLINT),
            @Result(column="route_arrival", property="routeArrival", jdbcType=JdbcType.SMALLINT),
            @Result(column="route_start", property="routeStart", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="route_end", property="routeEnd", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
            @Result(column="route_status", property="routeStatus", jdbcType=JdbcType.CHAR),
            @Result(column="task_type_id", property="taskTypeId", jdbcType=JdbcType.SMALLINT),
            @Result(column = "task_type_id",
                    property = "taskType",
                    one = @One(select = "cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType = FetchType.EAGER)
            ),
//            @Result(column = "route_leave",
//                    property = "leave",
//                    one = @One(select = "cn.unicom.fj.uav.dao.LocationMapper.selectByPrimaryKey",
//                            fetchType = FetchType.EAGER)
//            ),
//            @Result(column = "route_arrival",
//                    property = "arrival",
//                    one = @One(select = "cn.unicom.fj.uav.dao.LocationMapper.selectByPrimaryKey",
//                            fetchType = FetchType.EAGER)
//            )
    })
    List<FlyRouteHelper> getNewsByCondition(
            //有多个参数时需要用param
            @Param("routeLeave") String a,
            @Param("userPri") String userPri,
            @Param("userSex") String userSex
    );

    @Update({
            "update ent_route",
            "set is_delete = 1",
            "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateIsDeleteByPrimaryKey(Short id);
}
