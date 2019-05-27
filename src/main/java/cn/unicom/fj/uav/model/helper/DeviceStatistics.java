package cn.unicom.fj.uav.model.helper;

/**
 * 设备统计时用
 * @Author yinjw
 */
public class DeviceStatistics {

    private String name;
    private Integer value;

    private Integer count;
    private String year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
