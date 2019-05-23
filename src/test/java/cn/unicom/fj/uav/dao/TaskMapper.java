package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Task;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TaskMapper {
    @Delete({
        "delete from ent_task",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short id);

    @Insert({
        "insert into ent_task (id, task_name, ",
        "task_type_id, device_id, ",
        "task_build_time, task_start_time, ",
        "task_end_time, rode_id, ",
        "task_status, is_delete, ",
        "task_header)",
        "values (#{id,jdbcType=SMALLINT}, #{taskName,jdbcType=VARCHAR}, ",
        "#{taskTypeId,jdbcType=TINYINT}, #{deviceId,jdbcType=SMALLINT}, ",
        "#{taskBuildTime,jdbcType=TIMESTAMP}, #{taskStartTime,jdbcType=TIMESTAMP}, ",
        "#{taskEndTime,jdbcType=TIMESTAMP}, #{rodeId,jdbcType=SMALLINT}, ",
        "#{taskStatus,jdbcType=CHAR}, #{isDelete,jdbcType=CHAR}, ",
        "#{taskHeader,jdbcType=VARCHAR})"
    })
    int insert(Task record);

    @InsertProvider(type=TaskSqlProvider.class, method="insertSelective")
    int insertSelective(Task record);

    @Select({
        "select",
        "id, task_name, task_type_id, device_id, task_build_time, task_start_time, task_end_time, ",
        "rode_id, task_status, is_delete, task_header",
        "from ent_task",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="task_name", property="taskName", jdbcType=JdbcType.VARCHAR),
        @Result(column="task_type_id", property="taskTypeId", jdbcType=JdbcType.TINYINT),
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.SMALLINT),
        @Result(column="task_build_time", property="taskBuildTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="task_start_time", property="taskStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="task_end_time", property="taskEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="rode_id", property="rodeId", jdbcType=JdbcType.SMALLINT),
        @Result(column="task_status", property="taskStatus", jdbcType=JdbcType.CHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
        @Result(column="task_header", property="taskHeader", jdbcType=JdbcType.VARCHAR)
    })
    Task selectByPrimaryKey(Short id);

    @UpdateProvider(type=TaskSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Task record);

    @Update({
        "update ent_task",
        "set task_name = #{taskName,jdbcType=VARCHAR},",
          "task_type_id = #{taskTypeId,jdbcType=TINYINT},",
          "device_id = #{deviceId,jdbcType=SMALLINT},",
          "task_build_time = #{taskBuildTime,jdbcType=TIMESTAMP},",
          "task_start_time = #{taskStartTime,jdbcType=TIMESTAMP},",
          "task_end_time = #{taskEndTime,jdbcType=TIMESTAMP},",
          "rode_id = #{rodeId,jdbcType=SMALLINT},",
          "task_status = #{taskStatus,jdbcType=CHAR},",
          "is_delete = #{isDelete,jdbcType=CHAR},",
          "task_header = #{taskHeader,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(Task record);
}