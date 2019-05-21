package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.TaskType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TaskTypeMapper {
    @Delete({
        "delete from ent_task_type",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short id);

    @Insert({
        "insert into ent_task_type (id, type_name)",
        "values (#{id,jdbcType=SMALLINT}, #{typeName,jdbcType=VARCHAR})"
    })
    int insert(TaskType record);

    @InsertProvider(type=TaskTypeSqlProvider.class, method="insertSelective")
    int insertSelective(TaskType record);

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
    TaskType selectByPrimaryKey(Short id);

    @UpdateProvider(type=TaskTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TaskType record);

    @Update({
        "update ent_task_type",
        "set type_name = #{typeName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(TaskType record);
}