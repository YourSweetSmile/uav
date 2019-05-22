package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.TaskType;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

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

    //获取所有任务类型
    @Select({
            "select",
            "id, type_name",
            "from ent_task_type"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
            @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR)
    })
    List<TaskType> selectAll();

    @UpdateProvider(type=TaskTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TaskType record);

    @Update({
        "update ent_task_type",
        "set type_name = #{typeName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(TaskType record);
}