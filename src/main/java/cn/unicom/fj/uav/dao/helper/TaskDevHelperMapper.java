package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.TaskMapper;
import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.TaskType;
import cn.unicom.fj.uav.model.helper.TaskDevHelper;
import cn.unicom.fj.uav.model.helper.TaskHelper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TaskDevHelperMapper extends TaskMapper{
    /**模糊查询
     *
     * @param data
     * @return
     */
    @Select({"<script>" +
            "select * from ent_task where is_delete=0" +
            "<if test='taskName!=null and taskName!=\"\"'>" +
            "and task_name like '%${taskName}%'" +
            "</if>" +
            "<if test='taskTypeId!=null and taskTypeId!=\"\"'>" +
            "and task_type_id= #{taskTypeId}" +
            "</if>" +
            "<if test='taskStartTime!=null '>" +
            "and task_start_time &gt; #{taskStartTime}" +
            "</if>" +
            "<if test='taskEndTime!=null '>" +
            "and task_end_time &lt; #{taskEndTime}" +
            "</if>" +
            "<if test='order!=null and order==\"+id\"'>" +
            "order by id asc" +
            "</if>" +
            "<if test='order!=null and order==\"-id\"'>" +
            "order by id desc" +
            "</if>" +
            "</script>"})
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT),
            @Result(column="task_name", property="taskName", jdbcType=JdbcType.VARCHAR),
            @Result(column="task_type_id", property="taskType",
                    one = @One(select = "cn.unicom.fj.uav.dao.helper.TaskDevHelperMapper.selectTypeOne" ,fetchType = FetchType.EAGER)),
            @Result(column="device_id", property="device",
                    one = @One(select = "cn.unicom.fj.uav.dao.helper.TaskDevHelperMapper.selectDeviceOne" ,fetchType = FetchType.EAGER)),
            @Result(column="task_build_time", property="taskBuildTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="task_start_time", property="taskStartTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="task_end_time", property="taskEndTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="rode_id", property="rodes",
            one = @One(select = "cn.unicom.fj.uav.dao.helper.TaskDevHelperMapper.selectRouteOne" ,fetchType = FetchType.EAGER)),
            @Result(column="task_status", property="taskStatus", jdbcType=JdbcType.CHAR),
            @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.CHAR),
            @Result(column="task_header", property="taskHeader", jdbcType=JdbcType.VARCHAR),
            @Result(column="task_desc", property="taskDesc", jdbcType=JdbcType.VARCHAR)
    })
    List<TaskDevHelper> search(TaskDevHelper data);

    /**查询单个机器
     *
     * @param id
     * @return
     */
    @Select({
            "select",
            "device_name",
            "from ent_device where id=#{id}"
    })
    @Results({
            @Result(column="device_name", property="deviceName", jdbcType=JdbcType.VARCHAR)
    })
    String selectDeviceOne(int id);
    @Select({
            "select",
            "device_name",
            "from ent_device"
    })
    @Results({
            @Result(column="device_name", property="deviceName", jdbcType=JdbcType.VARCHAR)
    })
    List<String> selectDeviceAll();

    @Select({
            "select",
            "id, type_name",
            "from ent_task_type where id=#{id}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT, id=true),
            @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR)
    })
    TaskType selectTypeOne(int id);

    @Select({
            "select",
            "id, route_name",
            "from ent_route where id=#{id}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT, id=true),
            @Result(column="route_name", property="routeName", jdbcType=JdbcType.VARCHAR)
    })
    Route selectRouteOne(int id);

    /** 删除
     *
     * @param id
     * @return
     */
    @Update({
            "update ent_task",
            "set is_delete = 1",
            "where id = #{id,jdbcType=SMALLINT}"
    })
    int taskDelete(Integer id);

    /**
     * 添加
     * @param record
     * @return
     */
    @Insert({
            "insert into ent_task (id, task_name, ",
            "task_type_id, device_id, ",
            "task_build_time, task_start_time, ",
            "task_end_time, rode_id, ",
            "task_status, is_delete, ",
            "task_header, task_desc)",
            "values (default, #{taskName,jdbcType=VARCHAR}, ",
            "#{taskTypeId,jdbcType=TINYINT}, #{deviceId,jdbcType=SMALLINT}, ",
            "default, #{taskStartTime,jdbcType=TIMESTAMP}, ",
            "#{taskEndTime,jdbcType=TIMESTAMP}, #{rodeId,jdbcType=SMALLINT}, ",
            "#{taskStatus,jdbcType=CHAR}, default, ",
            "#{taskHeader,jdbcType=VARCHAR}, #{taskDesc,jdbcType=VARCHAR})"
    })
    int insert(Task record);

}
