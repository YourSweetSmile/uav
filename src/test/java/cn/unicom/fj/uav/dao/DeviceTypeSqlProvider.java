package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.DeviceType;
import org.apache.ibatis.jdbc.SQL;

public class DeviceTypeSqlProvider {

    public String insertSelective(DeviceType record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ent_task_type");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=SMALLINT}");
        }
        
        if (record.getTypeName() != null) {
            sql.VALUES("type_name", "#{typeName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DeviceType record) {
        SQL sql = new SQL();
        sql.UPDATE("ent_task_type");
        
        if (record.getTypeName() != null) {
            sql.SET("type_name = #{typeName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=SMALLINT}");
        
        return sql.toString();
    }
}