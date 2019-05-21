package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.TaskType;

import java.util.Date;

public class DeviceHelper extends Device {

    private TaskType taskType;

    private Date createTimeStart;

    private Date createTimeEnd;

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Date getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Date createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }
}
