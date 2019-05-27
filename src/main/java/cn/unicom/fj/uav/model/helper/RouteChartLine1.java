package cn.unicom.fj.uav.model.helper;

import java.util.Date;
import java.util.List;

public class RouteChartLine1 {

    private Date time;
    private int value;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public RouteChartLine1() {
    }

    public RouteChartLine1(Date time, int value) {
        this.time = time;
        this.value = value;
    }
}
