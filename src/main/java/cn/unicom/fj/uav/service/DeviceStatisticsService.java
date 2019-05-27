package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.helper.DeviceHelperMapper;
import cn.unicom.fj.uav.model.helper.DeviceStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceStatisticsService {

    @Autowired
    private DeviceHelperMapper deviceMapper;

    public List<DeviceStatistics> getTypeStat(){

        return deviceMapper.getTypeStat();
    }

}
