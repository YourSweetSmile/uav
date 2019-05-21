package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.City;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CityMapper {
    @Delete({
        "delete from ent_city",
        "where city_id = #{cityId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String cityId);

    @Insert({
        "insert into ent_city (city_id, city_name, ",
        "zone_code, city_code, ",
        "province_id)",
        "values (#{cityId,jdbcType=VARCHAR}, #{cityName,jdbcType=VARCHAR}, ",
        "#{zoneCode,jdbcType=VARCHAR}, #{cityCode,jdbcType=VARCHAR}, ",
        "#{provinceId,jdbcType=TINYINT})"
    })
    int insert(City record);

    @InsertProvider(type=CitySqlProvider.class, method="insertSelective")
    int insertSelective(City record);

    @Select({
        "select",
        "city_id, city_name, zone_code, city_code, province_id",
        "from ent_city",
        "where city_id = #{cityId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="city_name", property="cityName", jdbcType=JdbcType.VARCHAR),
        @Result(column="zone_code", property="zoneCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_code", property="cityCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_id", property="provinceId", jdbcType=JdbcType.TINYINT)
    })
    City selectByPrimaryKey(String cityId);

    @UpdateProvider(type=CitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(City record);

    @Update({
        "update ent_city",
        "set city_name = #{cityName,jdbcType=VARCHAR},",
          "zone_code = #{zoneCode,jdbcType=VARCHAR},",
          "city_code = #{cityCode,jdbcType=VARCHAR},",
          "province_id = #{provinceId,jdbcType=TINYINT}",
        "where city_id = #{cityId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(City record);
}