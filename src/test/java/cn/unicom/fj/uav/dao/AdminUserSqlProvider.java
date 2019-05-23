package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.AdminUser;
import org.apache.ibatis.jdbc.SQL;

public class AdminUserSqlProvider {

    public String insertSelective(AdminUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_admin_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=SMALLINT}");
        }
        
        if (record.getUserNo() != null) {
            sql.VALUES("user_no", "#{userNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPwd() != null) {
            sql.VALUES("user_pwd", "#{userPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AdminUser record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_admin_user");
        
        if (record.getUserNo() != null) {
            sql.SET("user_no = #{userNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPwd() != null) {
            sql.SET("user_pwd = #{userPwd,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=SMALLINT}");
        
        return sql.toString();
    }
}