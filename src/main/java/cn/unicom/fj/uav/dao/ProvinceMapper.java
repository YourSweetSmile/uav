package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.Province;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ProvinceMapper {
    @Delete({
        "delete from ent_province",
        "where province_id = #{provinceId,jdbcType=TINYINT}"
    })
    int deleteByPrimaryKey(Byte provinceId);

    @Insert({
        "insert into ent_province (province_id, province_name)",
        "values (#{provinceId,jdbcType=TINYINT}, #{provinceName,jdbcType=VARCHAR})"
    })
    int insert(Province record);

    @InsertProvider(type=ProvinceSqlProvider.class, method="insertSelective")
    int insertSelective(Province record);

    @Select({
        "select",
        "province_id, province_name",
        "from ent_province",
        "where province_id = #{provinceId,jdbcType=TINYINT}"
    })
    @Results({
        @Result(column="province_id", property="provinceId", jdbcType=JdbcType.TINYINT, id=true),
        @Result(column="province_name", property="provinceName", jdbcType=JdbcType.VARCHAR)
    })
    Province selectByPrimaryKey(Byte provinceId);

    @UpdateProvider(type=ProvinceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Province record);

    @Update({
        "update ent_province",
        "set province_name = #{provinceName,jdbcType=VARCHAR}",
        "where province_id = #{provinceId,jdbcType=TINYINT}"
    })
    int updateByPrimaryKey(Province record);
}