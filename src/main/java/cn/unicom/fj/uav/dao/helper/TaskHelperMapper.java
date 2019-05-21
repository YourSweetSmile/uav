package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.TaskMapper;
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
     * 查询全部数据
     * @return
     */
//    @Select({"select " +
//            "id,task_type_id,task_start_time, " +
//            "rode_id, task_status, is_delete " +
//            "from ent_task"
//    })
   // @Select({"select * from ent_task"})
    @Select("<script>" +
            "select * from ent_task where 1=1 and is_delete=0" +
            "<if test='task_status!=null and task_status!=\"\"'>" +
            "and task_status like '%${task_status}%'" +
            "</if>" +
            "<if test='task_start_time!=null and task_start_time!=\"\"'>" +
            "and task_start_time = '#{task_start_time}" +
            "</if>" +
            "<if test='task_type_id!=null and task_type_id!=\"\"'>" +
            "and task_type_id = '#{task_type_id}" +
            "</if>" +
            "<if test='rode_id!=null and rode_id!=\"\"'>" +
            "and rode_id = '#{rode_id}%" +
            "</if>" +
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
            @Result(column="task_type_id",property="taskType",
                    one=@One(select="cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER))
    })
    List<TaskHelper> getAllTaskHelper(@Param("task_status") String task_status,
                                      @Param("task_start_time") String task_start_time,
                                      @Param("task_type_id") String task_type_id,
                                      @Param("rode_id") Integer rode_id);
}
