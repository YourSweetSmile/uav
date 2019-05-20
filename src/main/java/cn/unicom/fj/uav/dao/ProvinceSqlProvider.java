package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Province;
import org.apache.ibatis.jdbc.SQL;

public class ProvinceSqlProvider {

    public String insertSelective(Province record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("ent_province");
        
        if (record.getProvinceId() != null) {
            sql.VALUES("province_id", "#{provinceId,jdbcType=TINYINT}");
        }
        
        if (record.getProvinceName() != null) {
            sql.VALUES("province_name", "#{provinceName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Province record) {
        SQL sql = new SQL();
        sql.UPDATE("ent_province");
        
        if (record.getProvinceName() != null) {
            sql.SET("province_name = #{provinceName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("province_id = #{provinceId,jdbcType=TINYINT}");
        
        return sql.toString();
    }
}