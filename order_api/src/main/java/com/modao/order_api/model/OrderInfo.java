package com.modao.order_api.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "order_info")
public class OrderInfo {
    private String id;
    private String userId;
    private String appCode;
    private String appName;
    private String versionId;
    private String versionName;
    private String orderLong;
    private Timestamp startTime;
    private Timestamp oosTime;
    private Timestamp createTime;
    private Double payPrice;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
    @Column(name = "version_id")
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
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
    @Column(name = "order_long")
    public String getOrderLong() {
        return orderLong;
    }

    public void setOrderLong(String orderLong) {
        this.orderLong = orderLong;
    }

    @Basic
    @Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "oos_time")
    public Timestamp getOosTime() {
        return oosTime;
    }

    public void setOosTime(Timestamp oosTime) {
        this.oosTime = oosTime;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "pay_price")
    public Double getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderInfo orderInfo = (OrderInfo) o;

        if (id != null ? !id.equals(orderInfo.id) : orderInfo.id != null) return false;
        if (userId != null ? !userId.equals(orderInfo.userId) : orderInfo.userId != null) return false;
        if (appCode != null ? !appCode.equals(orderInfo.appCode) : orderInfo.appCode != null) return false;
        if (appName != null ? !appName.equals(orderInfo.appName) : orderInfo.appName != null) return false;
        if (versionId != null ? !versionId.equals(orderInfo.versionId) : orderInfo.versionId != null) return false;
        if (versionName != null ? !versionName.equals(orderInfo.versionName) : orderInfo.versionName != null)
            return false;
        if (orderLong != null ? !orderLong.equals(orderInfo.orderLong) : orderInfo.orderLong != null) return false;
        if (startTime != null ? !startTime.equals(orderInfo.startTime) : orderInfo.startTime != null) return false;
        if (oosTime != null ? !oosTime.equals(orderInfo.oosTime) : orderInfo.oosTime != null) return false;
        if (createTime != null ? !createTime.equals(orderInfo.createTime) : orderInfo.createTime != null) return false;
        if (payPrice != null ? !payPrice.equals(orderInfo.payPrice) : orderInfo.payPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (appCode != null ? appCode.hashCode() : 0);
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (versionId != null ? versionId.hashCode() : 0);
        result = 31 * result + (versionName != null ? versionName.hashCode() : 0);
        result = 31 * result + (orderLong != null ? orderLong.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (oosTime != null ? oosTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (payPrice != null ? payPrice.hashCode() : 0);
        return result;
    }
}
