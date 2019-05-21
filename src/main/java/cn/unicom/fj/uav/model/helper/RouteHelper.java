package cn.unicom.fj.uav.model.helper;

import cn.unicom.fj.uav.model.Location;
import cn.unicom.fj.uav.model.Route;
import cn.unicom.fj.uav.model.TaskType;

public class RouteHelper extends Route {

    private TaskType taskType;
    private Location leave;
    private Location arrival;

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Location getLeave() {
        return leave;
    }

    public void setLeave(Location leave) {
        this.leave = leave;
    }

    public Location getArrival() {
        return arrival;
    }

    public void setArrival(Location arrival) {
        this.arrival = arrival;
    }

    public RouteHelper() {
    }

    public RouteHelper(TaskType taskType) {
        this.taskType = taskType;
    }

    public RouteHelper(Location leave, Location arrival) {
        this.leave = leave;
        this.arrival = arrival;
    }
}
