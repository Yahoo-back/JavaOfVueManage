package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ClRcXinyanBlackRule implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "最大逾期金额")
    private String maxOverdueAmt;

    @ApiModelProperty(value = "最长逾期天数")
    private String maxOverdueDays;

    @ApiModelProperty(value = "当前逾期机构数")
    private String currentlyOverdue;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMaxOverdueAmt() {
        return maxOverdueAmt;
    }

    public void setMaxOverdueAmt(String maxOverdueAmt) {
        this.maxOverdueAmt = maxOverdueAmt;
    }

    public String getMaxOverdueDays() {
        return maxOverdueDays;
    }

    public void setMaxOverdueDays(String maxOverdueDays) {
        this.maxOverdueDays = maxOverdueDays;
    }

    public String getCurrentlyOverdue() {
        return currentlyOverdue;
    }

    public void setCurrentlyOverdue(String currentlyOverdue) {
        this.currentlyOverdue = currentlyOverdue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", phone=").append(phone);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", createTime=").append(createTime);
        sb.append(", maxOverdueAmt=").append(maxOverdueAmt);
        sb.append(", maxOverdueDays=").append(maxOverdueDays);
        sb.append(", currentlyOverdue=").append(currentlyOverdue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}