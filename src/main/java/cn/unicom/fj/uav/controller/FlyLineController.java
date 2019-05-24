package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.helper.FlyLineHelper;
import cn.unicom.fj.uav.service.FlyLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "flyLine")
public class FlyLineController {

    @Autowired
    private FlyLineService flyLineService;
    @RequestMapping(value = "line")
    //查询路线坐标
    public List<FlyLineHelper> getAll(){
        List<FlyLineHelper> list = flyLineService.getAllTsak();
        return list;
    }
}
