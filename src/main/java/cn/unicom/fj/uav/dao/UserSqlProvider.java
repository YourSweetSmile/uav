package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sys_uav_user");
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=SMALLINT}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDate() != null) {
            sql.VALUES("user_date", "#{userDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserPrivileges() != null) {
            sql.VALUES("user_privileges", "#{userPrivileges,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.VALUES("user_sex", "#{userSex,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCompany() != null) {
            sql.VALUES("user_company", "#{userCompany,jdbcType=VARCHAR}");
        }
        
        if (record.getUserTelephone() != null) {
            sql.VALUES("user_telephone", "#{userTelephone,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("sys_uav_user");
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserDate() != null) {
            sql.SET("user_date = #{userDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserPrivileges() != null) {
            sql.SET("user_privileges = #{userPrivileges,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.SET("user_sex = #{userSex,jdbcType=VARCHAR}");
        }
        
        if (record.getUserCompany() != null) {
            sql.SET("user_company = #{userCompany,jdbcType=VARCHAR}");
        }
        
        if (record.getUserTelephone() != null) {
            sql.SET("user_telephone = #{userTelephone,jdbcType=CHAR}");
        }
        
        sql.WHERE("user_id = #{userId,jdbcType=SMALLINT}");
        
        return sql.toString();
    }
}