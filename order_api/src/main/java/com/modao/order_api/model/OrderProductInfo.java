package com.modao.order_api.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity(name = "order_product_info")
public class OrderProductInfo {
    private String id;
    private String appCode;
    private String appName;
    private String appIntroduce;
    private String versionId;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "app_code")
    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    @Basic
    @Column(name = "app_name")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Basic
    @Column(name = "app_introduce")
    public String getAppIntroduce() {
        return appIntroduce;
    }

    public void setAppIntroduce(String appIntroduce) {
        this.appIntroduce = appIntroduce;
    }

    @Basic
    @Column(name = "version_id")
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderProductInfo that = (OrderProductInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (appCode != null ? !appCode.equals(that.appCode) : that.appCode != null) return false;
        if (appName != null ? !appName.equals(that.appName) : that.appName != null) return false;
        if (appIntroduce != null ? !appIntroduce.equals(that.appIntroduce) : that.appIntroduce != null) return false;
        if (versionId != null ? !versionId.equals(that.versionId) : that.versionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (appCode != null ? appCode.hashCode() : 0);
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (appIntroduce != null ? appIntroduce.hashCode() : 0);
        result = 31 * result + (versionId != null ? versionId.hashCode() : 0);
        return result;
    }
}
