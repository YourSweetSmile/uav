package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Route;
import org.apache.ibatis.jdbc.SQL;

public class RouteSqlProvider {

    public String insertSelective(Route record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ent_route");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=SMALLINT}");
        }
        
        if (record.getRouteNo() != null) {
            sql.VALUES("route_no", "#{routeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRouteName() != null) {
            sql.VALUES("route_name", "#{routeName,jdbcType=VARCHAR}");
        }
        
        if (record.getRouteLeave() != null) {
            sql.VALUES("route_leave", "#{routeLeave,jdbcType=SMALLINT}");
        }
        
        if (record.getRouteArrival() != null) {
            sql.VALUES("route_arrival", "#{routeArrival,jdbcType=SMALLINT}");
        }
        
        if (record.getRouteStart() != null) {
            sql.VALUES("route_start", "#{routeStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRouteEnd() != null) {
            sql.VALUES("route_end", "#{routeEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsDelete() != null) {
            sql.VALUES("is_delete", "#{isDelete,jdbcType=CHAR}");
        }
        
        if (record.getRouteStatus() != null) {
            sql.VALUES("route_status", "#{routeStatus,jdbcType=CHAR}");
        }
        
        if (record.getTaskTypeId() != null) {
            sql.VALUES("task_type_id", "#{taskTypeId,jdbcType=SMALLINT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Route record) {
        SQL sql = new SQL();
        sql.UPDATE("ent_route");
        
        if (record.getRouteNo() != null) {
            sql.SET("route_no = #{routeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRouteName() != null) {
            sql.SET("route_name = #{routeName,jdbcType=VARCHAR}");
        }
        
        if (record.getRouteLeave() != null) {
            sql.SET("route_leave = #{routeLeave,jdbcType=SMALLINT}");
        }
        
        if (record.getRouteArrival() != null) {
            sql.SET("route_arrival = #{routeArrival,jdbcType=SMALLINT}");
        }
        
        if (record.getRouteStart() != null) {
            sql.SET("route_start = #{routeStart,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRouteEnd() != null) {
            sql.SET("route_end = #{routeEnd,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsDelete() != null) {
            sql.SET("is_delete = #{isDelete,jdbcType=CHAR}");
        }
        
        if (record.getRouteStatus() != null) {
            sql.SET("route_status = #{routeStatus,jdbcType=CHAR}");
        }
        
        if (record.getTaskTypeId() != null) {
            sql.SET("task_type_id = #{taskTypeId,jdbcType=SMALLINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=SMALLINT}");
        
        return sql.toString();
    }
}