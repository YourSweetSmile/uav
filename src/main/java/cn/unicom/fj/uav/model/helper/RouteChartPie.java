package cn.unicom.fj.uav.model.helper;


public class RouteChartPie {
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public RouteChartPie() {
    }

    public RouteChartPie(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
