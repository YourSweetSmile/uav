package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Route;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface RouteMapper {
    @Delete({
        "delete from ent_route",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short id);

    @Insert({
        "insert into ent_route (id, route_no, ",
        "route_name, route_leave, ",
        "route_arrival, route_start, ",
        "route_end, is_delete, ",
        "route_status, task_type_id)",
        "values (#{id,jdbcType=SMALLINT}, #{routeNo,jdbcType=VARCHAR}, ",
        "#{routeName,jdbcType=VARCHAR}, #{routeLeave,jdbcType=SMALLINT}, ",
        "#{routeArrival,jdbcType=SMALLINT}, #{routeStart,jdbcType=TIMESTAMP}, ",
        "#{routeEnd,jdbcType=TIMESTAMP}, #{isDelete,jdbcType=CHAR}, ",
        "#{routeStatus,jdbcType=CHAR}, #{taskTypeId,jdbcType=SMALLINT})"
    })
    int insert(Route record);

    @InsertProvider(type=RouteSqlProvider.class, method="insertSelective")
    int insertSelective(Route record);

    @Select({
        "select",
        "id, route_no, route_name, route_leave, route_arrival, route_start, route_end, ",
        "is_delete, route_status, task_type_id",
        "from ent_route",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="route_no", property="routeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="route_name", property="routeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="route_leave", property="routeLeave", jdbcType=JdbcType.SMALLINT),
        @Result(column="route_arrival", property="routeArrival", jdbcType=JdbcType.SMALLINT),
        @Result(column="route_start", property="routeStart", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="route_end", property="routeEnd", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
        @Result(column="route_status", property="routeStatus", jdbcType=JdbcType.CHAR),
        @Result(column="task_type_id", property="taskTypeId", jdbcType=JdbcType.SMALLINT)
    })
    Route selectByPrimaryKey(Short id);

    @UpdateProvider(type=RouteSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Route record);

    @Update({
        "update ent_route",
        "set route_no = #{routeNo,jdbcType=VARCHAR},",
          "route_name = #{routeName,jdbcType=VARCHAR},",
          "route_leave = #{routeLeave,jdbcType=SMALLINT},",
          "route_arrival = #{routeArrival,jdbcType=SMALLINT},",
          "route_start = #{routeStart,jdbcType=TIMESTAMP},",
          "route_end = #{routeEnd,jdbcType=TIMESTAMP},",
          "is_delete = #{isDelete,jdbcType=CHAR},",
          "route_status = #{routeStatus,jdbcType=CHAR},",
          "task_type_id = #{taskTypeId,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(Route record);

    //修改路线状态
    @Update({
            "update ent_route",
            "set route_status = #{routeStatus,jdbcType=CHAR}",
            "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateStatus(Route record);
}