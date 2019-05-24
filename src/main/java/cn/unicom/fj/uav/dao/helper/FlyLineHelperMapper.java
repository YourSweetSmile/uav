package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.model.helper.FlyLineHelper;
import cn.unicom.fj.uav.model.helper.FlyTask;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FlyLineHelperMapper extends TaskMapper{
    //查询飞行路线字段
    @Select({"SELECT id,device_id,task_type_id,rode_id FROM ent_task"})//task_start_time,
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT, id=true),
            @Result(column="task_name", property="taskName", jdbcType=JdbcType.VARCHAR),
            @Result(column="task_type_id", property="taskTypeId", jdbcType=JdbcType.TINYINT),
            @Result(column="device_id", property="deviceId", jdbcType=JdbcType.SMALLINT),
//            @Result(column="task_build_time", property="taskBuildTime", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="task_start_time", property="taskStartTime", jdbcType=JdbcType.TIMESTAMP),
//            @Result(column="task_end_time", property="taskEndTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="rode_id", property="rodeId", jdbcType=JdbcType.SMALLINT),
            @Result(column="task_status", property="taskStatus", jdbcType=JdbcType.CHAR),
            @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
            @Result(column="task_type_id",property="taskType",
                    one=@One(select="cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER)),
            @Result(column="rode_id", property="route", jdbcType=JdbcType.SMALLINT,
                    one=@One(select ="cn.unicom.fj.uav.dao.helper.RouteHelperMapper.getRouteById" ,fetchType= FetchType.EAGER))

    })
    List<FlyLineHelper> getAllTask();

}
