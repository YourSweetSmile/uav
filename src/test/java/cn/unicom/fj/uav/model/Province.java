package cn.unicom.fj.uav.model;

public class Province {
    private Byte provinceId;

    private String provinceName;

    public Byte getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Byte provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }
}