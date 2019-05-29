package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.RouteMapper;
import cn.unicom.fj.uav.model.helper.RouteChartLine1;
import cn.unicom.fj.uav.model.helper.RouteChartPie;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import com.fasterxml.jackson.databind.JavaType;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface RouteHelperMapper extends RouteMapper {
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
    RouteHelper getRouteById( Short id);

    /**
     * 查询路线管理模块饼图数据
     */
    @Select("<script>" +
            "select count(r.id) value ,co.district_name name" +
            " from ent_route r left JOIN ent_location l on r.route_leave=l.id" +
            " right JOIN" +
            " ent_county co on co.district_id=l.county_id"+
            " where co.city_id = #{cityId}" +
            " GROUP BY co.district_id,co.district_name"+
            "</script>")
    List<RouteChartPie> getChart(String cityId);

    /**
     * 查询路线管理模块折线图数据路线总数（柱形图折线图中预计飞行路线总数）
     */
    @Select("<script>" +
            "SELECT COUNT(r.id) VALUE,DATE_FORMAT(r.route_start,'%Y-%m-%d') starttime" +
            " FROM ent_route r LEFT JOIN ent_location l ON r.route_leave=l.id" +
            " RIGHT JOIN" +
            " ent_county co ON co.district_id=l.county_id" +
            " WHERE co.city_id = #{cityId}" +
            " AND r.route_start BETWEEN (SELECT DATE_ADD(NOW(),INTERVAL -1 MONTH)) AND NOW()" +
            " GROUP BY DATE_FORMAT(r.route_start,'%Y-%m-%d')"+
            "</script>")
    @Results({
            @Result(column = "VALUE",property = "value"),
            @Result(column = "starttime",property = "time")
    })

    List<RouteChartLine1> gerChartLine1(String cityId);

    /**
     * 查询路线管理模块折线图数据飞行机器总数
     */
    @Select("<script>" +
            "SELECT COUNT(*) VALUE,DATE_FORMAT(t.task_build_time,'%Y-%m-%d') starttime" +
            " FROM ent_task t" +
            " WHERE t.task_build_time BETWEEN (SELECT DATE_ADD(NOW(),INTERVAL -1 MONTH)) AND NOW()" +
            " GROUP BY DATE_FORMAT(t.task_build_time,'%Y-%m-%d')"+
            "</script>")
    @Results({
            @Result(column = "VALUE",property = "value"),
            @Result(column = "starttime",property = "time")
    })
    List<RouteChartLine1> gerChartLine2(String cityId);
    /**
     * 查询柱形图折线图中预计飞行路线总数
     */
    @Select("<script>" +
            "SELECT COUNT(*) VALUE,t.id, DATE_FORMAT(t.task_start_time,'%Y-%m-%d') starttime" +
            " FROM ent_task t" +
            " WHERE t.task_build_time BETWEEN (SELECT DATE_ADD(NOW(),INTERVAL -1 MONTH)) AND NOW()" +
            " GROUP BY DATE_FORMAT(t.task_start_time,'%Y-%m-%d')"+
            "</script>")
    @Results({
            @Result(column = "VALUE",property = "value"),
            @Result(column = "starttime",property = "time")
    })

    List<RouteChartLine1> gerChartLineBar1(String cityId);
    /**
     * 查询柱形图折线图中实际飞行路线总数
     */
    @Select("<script>" +
            "SELECT COUNT(*) VALUE,t.id, DATE_FORMAT(t.task_start_time,'%Y-%m-%d') starttime" +
            " FROM ent_task t" +
            " WHERE t.task_build_time BETWEEN (SELECT DATE_ADD(NOW(),INTERVAL -1 MONTH)) AND NOW() AND task_status != \"d\"" +
            " GROUP BY DATE_FORMAT(t.task_start_time,'%Y-%m-%d')"+
            "</script>")
    @Results({
            @Result(column = "VALUE",property = "value"),
            @Result(column = "starttime",property = "time")
    })

    List<RouteChartLine1> gerChartLineBar2(String cityId);
}
