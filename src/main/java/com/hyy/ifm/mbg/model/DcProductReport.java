package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DcProductReport implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "dc_product表主键")
    private Integer productId;

    @ApiModelProperty(value = "访问时间")
    private Date visitTime;

    @ApiModelProperty(value = "访问时间")
    private Date settleTime;

    @ApiModelProperty(value = "点击次数")
    private Integer visitCount;

    @ApiModelProperty(value = "注册数量")
    private Integer regCount;

    @ApiModelProperty(value = "转化率")
    private Double changeRate;

    @ApiModelProperty(value = "放款个数")
    private Integer loanCount;

    private String settleCertificatec;

    private String serialNumber;

    @ApiModelProperty(value = "结算方式(合作方式)")
    private String settleWay;

    @ApiModelProperty(value = "结算状态, 0: 未结算, 1: 已结算")
    private String settleState;

    @ApiModelProperty(value = "结算金额")
    private Double settleMoney;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    public Integer getRegCount() {
        return regCount;
    }

    public void setRegCount(Integer regCount) {
        this.regCount = regCount;
    }

    public Double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(Double changeRate) {
        this.changeRate = changeRate;
    }

    public Integer getLoanCount() {
        return loanCount;
    }

    public void setLoanCount(Integer loanCount) {
        this.loanCount = loanCount;
    }

    public String getSettleCertificatec() {
        return settleCertificatec;
    }

    public void setSettleCertificatec(String settleCertificatec) {
        this.settleCertificatec = settleCertificatec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSettleWay() {
        return settleWay;
    }

    public void setSettleWay(String settleWay) {
        this.settleWay = settleWay;
    }

    public String getSettleState() {
        return settleState;
    }

    public void setSettleState(String settleState) {
        this.settleState = settleState;
    }

    public Double getSettleMoney() {
        return settleMoney;
    }

    public void setSettleMoney(Double settleMoney) {
        this.settleMoney = settleMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", visitTime=").append(visitTime);
        sb.append(", settleTime=").append(settleTime);
        sb.append(", visitCount=").append(visitCount);
        sb.append(", regCount=").append(regCount);
        sb.append(", changeRate=").append(changeRate);
        sb.append(", loanCount=").append(loanCount);
        sb.append(", settleCertificatec=").append(settleCertificatec);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", settleWay=").append(settleWay);
        sb.append(", settleState=").append(settleState);
        sb.append(", settleMoney=").append(settleMoney);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}