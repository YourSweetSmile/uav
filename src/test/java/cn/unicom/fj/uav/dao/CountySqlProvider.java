package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.County;
import org.apache.ibatis.jdbc.SQL;

public class CountySqlProvider {

    public String insertSelective(County record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ent_county");
        
        if (record.getDistrictId() != null) {
            sql.VALUES("district_id", "#{districtId,jdbcType=VARCHAR}");
        }
        
        if (record.getDistrictName() != null) {
            sql.VALUES("district_name", "#{districtName,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.VALUES("city_id", "#{cityId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(County record) {
        SQL sql = new SQL();
        sql.UPDATE("ent_county");
        
        if (record.getDistrictName() != null) {
            sql.SET("district_name = #{districtName,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{cityId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("district_id = #{districtId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}