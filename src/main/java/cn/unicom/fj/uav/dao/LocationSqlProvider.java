package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Location;
import org.apache.ibatis.jdbc.SQL;

public class LocationSqlProvider {

    public String insertSelective(Location record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ent_location");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=SMALLINT}");
        }
        
        if (record.getLocationName() != null) {
            sql.VALUES("location_name", "#{locationName,jdbcType=VARCHAR}");
        }
        
        if (record.getCountyId() != null) {
            sql.VALUES("county_id", "#{countyId,jdbcType=VARCHAR}");
        }
        
        if (record.getLongitude() != null) {
            sql.VALUES("longitude", "#{longitude,jdbcType=DECIMAL}");
        }
        
        if (record.getLatitude() != null) {
            sql.VALUES("latitude", "#{latitude,jdbcType=DECIMAL}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Location record) {
        SQL sql = new SQL();
        sql.UPDATE("ent_location");
        
        if (record.getLocationName() != null) {
            sql.SET("location_name = #{locationName,jdbcType=VARCHAR}");
        }
        
        if (record.getCountyId() != null) {
            sql.SET("county_id = #{countyId,jdbcType=VARCHAR}");
        }
        
        if (record.getLongitude() != null) {
            sql.SET("longitude = #{longitude,jdbcType=DECIMAL}");
        }
        
        if (record.getLatitude() != null) {
            sql.SET("latitude = #{latitude,jdbcType=DECIMAL}");
        }
        
        sql.WHERE("id = #{id,jdbcType=SMALLINT}");
        
        return sql.toString();
    }
}