package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.FlyTask;
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
  //查询飞行区域统计表字段
  @Select({"SELECT id,device_id,task_start_time,task_type_id,rode_id FROM ent_task"})
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
    @Result(column="task_type_id",property="taskType",
      one=@One(select="cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
        fetchType= FetchType.EAGER)),
    @Result(column="rode_id", property="route", jdbcType=JdbcType.SMALLINT,
       one=@One(select ="cn.unicom.fj.uav.dao.helper.RouteHelperMapper.getRouteById" ,fetchType= FetchType.EAGER))

  })
  List<FlyTask> getAllTask();

  //新增飞行区域统计表字段
  @Insert({
    "insert into ent_task ( task_type_id, device_id, task_start_time, rode_id)",
    "values (#{taskTypeId,jdbcType=TINYINT}, #{deviceId,jdbcType=SMALLINT}, ",
    " #{taskStartTime,jdbcType=TIMESTAMP}, ",
    " #{rodeId,jdbcType=SMALLINT})"
  })
  int insertFly(@Param("taskTypeId") Byte taskTypeId,
                @Param("deviceId") Short deviceId,
                @Param("taskStartTime") String taskStartTime,
                @Param("rodeId") Short rodeId);

  //更新飞行区域统计表字段
@Update("update ent_task set id=#{id},task_type_id=#{taskTypeId}, device_id=#{deviceId}, task_start_time=#{taskStartTime}, rode_id=#{rodeId} where id=#{id}")
int updateFlyTask(@Param("id") Short id,
                  @Param("taskTypeId") Byte taskTypeId,
                  @Param("deviceId") Short deviceId,
                  @Param("taskStartTime") String taskStartTime,
                  @Param("rodeId") Short rodeId);

  //检索
  @Select("<script>" +
    "select * from ent_task where 1=1" +
    "<if test='taskType!=null and taskType!=\"\"'>" +
    " and task_type_id=#{taskType}"+
    "</if>"+
    "<if test='deviceId!=null and deviceId!=\"\"'>" +
    " and device_id like '%${deviceId}%'"+
    "</if>"+
    "<if test='rodeId!=null and rodeId!=\"\"'>" +
    " and rode_id = #{rodeId}"+
    "</if>"+
    "<if test='order!=null and order==\"+id\"'>" +
    " order by id asc"+
    "</if>"+
    "<if test='order!=null and order==\"-id\"'>" +
    " order by id desc"+
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
  List<FlyTask> getNewsByCondition(
          @Param("taskType") String taskType,
          @Param("deviceId") String deviceId,
          @Param("rodeId") String rodeId,
          @Param("order") String order
  );

}
