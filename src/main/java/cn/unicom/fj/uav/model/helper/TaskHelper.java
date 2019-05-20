package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.TaskType;

public class TaskHelper extends Task {
    private TaskType taskType;

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public TaskHelper() {
    }

    public TaskHelper(TaskType taskType) {
        this.taskType = taskType;
    }
}
