package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.helper.DeviceTroubleHelperMapper;
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

}
