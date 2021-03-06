package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Device;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DeviceMapper {
    @Delete({
        "delete from ent_device",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short id);

    @Insert({
        "insert into ent_device (id, device_type, ",
        "task_type_id, device_status, ",
        "device_num, device_name, ",
        "device_comm, power_max, ",
        "capacity, fly_mileage, ",
        "wind_res, water_res, ",
        "hit_res, flexibility, ",
        "emc_res, img_url, ",
        "wing_loss, power_loss, ",
        "camera_loss, pack_loss, ",
        "engine_loss, base_loss, ",
        "create_time, device_desc)",
        "values (#{id,jdbcType=SMALLINT}, #{deviceType,jdbcType=VARCHAR}, ",
        "#{taskTypeId,jdbcType=SMALLINT}, #{deviceStatus,jdbcType=VARCHAR}, ",
        "#{deviceNum,jdbcType=VARCHAR}, #{deviceName,jdbcType=VARCHAR}, ",
        "#{deviceComm,jdbcType=VARCHAR}, #{powerMax,jdbcType=INTEGER}, ",
        "#{capacity,jdbcType=INTEGER}, #{flyMileage,jdbcType=INTEGER}, ",
        "#{windRes,jdbcType=DECIMAL}, #{waterRes,jdbcType=DECIMAL}, ",
        "#{hitRes,jdbcType=DECIMAL}, #{flexibility,jdbcType=DECIMAL}, ",
        "#{emcRes,jdbcType=DECIMAL}, #{imgUrl,jdbcType=VARCHAR}, ",
        "#{wingLoss,jdbcType=DECIMAL}, #{powerLoss,jdbcType=DECIMAL}, ",
        "#{cameraLoss,jdbcType=DECIMAL}, #{packLoss,jdbcType=DECIMAL}, ",
        "#{engineLoss,jdbcType=DECIMAL}, #{baseLoss,jdbcType=DECIMAL}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{deviceDesc,jdbcType=LONGVARCHAR})"
    })
    int insert(Device record);

    @InsertProvider(type=DeviceSqlProvider.class, method="insertSelective")
    int insertSelective(Device record);

    @Select({
        "select",
        "id, device_type, task_type_id, device_status, device_num, device_name, device_comm, ",
        "power_max, capacity, fly_mileage, wind_res, water_res, hit_res, flexibility, ",
        "emc_res, img_url, wing_loss, power_loss, camera_loss, pack_loss, engine_loss, ",
        "base_loss, create_time, device_desc",
        "from ent_device",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
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
        @Result(column="img_url", property="imgUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="wing_loss", property="wingLoss", jdbcType=JdbcType.DECIMAL),
        @Result(column="power_loss", property="powerLoss", jdbcType=JdbcType.DECIMAL),
        @Result(column="camera_loss", property="cameraLoss", jdbcType=JdbcType.DECIMAL),
        @Result(column="pack_loss", property="packLoss", jdbcType=JdbcType.DECIMAL),
        @Result(column="engine_loss", property="engineLoss", jdbcType=JdbcType.DECIMAL),
        @Result(column="base_loss", property="baseLoss", jdbcType=JdbcType.DECIMAL),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="device_desc", property="deviceDesc", jdbcType=JdbcType.LONGVARCHAR)
    })
    Device selectByPrimaryKey(Short id);

    @UpdateProvider(type=DeviceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Device record);

    @Update({
        "update ent_device",
        "set device_type = #{deviceType,jdbcType=VARCHAR},",
          "task_type_id = #{taskTypeId,jdbcType=SMALLINT},",
          "device_status = #{deviceStatus,jdbcType=VARCHAR},",
          "device_num = #{deviceNum,jdbcType=VARCHAR},",
          "device_name = #{deviceName,jdbcType=VARCHAR},",
          "device_comm = #{deviceComm,jdbcType=VARCHAR},",
          "power_max = #{powerMax,jdbcType=INTEGER},",
          "capacity = #{capacity,jdbcType=INTEGER},",
          "fly_mileage = #{flyMileage,jdbcType=INTEGER},",
          "wind_res = #{windRes,jdbcType=DECIMAL},",
          "water_res = #{waterRes,jdbcType=DECIMAL},",
          "hit_res = #{hitRes,jdbcType=DECIMAL},",
          "flexibility = #{flexibility,jdbcType=DECIMAL},",
          "emc_res = #{emcRes,jdbcType=DECIMAL},",
          "img_url = #{imgUrl,jdbcType=VARCHAR},",
          "wing_loss = #{wingLoss,jdbcType=DECIMAL},",
          "power_loss = #{powerLoss,jdbcType=DECIMAL},",
          "camera_loss = #{cameraLoss,jdbcType=DECIMAL},",
          "pack_loss = #{packLoss,jdbcType=DECIMAL},",
          "engine_loss = #{engineLoss,jdbcType=DECIMAL},",
          "base_loss = #{baseLoss,jdbcType=DECIMAL},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "device_desc = #{deviceDesc,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Device record);

    @Update({
        "update ent_device",
        "set device_type = #{deviceType,jdbcType=VARCHAR},",
          "task_type_id = #{taskTypeId,jdbcType=SMALLINT},",
          "device_status = #{deviceStatus,jdbcType=VARCHAR},",
          "device_num = #{deviceNum,jdbcType=VARCHAR},",
          "device_name = #{deviceName,jdbcType=VARCHAR},",
          "device_comm = #{deviceComm,jdbcType=VARCHAR},",
          "power_max = #{powerMax,jdbcType=INTEGER},",
          "capacity = #{capacity,jdbcType=INTEGER},",
          "fly_mileage = #{flyMileage,jdbcType=INTEGER},",
          "wind_res = #{windRes,jdbcType=DECIMAL},",
          "water_res = #{waterRes,jdbcType=DECIMAL},",
          "hit_res = #{hitRes,jdbcType=DECIMAL},",
          "flexibility = #{flexibility,jdbcType=DECIMAL},",
          "emc_res = #{emcRes,jdbcType=DECIMAL},",
          "img_url = #{imgUrl,jdbcType=VARCHAR},",
          "wing_loss = #{wingLoss,jdbcType=DECIMAL},",
          "power_loss = #{powerLoss,jdbcType=DECIMAL},",
          "camera_loss = #{cameraLoss,jdbcType=DECIMAL},",
          "pack_loss = #{packLoss,jdbcType=DECIMAL},",
          "engine_loss = #{engineLoss,jdbcType=DECIMAL},",
          "base_loss = #{baseLoss,jdbcType=DECIMAL},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(Device record);
}