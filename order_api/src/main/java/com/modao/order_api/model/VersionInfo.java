package com.modao.order_api.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity(name = "version_info")
public class VersionInfo {
    private String id;
    private Byte versionLevel;
    private String versionName;
    private String versionDays;
    private Double versionPrice;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "version_level")
    public Byte getVersionLevel() {
        return versionLevel;
    }

    public void setVersionLevel(Byte versionLevel) {
        this.versionLevel = versionLevel;
    }

    @Basic
    @Column(name = "version_name")
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Basic
    @Column(name = "version_days")
    public String getVersionDays() {
        return versionDays;
    }

    public void setVersionDays(String versionDays) {
        this.versionDays = versionDays;
    }

    @Basic
    @Column(name = "version_price")
    public Double getVersionPrice() {
        return versionPrice;
    }

    public void setVersionPrice(Double versionPrice) {
        this.versionPrice = versionPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VersionInfo that = (VersionInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (versionLevel != null ? !versionLevel.equals(that.versionLevel) : that.versionLevel != null) return false;
        if (versionName != null ? !versionName.equals(that.versionName) : that.versionName != null) return false;
        if (versionDays != null ? !versionDays.equals(that.versionDays) : that.versionDays != null) return false;
        if (versionPrice != null ? !versionPrice.equals(that.versionPrice) : that.versionPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (versionLevel != null ? versionLevel.hashCode() : 0);
        result = 31 * result + (versionName != null ? versionName.hashCode() : 0);
        result = 31 * result + (versionDays != null ? versionDays.hashCode() : 0);
        result = 31 * result + (versionPrice != null ? versionPrice.hashCode() : 0);
        return result;
    }
}
