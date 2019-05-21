package cn.unicom.fj.uav.model;

import java.util.Date;

public class Route {
    private Short id;

    private String routeNo;

    private String routeName;

    private Short routeLeave;

    private Short routeArrival;

    private Date routeStart;

    private Date routeEnd;

    private String isDelete;

    private String routeStatus;

    private Short taskTypeId;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo == null ? null : routeNo.trim();
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName == null ? null : routeName.trim();
    }

    public Short getRouteLeave() {
        return routeLeave;
    }

    public void setRouteLeave(Short routeLeave) {
        this.routeLeave = routeLeave;
    }

    public Short getRouteArrival() {
        return routeArrival;
    }

    public void setRouteArrival(Short routeArrival) {
        this.routeArrival = routeArrival;
    }

    public Date getRouteStart() {
        return routeStart;
    }

    public void setRouteStart(Date routeStart) {
        this.routeStart = routeStart;
    }

    public Date getRouteEnd() {
        return routeEnd;
    }

    public void setRouteEnd(Date routeEnd) {
        this.routeEnd = routeEnd;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(String routeStatus) {
        this.routeStatus = routeStatus == null ? null : routeStatus.trim();
    }

    public Short getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Short taskTypeId) {
        this.taskTypeId = taskTypeId;
    }


}