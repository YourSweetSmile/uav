package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.DeviceTrouble;
import cn.unicom.fj.uav.model.Task;

import java.util.Date;

public class DeviceTroubleHelper extends DeviceTrouble {

    private Device device;

    private Task task;

    private Date startTime;

    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }


}
