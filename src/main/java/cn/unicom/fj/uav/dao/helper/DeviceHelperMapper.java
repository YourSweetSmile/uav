package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.DeviceMapper;
import cn.unicom.fj.uav.model.helper.DeviceHelper;
import cn.unicom.fj.uav.model.helper.DeviceStatistics;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DeviceHelperMapper extends DeviceMapper {


    /**
     * 组合查询
     */
    @Select({
            "<script>",
            "select",
            "id, device_type, task_type_id, device_status, device_num, device_name, device_comm, ",
            "power_max, capacity, fly_mileage, wind_res, water_res, hit_res, flexibility, ",
            "emc_res, img_url, wing_loss, power_loss, camera_loss, pack_loss, engine_loss, ",
            "base_loss, create_time, device_desc",
            "from ent_device",
            "where 1=1",
                "<if test='id!=null'>",
                    "and id=#{id}",
                 "</if>",
                "<if test='deviceNum!=null and deviceNum!=\"\"'>",
                    "and device_num=#{deviceNum}",
                "</if>",
                "<if test='deviceName!=null and deviceName!=\"\"'>",
                    "and device_name like '%${deviceName}%'",
                "</if>",
                "<if test='deviceType!=null and deviceType!=\"\"'>",
                    "and device_type=#{deviceType}",
                "</if>",
                "<if test='deviceStatus!=null and deviceStatus!=\"\"'>",
                    "and device_status=#{deviceStatus}",
                "</if>",
                "<if test='createTimeStart!=null'>",
                    "and create_time&gt;=#{createTimeStart}",
                 "</if>",
                "<if test='createTimeEnd!=null'>",
                    "and create_time&lt;=#{createTimeEnd}",
                "</if>",
                "<if test='sort==\"-id\"'>",
                    "order by id desc",
                "</if>",
                "<if test='sort==\"+id\"'>",
                    "order by id",
                "</if>",
            "</script>"
    })
    @Results({
            @Result(column="task_type_id",property="taskType",
                    one=@One(select="cn.unicom.fj.uav.dao.TaskTypeMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER))
    })
    List<DeviceHelper> selectByHelper(DeviceHelper deviceHelper);


    @Select("select device_type name,count(id) value from ent_device group by device_type")
    List<DeviceStatistics> getTypeStat();


    @Select("select count(id) value,task_type_id name from ent_device group by task_type_id")
    List<DeviceStatistics> getTaskTypeStat();
}
