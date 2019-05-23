package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.DeviceMapper;
import cn.unicom.fj.uav.model.helper.DeviceHelper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DeviceHelperMapper extends DeviceMapper {


    /**
     * 组合查询
     */
    @Select({
            "<script>",
            "select",
            "id, device_type, task_type_id, device_status, device_num, device_name, device_comm, ",
            "power_max, capacity, fly_mileage, wind_res, water_res, hit_res, flexibility, ",
            "emc_res, img_id, wing_loss, power_loss, camera_loss, pack_loss, engine_loss, ",
            "base_loss, create_time, device_desc",
            "from ent_device",
            "where 1=1",
                "<if test='id!=null'>",
                    "and id=#{id}",
                 "</if>",
                "<if test='deviceNum!=null and deviceNum!=\"\"'>",
                    "and device_num=#{deviceNum}",
                "</if>",
                "<if test='deviceName!=null and deviceName!=\"\"'>",
                    "and device_name like '%${deviceName}%'",
                "</if>",
                "<if test='deviceType!=null and deviceType!=\"\"'>",
                    "and device_type=#{deviceType}",
                "</if>",
                "<if test='deviceStatus!=null and deviceStatus!=\"\"'>",
                    "and device_status=#{deviceStatus}",
                "</if>",
                "<if test='createTimeStart!=null'>",
                    "and create_time&gt;=#{createTimeStart}",
                 "</if>",
                "<if test='createTimeEnd!=null'>",
                    "and create_time&lt;=#{createTimeEnd}",
                "</if>",
                "<if test='sort==\"-id\"'>",
                    "order by id desc",
                "</if>",
                "<if test='sort==\"+id\"'>",
                    "order by id",
                "</if>",
            "</script>"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT, id=true),
            @Result(column="device_type", property="deviceType", jdbcType=JdbcType.VARCHAR),
            @Result(column="task_type_id", property="taskTypeId", jdbcType=JdbcType.SMALLINT),
            @Result(column="device_status", property="deviceStatus", jdbcType=JdbcType.VARCHAR),
            @Result(column="device_num", property="deviceNum", jdbcType=JdbcType.VARCHAR),
            @Result(column="device_name", property="deviceName", jdbcType=JdbcType.VARCHAR),
            @Result(column="device_comm", property="deviceComm", jdbcType=JdbcType.VARCHAR),
            @Result(column="power_max", property="powerMax", jdbcType=JdbcType.INTEGER),
            @Result(column="capacity", property="capacity", jdbcType=JdbcType.INTEGER),
            @Result(column="fly_mileage", property="flyMileage", jdbcType=JdbcType.INTEGER),
            @Result(column="wind_res", property="windRes", jdbcType=JdbcType.DECIMAL),
            @Result(column="water_res", property="waterRes", jdbcType=JdbcType.DECIMAL),
            @Result(column="hit_res", property="hitRes", jdbcType=JdbcType.DECIMAL),
            @Result(column="flexibility", property="flexibility", jdbcType=JdbcType.DECIMAL),
            @Result(column="emc_res", property="emcRes", jdbcType=JdbcType.DECIMAL),
            @Result(column="img_id", property="imgId", jdbcType=JdbcType.SMALLINT),
            @Result(column="wing_loss", property="wingLoss", jdbcType=JdbcType.DECIMAL),
            @Result(column="power_loss", property="powerLoss", jdbcType=JdbcType.DECIMAL),
            @Result(column="camera_loss", property="cameraLoss", jdbcType=JdbcType.DECIMAL),
            @Result(column="pack_loss", property="packLoss", jdbcType=JdbcType.DECIMAL),
            @Result(column="engine_loss", property="engineLoss", jdbcType=JdbcType.DECIMAL),
            @Result(column="base_loss", property="baseLoss", jdbcType=JdbcType.DECIMAL),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="device_desc", property="deviceDesc", jdbcType=JdbcType.LONGVARCHAR),
            @Result(column="task_type_id",property="taskType",
                    one=@One(select="cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER))
    })
    List<DeviceHelper> selectByHelper(DeviceHelper deviceHelper);

}
