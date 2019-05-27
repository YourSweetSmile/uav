package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.model.helper.TaskEchartHelper;
import cn.unicom.fj.uav.model.helper.TaskHelper;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
@Mapper
public interface TaskEchartMapper {
    @Select("SELECT COUNT(*) task_count,YEAR(task_start_time) task_year,MONTH(task_start_time) task_month,task_type_id " +
            "FROM `ent_task` " +
            "WHERE 1=1 AND task_start_time BETWEEN '2016-01-01 00:00:00' AND  '2018-12-31 23:59:59' " +
            "GROUP BY MONTH(task_start_time),task_type_id")
    @Results({
            @Result(column="task_year", property="taskyear"),
            @Result(column="task_month", property="taskmonth"),
            @Result(column="task_count", property="taskcount"),
            @Result(column="task_type_id",property="taskType",
                    one=@One(select="cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER)),
    })
    List<TaskEchartHelper> getTaskCount();

    @Select("SELECT a.click_date taskdate,IFNULL(b.type,0) AS task_type_id,IFNULL(b.count,0) AS taskcount " +
            "FROM ( " +
            "    SELECT DATE_SUB(CURDATE(), INTERVAL 6 DAY) AS click_date UNION ALL " +
            "    SELECT DATE_SUB(CURDATE(), INTERVAL 5 DAY) AS click_date UNION ALL " +
            "    SELECT DATE_SUB(CURDATE(), INTERVAL 4 DAY) AS click_date UNION ALL " +
            "    SELECT DATE_SUB(CURDATE(), INTERVAL 3 DAY) AS click_date UNION ALL " +
            "    SELECT DATE_SUB(CURDATE(), INTERVAL 2 DAY) AS click_date UNION ALL " +
            "    SELECT DATE_SUB(CURDATE(), INTERVAL 1 DAY) AS click_date UNION ALL " +
            "    SELECT CURDATE() AS click_date    " +
            ") a LEFT JOIN (" +
            "  SELECT DATE(task_start_time) AS DATETIME, COUNT(*) AS COUNT,task_type_id AS TYPE " +
            "  FROM ent_task WHERE task_type_id=#{type} " +
            "  GROUP BY DATE(task_start_time) " +
            ") b ON a.click_date = b.datetime")
    @Results({
            @Result(column="task_type_id",property="taskType",
                    one=@One(select="cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER)),
    })
    List<TaskEchartHelper> getCountByDate(Short type);
}
