package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Device;
import org.apache.ibatis.jdbc.SQL;

public class DeviceSqlProvider {

    public String insertSelective(Device record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ent_device");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=SMALLINT}");
        }
        
        if (record.getDeviceType() != null) {
            sql.VALUES("device_type", "#{deviceType,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskTypeId() != null) {
            sql.VALUES("task_type_id", "#{taskTypeId,jdbcType=SMALLINT}");
        }
        
        if (record.getDeviceStatus() != null) {
            sql.VALUES("device_status", "#{deviceStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviceNum() != null) {
            sql.VALUES("device_num", "#{deviceNum,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviceName() != null) {
            sql.VALUES("device_name", "#{deviceName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviceComm() != null) {
            sql.VALUES("device_comm", "#{deviceComm,jdbcType=VARCHAR}");
        }
        
        if (record.getPowerMax() != null) {
            sql.VALUES("power_max", "#{powerMax,jdbcType=INTEGER}");
        }
        
        if (record.getCapacity() != null) {
            sql.VALUES("capacity", "#{capacity,jdbcType=INTEGER}");
        }
        
        if (record.getFlyMileage() != null) {
            sql.VALUES("fly_mileage", "#{flyMileage,jdbcType=INTEGER}");
        }
        
        if (record.getWindRes() != null) {
            sql.VALUES("wind_res", "#{windRes,jdbcType=DECIMAL}");
        }
        
        if (record.getWaterRes() != null) {
            sql.VALUES("water_res", "#{waterRes,jdbcType=DECIMAL}");
        }
        
        if (record.getHitRes() != null) {
            sql.VALUES("hit_res", "#{hitRes,jdbcType=DECIMAL}");
        }
        
        if (record.getFlexibility() != null) {
            sql.VALUES("flexibility", "#{flexibility,jdbcType=DECIMAL}");
        }
        
        if (record.getEmcRes() != null) {
            sql.VALUES("emc_res", "#{emcRes,jdbcType=DECIMAL}");
        }
        
        if (record.getImgId() != null) {
            sql.VALUES("img_id", "#{imgId,jdbcType=SMALLINT}");
        }
        
        if (record.getWingLoss() != null) {
            sql.VALUES("wing_loss", "#{wingLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getPowerLoss() != null) {
            sql.VALUES("power_loss", "#{powerLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getCameraLoss() != null) {
            sql.VALUES("camera_loss", "#{cameraLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getPackLoss() != null) {
            sql.VALUES("pack_loss", "#{packLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getEngineLoss() != null) {
            sql.VALUES("engine_loss", "#{engineLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getBaseLoss() != null) {
            sql.VALUES("base_loss", "#{baseLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeviceDesc() != null) {
            sql.VALUES("device_desc", "#{deviceDesc,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Device record) {
        SQL sql = new SQL();
        sql.UPDATE("ent_device");
        
        if (record.getDeviceType() != null) {
            sql.SET("device_type = #{deviceType,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskTypeId() != null) {
            sql.SET("task_type_id = #{taskTypeId,jdbcType=SMALLINT}");
        }
        
        if (record.getDeviceStatus() != null) {
            sql.SET("device_status = #{deviceStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviceNum() != null) {
            sql.SET("device_num = #{deviceNum,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviceName() != null) {
            sql.SET("device_name = #{deviceName,jdbcType=VARCHAR}");
        }
        
        if (record.getDeviceComm() != null) {
            sql.SET("device_comm = #{deviceComm,jdbcType=VARCHAR}");
        }
        
        if (record.getPowerMax() != null) {
            sql.SET("power_max = #{powerMax,jdbcType=INTEGER}");
        }
        
        if (record.getCapacity() != null) {
            sql.SET("capacity = #{capacity,jdbcType=INTEGER}");
        }
        
        if (record.getFlyMileage() != null) {
            sql.SET("fly_mileage = #{flyMileage,jdbcType=INTEGER}");
        }
        
        if (record.getWindRes() != null) {
            sql.SET("wind_res = #{windRes,jdbcType=DECIMAL}");
        }
        
        if (record.getWaterRes() != null) {
            sql.SET("water_res = #{waterRes,jdbcType=DECIMAL}");
        }
        
        if (record.getHitRes() != null) {
            sql.SET("hit_res = #{hitRes,jdbcType=DECIMAL}");
        }
        
        if (record.getFlexibility() != null) {
            sql.SET("flexibility = #{flexibility,jdbcType=DECIMAL}");
        }
        
        if (record.getEmcRes() != null) {
            sql.SET("emc_res = #{emcRes,jdbcType=DECIMAL}");
        }
        
        if (record.getImgId() != null) {
            sql.SET("img_id = #{imgId,jdbcType=SMALLINT}");
        }
        
        if (record.getWingLoss() != null) {
            sql.SET("wing_loss = #{wingLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getPowerLoss() != null) {
            sql.SET("power_loss = #{powerLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getCameraLoss() != null) {
            sql.SET("camera_loss = #{cameraLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getPackLoss() != null) {
            sql.SET("pack_loss = #{packLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getEngineLoss() != null) {
            sql.SET("engine_loss = #{engineLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getBaseLoss() != null) {
            sql.SET("base_loss = #{baseLoss,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeviceDesc() != null) {
            sql.SET("device_desc = #{deviceDesc,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=SMALLINT}");
        
        return sql.toString();
    }
}