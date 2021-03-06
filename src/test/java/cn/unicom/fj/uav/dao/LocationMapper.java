package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Location;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface LocationMapper {
    @Delete({
        "delete from ent_location",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short id);

    @Insert({
        "insert into ent_location (id, location_name, ",
        "county_id, longitude, ",
        "latitude)",
        "values (#{id,jdbcType=SMALLINT}, #{locationName,jdbcType=VARCHAR}, ",
        "#{countyId,jdbcType=VARCHAR}, #{longitude,jdbcType=DECIMAL}, ",
        "#{latitude,jdbcType=DECIMAL})"
    })
    int insert(Location record);

    @InsertProvider(type=LocationSqlProvider.class, method="insertSelective")
    int insertSelective(Location record);

    @Select({
        "select",
        "id, location_name, county_id, longitude, latitude",
        "from ent_location",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="location_name", property="locationName", jdbcType=JdbcType.VARCHAR),
        @Result(column="county_id", property="countyId", jdbcType=JdbcType.VARCHAR),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.DECIMAL),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.DECIMAL)
    })
    Location selectByPrimaryKey(Short id);

    @UpdateProvider(type=LocationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Location record);

    @Update({
        "update ent_location",
        "set location_name = #{locationName,jdbcType=VARCHAR},",
          "county_id = #{countyId,jdbcType=VARCHAR},",
          "longitude = #{longitude,jdbcType=DECIMAL},",
          "latitude = #{latitude,jdbcType=DECIMAL}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(Location record);
}