package cn.unicom.fj.uav.service;

import cn.unicom.fj.uav.dao.LocationMapper;
import cn.unicom.fj.uav.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationMapper locationMapper;

    public List<Location> selectAll(){
        return locationMapper.selectAll();
    }

}
