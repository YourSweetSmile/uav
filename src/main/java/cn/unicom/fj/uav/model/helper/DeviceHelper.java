package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.Device;
import cn.unicom.fj.uav.model.TaskType;

public class DeviceHelper extends Device {

    private TaskType taskType;

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        System.out.println(taskType.getTypeName());
        this.taskType = taskType;
    }

}
