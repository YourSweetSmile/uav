package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.DeviceTrouble;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DeviceTroubleMapper {
    @Delete({
        "delete from rel_device_trouble",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short id);

    @Insert({
        "insert into rel_device_trouble (id, trouble_date, ",
        "device_id, task_id, ",
        "trouble_type, trouble_reason, ",
        "is_delete, is_candel)",
        "values (#{id,jdbcType=SMALLINT}, #{troubleDate,jdbcType=TIMESTAMP}, ",
        "#{deviceId,jdbcType=SMALLINT}, #{taskId,jdbcType=SMALLINT}, ",
        "#{troubleType,jdbcType=VARCHAR}, #{troubleReason,jdbcType=VARCHAR}, ",
        "#{isDelete,jdbcType=VARCHAR}, #{isCandel,jdbcType=VARCHAR})"
    })
    int insert(DeviceTrouble record);

    @InsertProvider(type=DeviceTroubleSqlProvider.class, method="insertSelective")
    int insertSelective(DeviceTrouble record);

    @Select({
        "select",
        "id, trouble_date, device_id, task_id, trouble_type, trouble_reason, is_delete, ",
        "is_candel",
        "from rel_device_trouble",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="trouble_date", property="troubleDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="device_id", property="deviceId", jdbcType=JdbcType.SMALLINT),
        @Result(column="task_id", property="taskId", jdbcType=JdbcType.SMALLINT),
        @Result(column="trouble_type", property="troubleType", jdbcType=JdbcType.VARCHAR),
        @Result(column="trouble_reason", property="troubleReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_candel", property="isCandel", jdbcType=JdbcType.VARCHAR)
    })
    DeviceTrouble selectByPrimaryKey(Short id);

    @UpdateProvider(type=DeviceTroubleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DeviceTrouble record);

    @Update({
        "update rel_device_trouble",
        "set trouble_date = #{troubleDate,jdbcType=TIMESTAMP},",
          "device_id = #{deviceId,jdbcType=SMALLINT},",
          "task_id = #{taskId,jdbcType=SMALLINT},",
          "trouble_type = #{troubleType,jdbcType=VARCHAR},",
          "trouble_reason = #{troubleReason,jdbcType=VARCHAR},",
          "is_delete = #{isDelete,jdbcType=VARCHAR},",
          "is_candel = #{isCandel,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(DeviceTrouble record);
}