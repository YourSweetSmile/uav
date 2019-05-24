package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.helper.DeviceHelper;
import cn.unicom.fj.uav.model.helper.TaskHelper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TaskHelperMapper extends TaskMapper{
    /**
     * 根据条件查询数据
     * @return
     */
    @Select("<script>" +
            "select t.id tid,t.is_delete tis_delete,t.* from ent_task t left join ent_route r on t.rode_id=r.id where t.is_delete=0" +
            "<if test='taskStatus!=null and taskStatus!=\"\"'>" +
                "and t.task_status like '%${taskStatus}%'" +
            "</if>" +
            "<if test='taskStartTime!=null'>" +
                "and t.task_start_time = #{taskStartTime}" +
            "</if>" +
            "<if test='taskType!=null'>" +
                "<if test='taskType.id!=null and taskType.id!=\"\"'>" +
                    "and t.task_type_id = #{taskType.id}" +
                "</if>" +
            "</if>" +
            "<if test='route!=null'>" +
                "<if test='route.routeName!=null and route.routeName!=\"\"'>" +
                    "and r.route_name = #{route.routeName}" +
                "</if>" +
            "</if>" +
            "</script>")
    @Results({
            @Result(column="tid", property="id", jdbcType= JdbcType.SMALLINT, id=true),
            @Result(column="task_name", property="taskName", jdbcType=JdbcType.VARCHAR),
            @Result(column="task_type_id", property="taskTypeId", jdbcType=JdbcType.TINYINT),
            @Result(column="device_id", property="deviceId", jdbcType=JdbcType.SMALLINT),
            @Result(column="task_build_time", property="taskBuildTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="task_start_time", property="taskStartTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="task_end_time", property="taskEndTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="rode_id", property="rodeId", jdbcType=JdbcType.SMALLINT),
            @Result(column="task_status", property="taskStatus", jdbcType=JdbcType.CHAR),
            @Result(column="tis_delete", property="isDelete", jdbcType=JdbcType.CHAR),
            @Result(column="task_type_id",property="taskType",
                    one=@One(select="cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER)),
            @Result(column="rode_id",property="route",
                    one=@One(select="cn.unicom.fj.uav.dao.RouteMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER))
    })
    List<TaskHelper> getAllTaskHelper(TaskHelper taskHelper);

    /**
     * 更改is_delete值
     * @return
     */
    @Update({
            "update ent_task",
            "set is_delete = 1",
            "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateIsDeleteByPrimaryKey(Short id);

    @Update({
            "update ent_task",
            "set task_name = #{taskName,jdbcType=VARCHAR},",
            "task_type_id = #{taskTypeId,jdbcType=TINYINT},",
            "task_start_time = #{taskStartTime,jdbcType=TIMESTAMP},",
            "rode_id = #{rodeId,jdbcType=SMALLINT},",
            "task_status = #{taskStatus,jdbcType=CHAR},",
            "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateTaskByPrimaryKey(Task record);
}
