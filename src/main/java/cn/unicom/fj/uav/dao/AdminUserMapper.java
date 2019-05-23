package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.AdminUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface AdminUserMapper {
    @Delete({
        "delete from sys_admin_user",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short id);

    @Insert({
        "insert into sys_admin_user (id, user_no, ",
        "user_pwd, user_name)",
        "values (#{id,jdbcType=SMALLINT}, #{userNo,jdbcType=VARCHAR}, ",
        "#{userPwd,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR})"
    })
    int insert(AdminUser record);

    @InsertProvider(type=AdminUserSqlProvider.class, method="insertSelective")
    int insertSelective(AdminUser record);

    @Select({
        "select",
        "id, user_no, user_pwd, user_name",
        "from sys_admin_user",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.SMALLINT, id=true),
        @Result(column="user_no", property="userNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_pwd", property="userPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR)
    })
    AdminUser selectByPrimaryKey(Short id);

    @UpdateProvider(type=AdminUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AdminUser record);

    @Update({
        "update sys_admin_user",
        "set user_no = #{userNo,jdbcType=VARCHAR},",
          "user_pwd = #{userPwd,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(AdminUser record);
}