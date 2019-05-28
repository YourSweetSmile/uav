package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.DeviceTrouble;
import cn.unicom.fj.uav.model.helper.DeviceTroubleHelper;
import cn.unicom.fj.uav.service.DeviceTroubleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trouble")
public class DeviceTroubleController {

    @Autowired
    private DeviceTroubleService deviceTroubleService;

    /**
     * 按条件查询故障管理信息
     * @param pageNo
     * @param pageSize
     * @param deviceTroubleHelper
     * @return
     */
    @PostMapping("/list")
    public PageInfo getDeviceTrouble(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                     @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                     @RequestBody DeviceTroubleHelper deviceTroubleHelper) {

        return deviceTroubleService.getDeviceTrouble(pageNo, pageSize, deviceTroubleHelper);
    }

    /**
     * 添加数据
     * @param record
     * @return
     */
    @PostMapping("/create")
    public Object addData(@RequestBody DeviceTrouble record) {
        return deviceTroubleService.insertData(record);
    }

    /**
     * 更新数据
     * @param record
     * @return
     */
    @PutMapping("/update")
    public Object updateData(@RequestBody DeviceTrouble record) {
        return deviceTroubleService.updateData(record);
    }

    @PutMapping("/delete")
    public Object deleteData(@RequestBody DeviceTrouble record) {
        return deviceTroubleService.deleteData(record);
    }

}
