package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.DeviceType;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface DeviceTypeMapper {
    @Delete({
        "delete from ent_task_type",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short id);

    @Insert({
        "insert into ent_task_type (id, type_name)",
        "values (#{id,jdbcType=SMALLINT}, #{typeName,jdbcType=VARCHAR})"
    })
    int insert(DeviceType record);

    @InsertProvider(type=DeviceTypeSqlProvider.class, method="insertSelective")
    int insertSelective(DeviceType record);

    @Select({
        "select",
        "id, type_name",
        "from ent_task_type",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR)
    })
    DeviceType selectByPrimaryKey(Short id);

    @UpdateProvider(type=DeviceTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DeviceType record);

    @Update({
        "update ent_task_type",
        "set type_name = #{typeName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(DeviceType record);
}