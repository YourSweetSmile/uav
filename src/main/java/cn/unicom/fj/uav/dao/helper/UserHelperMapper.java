package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.UserMapper;
import cn.unicom.fj.uav.model.User;
import cn.unicom.fj.uav.model.helper.UserHelper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserHelperMapper extends UserMapper {
    /**
     * 获取到全部的数据
     */
    @Select({
            "select * from sys_uav_user"
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
    List<UserHelper> getAllData(UserHelper userHelper);

    /**
     * 模糊搜索
     * @param a
     * @param userPri
     * @param userSex
     * @return
     */
    @Select("<script>" +
            "select * from sys_uav_user where 1=1" +
            "<if test='userName!=null and userName!=\"\"'>" +
            " and user_name like '%${userName}%'" +
            "</if>" +
            "<if test='userPri!=null and userPri!=\"\"'>" +
            " and user_privileges=#{userPri}" +
            "</if>" +
            "<if test='userSex!=null and userSex!=\"\"'>" +
            " and user_sex=#{userSex}" +
            "</if>" +
            "</script>")
    @Results({
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.SMALLINT, id = true),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_date", property = "userDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "user_privileges", property = "userPrivileges", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_sex", property = "userSex", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_company", property = "userCompany", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_telephone", property = "userTelephone", jdbcType = JdbcType.CHAR)
    })
    List<User> getNewsByCondition(
            //有多个参数时需要用param
            @Param("userName") String a,
            @Param("userPri") String userPri,
            @Param("userSex") String userSex
    );

}
