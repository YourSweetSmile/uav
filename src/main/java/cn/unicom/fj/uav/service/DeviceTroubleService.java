package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.DeviceTroubleMapper;
import cn.unicom.fj.uav.dao.helper.DeviceTroubleHelperMapper;
import cn.unicom.fj.uav.model.DeviceTrouble;
import cn.unicom.fj.uav.model.helper.DeviceTroubleHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTroubleService {

    @Autowired
    private DeviceTroubleHelperMapper deviceTroubleHelperMapper;

    @Autowired
    private DeviceTroubleMapper deviceTroubleMapper;

    /**
     * 按条件查询故障列表
     * @param deviceTroubleHelper
     * @return
     */
    public PageInfo getDeviceTrouble(Integer pageNo, Integer pageSize, DeviceTroubleHelper deviceTroubleHelper) {

        PageHelper.startPage(pageNo, pageSize);
        List<DeviceTroubleHelper> list = deviceTroubleHelperMapper.selectByHelper(deviceTroubleHelper);
        return new PageInfo<>(list);
    }

    /**
     * 添加数据
     * @param record
     * @return
     */
    public Object insertData(DeviceTrouble record) {
        record.setIsDelete("0");
        return deviceTroubleMapper.insert(record);
    }

    /**
     * 更新数据
     * @param record
     * @return
     */
    public Object updateData(DeviceTrouble record) {
        return deviceTroubleMapper.updateByPrimaryKey(record);
    }

    /**
     * 删除数据
     * @param record
     * @return
     */
    public Object deleteData(DeviceTrouble record) {
        record.setIsDelete("1");
        return deviceTroubleMapper.updateByPrimaryKeySelective(record);
    }
}
