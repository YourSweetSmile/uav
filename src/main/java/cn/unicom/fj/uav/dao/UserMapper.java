package cn.unicom.fj.uav.dao;

import cn.unicom.fj.uav.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper {
    /**
     * 删除
     */
    @Delete({
            "delete from sys_uav_user",
            "where user_id = #{userId,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short userId);
    /**
     * 新增数据
     * @param record
     * @return
     */
    @Insert({
            "insert into sys_uav_user (user_id, user_name, ",
            "user_date, user_privileges, ",
            "user_sex, user_company, ",
            "user_telephone)",
            "values (#{userId,jdbcType=SMALLINT}, #{userName,jdbcType=VARCHAR}, ",
            "#{userDate,jdbcType=TIMESTAMP}, #{userPrivileges,jdbcType=VARCHAR}, ",
            "#{userSex,jdbcType=VARCHAR}, #{userCompany,jdbcType=VARCHAR}, ",
            "#{userTelephone,jdbcType=CHAR})"
    })
    int insert(User record);

    @InsertProvider(type = UserSqlProvider.class, method = "insertSelective")
    int insertSelective(User record);

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    @Select({
            "select",
            "user_id, user_name, user_date, user_privileges, user_sex, user_company, user_telephone",
            "from sys_uav_user",
            "where user_id = #{userId,jdbcType=SMALLINT}"
    })
    @Results({
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.SMALLINT, id = true),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_date", property = "userDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "user_privileges", property = "userPrivileges", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_sex", property = "userSex", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_company", property = "userCompany", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_telephone", property = "userTelephone", jdbcType = JdbcType.CHAR)
    })
    User selectByPrimaryKey(Short userId);

    /**
     * 更改数据
     * @param record
     * @return
     */
    @UpdateProvider(type = UserSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
            "update sys_uav_user",
            "set user_name = #{userName,jdbcType=VARCHAR},",
            "user_date = #{userDate,jdbcType=TIMESTAMP},",
            "user_privileges = #{userPrivileges,jdbcType=VARCHAR},",
            "user_sex = #{userSex,jdbcType=VARCHAR},",
            "user_company = #{userCompany,jdbcType=VARCHAR},",
            "user_telephone = #{userTelephone,jdbcType=CHAR}",
            "where user_id = #{userId,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(User record);
}