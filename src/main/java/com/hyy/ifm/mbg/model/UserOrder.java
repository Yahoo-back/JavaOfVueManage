package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserOrder implements Serializable {
    private Integer id;

    private Integer userId;

    @ApiModelProperty(value = "对外订单编号")
    private String orderNo;

    @ApiModelProperty(value = "申请时间")
    private Date applyTime;

    @ApiModelProperty(value = "绑卡完成时间")
    private Date applyBankTime;

    @ApiModelProperty(value = "申请金额")
    private Double applyAmt;

    @ApiModelProperty(value = "应还款金额")
    private Double repayAmt;

    @ApiModelProperty(value = "实际还款时间")
    private Date payTime;

    @ApiModelProperty(value = "0: 待支付 1:成功 2：失败 3:支付中 4.只完成了绑卡，还没有扣费")
    private String status;

    @ApiModelProperty(value = "实际还款金额")
    private Double payAmt;

    @ApiModelProperty(value = "银行卡号")
    private String bankNo;

    @ApiModelProperty(value = "银行名称")
    private String bank;

    @ApiModelProperty(value = "订单状态  0.正常  1.待退款 2.退款中 3.退款成功 4.退款失败 5.待审核   ")
    private String userAuth;

    @ApiModelProperty(value = "实际退款金额")
    private Double rebackAmt;

    @ApiModelProperty(value = "客服id")
    private Integer sysUserId;

    @ApiModelProperty(value = "退款金额")
    private Double refundAmt;

    @ApiModelProperty(value = "退款申请时间")
    private Date refundTime;

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getApplyBankTime() {
        return applyBankTime;
    }

    public void setApplyBankTime(Date applyBankTime) {
        this.applyBankTime = applyBankTime;
    }

    public Double getApplyAmt() {
        return applyAmt;
    }

    public void setApplyAmt(Double applyAmt) {
        this.applyAmt = applyAmt;
    }

    public Double getRepayAmt() {
        return repayAmt;
    }

    public void setRepayAmt(Double repayAmt) {
        this.repayAmt = repayAmt;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(Double payAmt) {
        this.payAmt = payAmt;
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

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    public Double getRebackAmt() {
        return rebackAmt;
    }

    public void setRebackAmt(Double rebackAmt) {
        this.rebackAmt = rebackAmt;
    }

    public Integer getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    public Double getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(Double refundAmt) {
        this.refundAmt = refundAmt;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
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
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applyBankTime=").append(applyBankTime);
        sb.append(", applyAmt=").append(applyAmt);
        sb.append(", repayAmt=").append(repayAmt);
        sb.append(", payTime=").append(payTime);
        sb.append(", status=").append(status);
        sb.append(", payAmt=").append(payAmt);
        sb.append(", bankNo=").append(bankNo);
        sb.append(", bank=").append(bank);
        sb.append(", userAuth=").append(userAuth);
        sb.append(", rebackAmt=").append(rebackAmt);
        sb.append(", sysUserId=").append(sysUserId);
        sb.append(", refundAmt=").append(refundAmt);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}