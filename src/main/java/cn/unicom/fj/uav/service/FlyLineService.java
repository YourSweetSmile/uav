package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.helper.FlyLineHelperMapper;
import cn.unicom.fj.uav.model.helper.FlyLineHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlyLineService {

    @Autowired
    private FlyLineHelperMapper flyLineHelperMapper;

    public List<FlyLineHelper> getAllTsak(){
        return flyLineHelperMapper.getAllTask();
    }
}
