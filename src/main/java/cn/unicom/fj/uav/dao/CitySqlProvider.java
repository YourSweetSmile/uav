package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.City;
import org.apache.ibatis.jdbc.SQL;

public class CitySqlProvider {

    public String insertSelective(City record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ent_city");
        
        if (record.getCityId() != null) {
            sql.VALUES("city_id", "#{cityId,jdbcType=VARCHAR}");
        }
        
        if (record.getCityName() != null) {
            sql.VALUES("city_name", "#{cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getZoneCode() != null) {
            sql.VALUES("zone_code", "#{zoneCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            sql.VALUES("city_code", "#{cityCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceId() != null) {
            sql.VALUES("province_id", "#{provinceId,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(City record) {
        SQL sql = new SQL();
        sql.UPDATE("ent_city");
        
        if (record.getCityName() != null) {
            sql.SET("city_name = #{cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getZoneCode() != null) {
            sql.SET("zone_code = #{zoneCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            sql.SET("city_code = #{cityCode,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceId() != null) {
            sql.SET("province_id = #{provinceId,jdbcType=TINYINT}");
        }
        
        sql.WHERE("city_id = #{cityId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }
}