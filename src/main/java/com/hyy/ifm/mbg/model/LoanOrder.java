package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class LoanOrder implements Serializable {
    private String id;

    private String userName;

    private String bankNo;

    private String bank;

    private String totalMoney;

    @ApiModelProperty(value = "0：易极付放款中 1：易极付代发到帐 2：易极付失败 3：手动放款到帐")
    private String status;

    private Date createTime;

    @ApiModelProperty(value = "user_order主键id")
    private Integer orderId;

    @ApiModelProperty(value = "代发成功时间, 回调时候回写")
    private Date payTime;

    private String userId;

    private String identityNo;

    private String mobileNo;

    @ApiModelProperty(value = "1快钱2畅捷")
    private String payFrom;

    private String picPath;

    @ApiModelProperty(value = "代发失败的原因")
    private String failReason;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPayFrom() {
        return payFrom;
    }

    public void setPayFrom(String payFrom) {
        this.payFrom = payFrom;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", bankNo=").append(bankNo);
        sb.append(", bank=").append(bank);
        sb.append(", totalMoney=").append(totalMoney);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", payTime=").append(payTime);
        sb.append(", userId=").append(userId);
        sb.append(", identityNo=").append(identityNo);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", payFrom=").append(payFrom);
        sb.append(", picPath=").append(picPath);
        sb.append(", failReason=").append(failReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}