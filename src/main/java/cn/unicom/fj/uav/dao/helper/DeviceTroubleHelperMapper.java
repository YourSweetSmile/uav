package cn.unicom.fj.uav.dao.helper;

import cn.unicom.fj.uav.dao.DeviceTroubleMapper;
import cn.unicom.fj.uav.model.helper.DeviceTroubleHelper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DeviceTroubleHelperMapper extends DeviceTroubleMapper {

    @Select({
            "select",
            "id, trouble_date, device_id, task_id, trouble_type, trouble_reason, is_delete",
            "from rel_device_trouble",
//            "where id = #{id,jdbcType=SMALLINT}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType= JdbcType.SMALLINT, id=true),
            @Result(column="trouble_date", property="troubleDate", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="device_id", property="deviceId", jdbcType=JdbcType.SMALLINT),
            @Result(column="task_id", property="taskId", jdbcType=JdbcType.SMALLINT),
            @Result(column="trouble_type", property="troubleType", jdbcType=JdbcType.VARCHAR),
            @Result(column="trouble_reason", property="troubleReason", jdbcType=JdbcType.VARCHAR),
            @Result(column="is_delete", property="isDelete", jdbcType=JdbcType.VARCHAR),
            @Result(column="device_id",property="device",
                    one=@One(select="cn.unicom.fj.uav.dao.DeviceMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER)),
            @Result(column="task_id",property="task",
                    one=@One(select="cn.unicom.fj.uav.dao.TaskMapper.selectByPrimaryKey",
                            fetchType= FetchType.EAGER))
    })
    List<DeviceTroubleHelper> selectByHelper(DeviceTroubleHelper deviceTroubleHelper);

}
