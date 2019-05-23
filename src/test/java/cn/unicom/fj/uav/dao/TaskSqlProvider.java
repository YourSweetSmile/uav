package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Task;
import org.apache.ibatis.jdbc.SQL;

public class TaskSqlProvider {

    public String insertSelective(Task record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ent_task");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=SMALLINT}");
        }
        
        if (record.getTaskName() != null) {
            sql.VALUES("task_name", "#{taskName,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskTypeId() != null) {
            sql.VALUES("task_type_id", "#{taskTypeId,jdbcType=TINYINT}");
        }
        
        if (record.getDeviceId() != null) {
            sql.VALUES("device_id", "#{deviceId,jdbcType=SMALLINT}");
        }
        
        if (record.getTaskBuildTime() != null) {
            sql.VALUES("task_build_time", "#{taskBuildTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTaskStartTime() != null) {
            sql.VALUES("task_start_time", "#{taskStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTaskEndTime() != null) {
            sql.VALUES("task_end_time", "#{taskEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRodeId() != null) {
            sql.VALUES("rode_id", "#{rodeId,jdbcType=SMALLINT}");
        }
        
        if (record.getTaskStatus() != null) {
            sql.VALUES("task_status", "#{taskStatus,jdbcType=CHAR}");
        }
        
        if (record.getIsDelete() != null) {
            sql.VALUES("is_delete", "#{isDelete,jdbcType=CHAR}");
        }
        
        if (record.getTaskHeader() != null) {
            sql.VALUES("task_header", "#{taskHeader,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskDesc() != null) {
            sql.VALUES("task_desc", "#{taskDesc,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Task record) {
        SQL sql = new SQL();
        sql.UPDATE("ent_task");
        
        if (record.getTaskName() != null) {
            sql.SET("task_name = #{taskName,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskTypeId() != null) {
            sql.SET("task_type_id = #{taskTypeId,jdbcType=TINYINT}");
        }
        
        if (record.getDeviceId() != null) {
            sql.SET("device_id = #{deviceId,jdbcType=SMALLINT}");
        }
        
        if (record.getTaskBuildTime() != null) {
            sql.SET("task_build_time = #{taskBuildTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTaskStartTime() != null) {
            sql.SET("task_start_time = #{taskStartTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTaskEndTime() != null) {
            sql.SET("task_end_time = #{taskEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRodeId() != null) {
            sql.SET("rode_id = #{rodeId,jdbcType=SMALLINT}");
        }
        
        if (record.getTaskStatus() != null) {
            sql.SET("task_status = #{taskStatus,jdbcType=CHAR}");
        }
        
        if (record.getIsDelete() != null) {
            sql.SET("is_delete = #{isDelete,jdbcType=CHAR}");
        }
        
        if (record.getTaskHeader() != null) {
            sql.SET("task_header = #{taskHeader,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskDesc() != null) {
            sql.SET("task_desc = #{taskDesc,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=SMALLINT}");
        
        return sql.toString();
    }
}