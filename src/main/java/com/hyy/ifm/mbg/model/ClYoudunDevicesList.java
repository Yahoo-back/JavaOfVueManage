package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ClYoudunDevicesList implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "用户标识")
    private Long userId;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "设备名")
    private String deviceName;

    @ApiModelProperty(value = "设备 id")
    private String deviceId;

    @ApiModelProperty(value = "设备id链接数")
    private String deviceLinkIdCount;

    @ApiModelProperty(value = "设备最后使用时间")
    private String deviceLastUseDate;

    @ApiModelProperty(value = "设备详情")
    private String deviceDetail;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceLinkIdCount() {
        return deviceLinkIdCount;
    }

    public void setDeviceLinkIdCount(String deviceLinkIdCount) {
        this.deviceLinkIdCount = deviceLinkIdCount;
    }

    public String getDeviceLastUseDate() {
        return deviceLastUseDate;
    }

    public void setDeviceLastUseDate(String deviceLastUseDate) {
        this.deviceLastUseDate = deviceLastUseDate;
    }

    public String getDeviceDetail() {
        return deviceDetail;
    }

    public void setDeviceDetail(String deviceDetail) {
        this.deviceDetail = deviceDetail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", deviceLinkIdCount=").append(deviceLinkIdCount);
        sb.append(", deviceLastUseDate=").append(deviceLastUseDate);
        sb.append(", deviceDetail=").append(deviceDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}