package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.County;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CountyMapper {
    @Delete({
        "delete from ent_county",
        "where district_id = #{districtId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String districtId);

    @Insert({
        "insert into ent_county (district_id, district_name, ",
        "city_id)",
        "values (#{districtId,jdbcType=VARCHAR}, #{districtName,jdbcType=VARCHAR}, ",
        "#{cityId,jdbcType=VARCHAR})"
    })
    int insert(County record);

    @InsertProvider(type=CountySqlProvider.class, method="insertSelective")
    int insertSelective(County record);

    @Select({
        "select",
        "district_id, district_name, city_id",
        "from ent_county",
        "where district_id = #{districtId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="district_id", property="districtId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="district_name", property="districtName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.VARCHAR)
    })
    County selectByPrimaryKey(String districtId);

    @UpdateProvider(type=CountySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(County record);

    @Update({
        "update ent_county",
        "set district_name = #{districtName,jdbcType=VARCHAR},",
          "city_id = #{cityId,jdbcType=VARCHAR}",
        "where district_id = #{districtId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(County record);
}