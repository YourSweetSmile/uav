package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.dao.TaskSqlProvider;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.FlyTask;
import cn.unicom.fj.uav.model.helper.RouteHelper;
import cn.unicom.fj.uav.service.FlyService;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
@Mapper
public interface FlyTaskDao extends TaskMapper {
  //统计飞行次数
  @Select({"SELECT t.id tid,t.task_type_id,t.rode_id,r.id rid,r.`route_arrival`,l.`longitude`,l.`latitude`,COUNT(r.`route_arrival`) cout \n" +
          "FROM ent_task t LEFT JOIN ent_route r ON t.rode_id=r.id \n" +
          "LEFT JOIN ent_location l ON r.id=l.id\n" +
          "WHERE t.`task_type_id`=#{taskId} GROUP BY r.`route_arrival`"})
  @Results({
    @Result(column="longitude", property="longitude", jdbcType= JdbcType.DECIMAL),
    @Result(column="latitude", property="latitude", jdbcType=JdbcType.DECIMAL),
    @Result(column="cout", property="cout", jdbcType=JdbcType.SMALLINT)
  })
  List<FlyTask> getFlyCount(int taskId);
//将字段改成已删除状态
@Update({
        "update ent_task",
        "set is_delete = 1",
        "where id = #{id,jdbcType=SMALLINT}"
})
int IsDeleteByPrimaryKey(Short id);
//  //新增飞行区域统计表字段
  @Insert({
          "insert into ent_task (task_type_id, device_id, ",
          "task_start_time)",
          "values (#{taskTypeId,jdbcType=TINYINT}, #{deviceId,jdbcType=SMALLINT}, ",
          "#{taskStartTime,jdbcType=TIMESTAMP})"
  })
  int insertFly(FlyTask record);


  //更新飞行区域统计表字段
  @Update({
          "update ent_task",
          "set task_type_id = #{taskTypeId,jdbcType=TINYINT},",
          "device_id = #{deviceId,jdbcType=SMALLINT},",
          "task_start_time = #{taskStartTime,jdbcType=TIMESTAMP}",
          "where id = #{id,jdbcType=SMALLINT}"
  })
  int updateFlyTask(FlyTask record);
  //检索
  @Select("<script>" +
          "select t.id tid,t.is_delete tis_delete,t.* from ent_task t left join ent_route r on t.rode_id=r.id where t.is_delete=0" +
//    "select * from ent_task where 1=1" +
//    "<if test='taskType!=null and taskType!=\"\"'>" +
//    " and task_type_id=#{taskType}"+
//    "</if>"+
   "<if test='taskType!=null'>" +
          "<if test='taskType.id!=null and taskType.id!=\"\"'>" +
          "and t.task_type_id = #{taskType.id}" +
          "</if>" +
   "</if>" +
    "<if test='deviceId!=null and deviceId!=\"\"'>" +
    " and device_id like '%${deviceId}%'"+
    "</if>"+
    "<if test='route!=null'>" +
          "<if test='route.routeArrival!=null and route.routeArrival!=\"\"'>" +
          "and r.route_arrival = #{route.routeArrival}" +
          "</if>" +
    "</if>" +
    "<if test='order!=null and order==\"+id\"'>" +
    " order by tid asc"+
    "</if>"+
    "<if test='order!=null and order==\"-id\"'>" +
    " order by tid desc"+
    "</if>"+
    "</script>")
  @Results({
    @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT, id=true),
    @Result(column="task_name", property="taskName", jdbcType=JdbcType.VARCHAR),
    @Result(column="task_type_id", property="taskTypeId", jdbcType=JdbcType.TINYINT),
    @Result(column="device_id", property="deviceId", jdbcType=JdbcType.SMALLINT),
    @Result(column="task_build_time", property="taskBuildTime", jdbcType=JdbcType.TIMESTAMP),
    @Result(column="task_start_time", property="taskStartTime", jdbcType=JdbcType.TIMESTAMP),
    @Result(column="task_end_time", property="taskEndTime", jdbcType=JdbcType.TIMESTAMP),
    @Result(column="rode_id", property="rodeId", jdbcType=JdbcType.SMALLINT),

    @Result(column="task_status", property="taskStatus", jdbcType=JdbcType.CHAR),
    @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
    @Result(column = "task_type_id", property = "taskType",
        one=@One(select ="cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey" ,fetchType= FetchType.EAGER)),
    @Result(column="rode_id", property="route",
        one=@One(select ="cn.unicom.fj.uav.dao.helper.RouteHelperMapper.getRouteById" ,fetchType= FetchType.EAGER))
  })

  List<FlyTask> getNewsByCondition(FlyTask flyTask);


}
