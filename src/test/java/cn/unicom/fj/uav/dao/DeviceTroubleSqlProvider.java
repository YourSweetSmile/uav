package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.DeviceTrouble;
import org.apache.ibatis.jdbc.SQL;

public class DeviceTroubleSqlProvider {

    public String insertSelective(DeviceTrouble record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("rel_device_trouble");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=SMALLINT}");
        }
        
        if (record.getTroubleDate() != null) {
            sql.VALUES("trouble_date", "#{troubleDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeviceId() != null) {
            sql.VALUES("device_id", "#{deviceId,jdbcType=SMALLINT}");
        }
        
        if (record.getTaskId() != null) {
            sql.VALUES("task_id", "#{taskId,jdbcType=SMALLINT}");
        }
        
        if (record.getTroubleType() != null) {
            sql.VALUES("trouble_type", "#{troubleType,jdbcType=VARCHAR}");
        }
        
        if (record.getTroubleReason() != null) {
            sql.VALUES("trouble_reason", "#{troubleReason,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDelete() != null) {
            sql.VALUES("is_delete", "#{isDelete,jdbcType=VARCHAR}");
        }
        
        if (record.getIsCandel() != null) {
            sql.VALUES("is_candel", "#{isCandel,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DeviceTrouble record) {
        SQL sql = new SQL();
        sql.UPDATE("rel_device_trouble");
        
        if (record.getTroubleDate() != null) {
            sql.SET("trouble_date = #{troubleDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeviceId() != null) {
            sql.SET("device_id = #{deviceId,jdbcType=SMALLINT}");
        }
        
        if (record.getTaskId() != null) {
            sql.SET("task_id = #{taskId,jdbcType=SMALLINT}");
        }
        
        if (record.getTroubleType() != null) {
            sql.SET("trouble_type = #{troubleType,jdbcType=VARCHAR}");
        }
        
        if (record.getTroubleReason() != null) {
            sql.SET("trouble_reason = #{troubleReason,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDelete() != null) {
            sql.SET("is_delete = #{isDelete,jdbcType=VARCHAR}");
        }
        
        if (record.getIsCandel() != null) {
            sql.SET("is_candel = #{isCandel,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=SMALLINT}");
        
        return sql.toString();
    }
}