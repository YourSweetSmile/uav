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
     * 首页的计算设备中停用和正在使用的机型
     */
    @Select({
            "SELECT device_type AS device,",
            "SUM(CASE WHEN device_status=\"已停用\" THEN 1 ELSE 0 END)AS stopCount,",
            "SUM(CASE WHEN device_status=\"待命中\" THEN 1 ELSE 0 END)AS usedCount",
            "FROM ent_device",
            "GROUP BY device_type"
    })
    List<UserHelper> shouDev();
    /**
     * 首页计算天的已处理和未处理故障
     */
    @Select({
            "SELECT DATE_FORMAT(trouble_date,'%Y-%m-%d') AS troubleData,",
            "SUM(CASE WHEN is_candel=1 THEN 1 ELSE 0 END)AS cadelCount,",
            "SUM(CASE WHEN is_candel=0 THEN 1 ELSE 0 END)AS uncandelCount",
            "FROM rel_device_trouble",
            "GROUP BY troubleData"
    })
    List<UserHelper> shouTrouble();
    /**
     * 数据处理后的接口数据
     */
    @Select({
            "SELECT COUNT(1)AS allcount,",
            "SUM(CASE WHEN user_sex=\"男\" AND is_delete=0 THEN 1 ELSE 0 END)AS boycount, ",
            "SUM(CASE WHEN user_sex=\"女\" AND is_delete=0 THEN 1 ELSE 0 END)AS girlcount,",
            "SUM(CASE WHEN MONTH(NOW())-MONTH(user_date)<1 AND YEAR(NOW())=YEAR(user_date) THEN 1 ELSE 0 END)AS addcount,",
            "SUM(CASE WHEN MONTH(NOW())-MONTH(user_date)<1 AND YEAR(NOW())=YEAR(user_date) AND is_delete=0 THEN 1 ELSE 0 END)AS delcount",
            "FROM sys_uav_user",
    })
    List<UserHelper> calsum();

    /**
     * 获取月份与对应的总数
     */
    @Select({
            "SELECT IFNULL(COUNT(user_date),0) AS calNum,DATE_FORMAT(c.datelist,'%Y-%m') AS show_time",
            "FROM sys_uav_user a RIGHT JOIN calendar c ON MONTH(c.datelist) = MONTH(a.user_date) AND a.user_date < CURDATE()",
            "AND a.user_date >= DATE_SUB(CURDATE(), INTERVAL 1 YEAR)",
            "GROUP BY show_time ORDER BY show_time ASC"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT, id=true),
            @Result(column="show_time", property="showTime", jdbcType=JdbcType.VARCHAR)
    })
    List<UserHelper> getArray();
    /**
     * 获取到各省份对应的人数
     */
    @Select({
            "SELECT province AS provin,",
            "COUNT(1) AS allNum",
            "FROM sys_uav_user",
            "GROUP BY province"
    })
    List<UserHelper> provinSum();

    /**
     * 获取到全部的数据
     */
    @Select({
            "select * from sys_uav_user"
    })
    @Results({
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.SMALLINT, id = true),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_date", property = "userDate", jdbcType = JdbcType.DATE),
            @Result(column = "user_privileges", property = "userPrivileges", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_sex", property = "userSex", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_company", property = "userCompany", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_telephone", property = "userTelephone", jdbcType = JdbcType.CHAR),
            @Result(column = "is_delete", property = "isDelete", jdbcType = JdbcType.INTEGER)
    })
    List<UserHelper> getAllData();

    /**
     * 模糊搜索
     *
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
            "<if test='isDelete!=null'>" +
            " and is_delete=#{isDelete}" +
            "</if>" +
            "</script>")
    @Results({
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.SMALLINT, id = true),
            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_date", property = "userDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "user_privileges", property = "userPrivileges", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_sex", property = "userSex", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_company", property = "userCompany", jdbcType = JdbcType.VARCHAR),
            @Result(column = "user_telephone", property = "userTelephone", jdbcType = JdbcType.CHAR),
            @Result(column = "is_delete", property = "isDelete", jdbcType = JdbcType.INTEGER)
    })
    List<User> getNewsByCondition(
            //有多个参数时需要用param
            @Param("userName") String a,
            @Param("userPri") String userPri,
            @Param("userSex") String userSex,
            @Param("isDelete") Integer isDelete
    );

    /**
     * 改变is_delete的状态值
     */
    @Update({
            "update sys_uav_user",
            "set is_delete = 1",
            "where user_id = #{userId,jdbcType=SMALLINT}"
    })
    int updateIsDeleteByPrimaryKey(User user_id);
}
