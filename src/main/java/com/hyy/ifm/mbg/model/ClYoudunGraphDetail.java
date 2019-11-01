package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ClYoudunGraphDetail implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "用户标识")
    private Long userId;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "使用手机号个数")
    private String mobileCount;

    @ApiModelProperty(value = "关联用户数")
    private String linkUserCount;

    @ApiModelProperty(value = "其他关联设备")
    private String otherLinkDeviceCount;

    @ApiModelProperty(value = "用户拥有银行卡数量")
    private String userHaveBankcardCount;

    @ApiModelProperty(value = "本商户内用户")
    private String partnerUserCount;

    @ApiModelProperty(value = "关联银行卡数")
    private String bankcardCount;

    @ApiModelProperty(value = "使用设备数")
    private String linkDeviceCount;

    @ApiModelProperty(value = "关联用户详情")
    private String linkUserDetail;

    @ApiModelProperty(value = "其他链接设备细节")
    private String otherLinkDeviceDetail;

    @ApiModelProperty(value = "使用设备数详情")
    private String linkDeviceDetail;

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

    public String getMobileCount() {
        return mobileCount;
    }

    public void setMobileCount(String mobileCount) {
        this.mobileCount = mobileCount;
    }

    public String getLinkUserCount() {
        return linkUserCount;
    }

    public void setLinkUserCount(String linkUserCount) {
        this.linkUserCount = linkUserCount;
    }

    public String getOtherLinkDeviceCount() {
        return otherLinkDeviceCount;
    }

    public void setOtherLinkDeviceCount(String otherLinkDeviceCount) {
        this.otherLinkDeviceCount = otherLinkDeviceCount;
    }

    public String getUserHaveBankcardCount() {
        return userHaveBankcardCount;
    }

    public void setUserHaveBankcardCount(String userHaveBankcardCount) {
        this.userHaveBankcardCount = userHaveBankcardCount;
    }

    public String getPartnerUserCount() {
        return partnerUserCount;
    }

    public void setPartnerUserCount(String partnerUserCount) {
        this.partnerUserCount = partnerUserCount;
    }

    public String getBankcardCount() {
        return bankcardCount;
    }

    public void setBankcardCount(String bankcardCount) {
        this.bankcardCount = bankcardCount;
    }

    public String getLinkDeviceCount() {
        return linkDeviceCount;
    }

    public void setLinkDeviceCount(String linkDeviceCount) {
        this.linkDeviceCount = linkDeviceCount;
    }

    public String getLinkUserDetail() {
        return linkUserDetail;
    }

    public void setLinkUserDetail(String linkUserDetail) {
        this.linkUserDetail = linkUserDetail;
    }

    public String getOtherLinkDeviceDetail() {
        return otherLinkDeviceDetail;
    }

    public void setOtherLinkDeviceDetail(String otherLinkDeviceDetail) {
        this.otherLinkDeviceDetail = otherLinkDeviceDetail;
    }

    public String getLinkDeviceDetail() {
        return linkDeviceDetail;
    }

    public void setLinkDeviceDetail(String linkDeviceDetail) {
        this.linkDeviceDetail = linkDeviceDetail;
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
        sb.append(", mobileCount=").append(mobileCount);
        sb.append(", linkUserCount=").append(linkUserCount);
        sb.append(", otherLinkDeviceCount=").append(otherLinkDeviceCount);
        sb.append(", userHaveBankcardCount=").append(userHaveBankcardCount);
        sb.append(", partnerUserCount=").append(partnerUserCount);
        sb.append(", bankcardCount=").append(bankcardCount);
        sb.append(", linkDeviceCount=").append(linkDeviceCount);
        sb.append(", linkUserDetail=").append(linkUserDetail);
        sb.append(", otherLinkDeviceDetail=").append(otherLinkDeviceDetail);
        sb.append(", linkDeviceDetail=").append(linkDeviceDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}