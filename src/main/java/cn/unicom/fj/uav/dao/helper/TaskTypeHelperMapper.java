package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.TaskTypeMapper;
import cn.unicom.fj.uav.model.TaskType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TaskTypeHelperMapper extends TaskTypeMapper {

    @Select({
            "select",
            "id, type_name",
            "from ent_task_type"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT, id=true),
            @Result(column="type_name", property="typeName", jdbcType=JdbcType.VARCHAR)
    })
    List<TaskType> selectAll();
}
