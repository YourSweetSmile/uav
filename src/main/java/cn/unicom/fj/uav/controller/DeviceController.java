package cn.unicom.fj.uav.controller;

import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.helper.DeviceHelper;
import cn.unicom.fj.uav.service.DeviceService;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


/**
 * 设备控制器
 * @author yinjw
 */
@RestController
@RequestMapping("/dev")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    /**
     * 获取列表并分页
     * @param pageNo
     * @param pageSize
     * @param deviceHelper
     * @return
     */
    @PostMapping("/list")
    public PageInfo getList(
            @RequestParam("page") Integer pageNo,
            @RequestParam("limit") Integer pageSize,
            @RequestBody DeviceHelper deviceHelper) {

        return deviceService.getScopedDevice(pageNo, pageSize, deviceHelper);
    }

    /**
     * 添加设备
     * @param device
     */
    @PostMapping("/add")
    public void addDevice(@RequestBody Device device){

        deviceService.addDevice(device);
    }

    /**
     * 根据id修改设备字段
     * @param device
     */
    @PostMapping("/edit")
    public void editDevice(@RequestBody Device device){

        deviceService.updateDev(device);
    }

    /**
     * 修改设备状态
     * @param id
     * @param deviceStatus
     */
    @GetMapping("/edit/status")
    public void stopDevice(Short id, String deviceStatus){
        deviceService.stopDev(id, deviceStatus);
    }

    @PostMapping("/file/import")
    public Device importDevice(@RequestParam("file") MultipartFile mFile) throws Exception {

        // 获取文件名
        String fileName = mFile.getOriginalFilename();
        // 获取文件后缀
        String prefix=fileName.substring(fileName.lastIndexOf("."));
        // 用uuid作为文件名，防止生成的临时文件重复
        final File excelFile = File.createTempFile(System.currentTimeMillis()+"", prefix);
        // MultipartFile to File
        mFile.transferTo(excelFile);

        //业务逻辑
        Device device = deviceService.importDev(excelFile);

        //程序结束时，删除临时文件
        deleteFile(excelFile);

        return device;
    }

    /**
     * 删除文件
     *
     * @param files
     */
    private void deleteFile(File... files) {
        for (File file : files) {
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
