package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CjOrder implements Serializable {
    private Integer id;

    private Integer userId;

    @ApiModelProperty(value = "0: 续期, 1: 还款")
    private String type;

    @ApiModelProperty(value = "order_delay标id或user_order标id")
    private Integer outerId;

    @ApiModelProperty(value = "唯一请求号")
    private String requestNo;

    @ApiModelProperty(value = "客户ip")
    private String userIp;

    @ApiModelProperty(value = "交易金额, 以元计算, 保留两位小数")
    private Double amt;

    @ApiModelProperty(value = "畅捷流水号")
    private String orderTrxid;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "0: 支付中, 1: 成功, 2: 失败, 3: 异常")
    private String status;

    @ApiModelProperty(value = "支付时间")
    private Date payDate;

    @ApiModelProperty(value = "失败原因")
    private String failReason;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOuterId() {
        return outerId;
    }

    public void setOuterId(Integer outerId) {
        this.outerId = outerId;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public String getOrderTrxid() {
        return orderTrxid;
    }

    public void setOrderTrxid(String orderTrxid) {
        this.orderTrxid = orderTrxid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
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
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", outerId=").append(outerId);
        sb.append(", requestNo=").append(requestNo);
        sb.append(", userIp=").append(userIp);
        sb.append(", amt=").append(amt);
        sb.append(", orderTrxid=").append(orderTrxid);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", payDate=").append(payDate);
        sb.append(", failReason=").append(failReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}