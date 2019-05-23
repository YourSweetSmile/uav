package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.Task;
import cn.unicom.fj.uav.model.TaskType;

public class TaskHelper extends Task {
    private TaskType taskType;
    private Route route;

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public TaskHelper() {
    }

    public TaskHelper(TaskType taskType, Route route) {
        this.taskType = taskType;
        this.route = route;
    }
}
