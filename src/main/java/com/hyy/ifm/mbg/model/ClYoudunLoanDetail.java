package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ClYoudunLoanDetail implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "用户标识")
    private Long userId;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "实际贷款平台计数")
    private String actualLoanPlatformCount;

    @ApiModelProperty(value = "实际贷款平台计数(近3月)")
    private String actualLoanPlatformCount3m;

    @ApiModelProperty(value = "实际贷款平台计数(近1月)")
    private String actualLoanPlatformCount1m;

    @ApiModelProperty(value = "实际贷款平台计数(近6月)")
    private String actualLoanPlatformCount6m;

    @ApiModelProperty(value = "贷款平台计数")
    private String loanPlatformCount;

    @ApiModelProperty(value = "贷款平台计数(近3月)")
    private String loanPlatformCount3m;

    @ApiModelProperty(value = "贷款平台计数(近1月)")
    private String loanPlatformCount1m;

    @ApiModelProperty(value = "贷款平台计数(近6月)")
    private String loanPlatformCount6m;

    @ApiModelProperty(value = "还款时间计数")
    private String repaymentTimesCount;

    @ApiModelProperty(value = "还款平台计数")
    private String repaymentPlatformCount;

    @ApiModelProperty(value = "还款平台计数(近3月)")
    private String repaymentPlatformCount3m;

    @ApiModelProperty(value = "还款平台计数(近1月)")
    private String repaymentPlatformCount1m;

    @ApiModelProperty(value = "还款平台计数(近6月)")
    private String repaymentPlatformCount6m;

    @ApiModelProperty(value = "今日申请借款平台数")
    private String todayRequestLoanP;

    @ApiModelProperty(value = "今日申请借款次数")
    private String todayRequestLoanFre;

    @ApiModelProperty(value = "今日申请借款设备个数")
    private String todayRequestLoanDivice;

    @ApiModelProperty(value = "今日每小时申请借款次数最大值")
    private String todayRequestLoanFreMax;

    @ApiModelProperty(value = "今日每小时申请借款平台数最大值")
    private String todayRequestLoanPMax;

    @ApiModelProperty(value = "行业借款详情")
    private String loanIndustry;

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

    public String getActualLoanPlatformCount() {
        return actualLoanPlatformCount;
    }

    public void setActualLoanPlatformCount(String actualLoanPlatformCount) {
        this.actualLoanPlatformCount = actualLoanPlatformCount;
    }

    public String getActualLoanPlatformCount3m() {
        return actualLoanPlatformCount3m;
    }

    public void setActualLoanPlatformCount3m(String actualLoanPlatformCount3m) {
        this.actualLoanPlatformCount3m = actualLoanPlatformCount3m;
    }

    public String getActualLoanPlatformCount1m() {
        return actualLoanPlatformCount1m;
    }

    public void setActualLoanPlatformCount1m(String actualLoanPlatformCount1m) {
        this.actualLoanPlatformCount1m = actualLoanPlatformCount1m;
    }

    public String getActualLoanPlatformCount6m() {
        return actualLoanPlatformCount6m;
    }

    public void setActualLoanPlatformCount6m(String actualLoanPlatformCount6m) {
        this.actualLoanPlatformCount6m = actualLoanPlatformCount6m;
    }

    public String getLoanPlatformCount() {
        return loanPlatformCount;
    }

    public void setLoanPlatformCount(String loanPlatformCount) {
        this.loanPlatformCount = loanPlatformCount;
    }

    public String getLoanPlatformCount3m() {
        return loanPlatformCount3m;
    }

    public void setLoanPlatformCount3m(String loanPlatformCount3m) {
        this.loanPlatformCount3m = loanPlatformCount3m;
    }

    public String getLoanPlatformCount1m() {
        return loanPlatformCount1m;
    }

    public void setLoanPlatformCount1m(String loanPlatformCount1m) {
        this.loanPlatformCount1m = loanPlatformCount1m;
    }

    public String getLoanPlatformCount6m() {
        return loanPlatformCount6m;
    }

    public void setLoanPlatformCount6m(String loanPlatformCount6m) {
        this.loanPlatformCount6m = loanPlatformCount6m;
    }

    public String getRepaymentTimesCount() {
        return repaymentTimesCount;
    }

    public void setRepaymentTimesCount(String repaymentTimesCount) {
        this.repaymentTimesCount = repaymentTimesCount;
    }

    public String getRepaymentPlatformCount() {
        return repaymentPlatformCount;
    }

    public void setRepaymentPlatformCount(String repaymentPlatformCount) {
        this.repaymentPlatformCount = repaymentPlatformCount;
    }

    public String getRepaymentPlatformCount3m() {
        return repaymentPlatformCount3m;
    }

    public void setRepaymentPlatformCount3m(String repaymentPlatformCount3m) {
        this.repaymentPlatformCount3m = repaymentPlatformCount3m;
    }

    public String getRepaymentPlatformCount1m() {
        return repaymentPlatformCount1m;
    }

    public void setRepaymentPlatformCount1m(String repaymentPlatformCount1m) {
        this.repaymentPlatformCount1m = repaymentPlatformCount1m;
    }

    public String getRepaymentPlatformCount6m() {
        return repaymentPlatformCount6m;
    }

    public void setRepaymentPlatformCount6m(String repaymentPlatformCount6m) {
        this.repaymentPlatformCount6m = repaymentPlatformCount6m;
    }

    public String getTodayRequestLoanP() {
        return todayRequestLoanP;
    }

    public void setTodayRequestLoanP(String todayRequestLoanP) {
        this.todayRequestLoanP = todayRequestLoanP;
    }

    public String getTodayRequestLoanFre() {
        return todayRequestLoanFre;
    }

    public void setTodayRequestLoanFre(String todayRequestLoanFre) {
        this.todayRequestLoanFre = todayRequestLoanFre;
    }

    public String getTodayRequestLoanDivice() {
        return todayRequestLoanDivice;
    }

    public void setTodayRequestLoanDivice(String todayRequestLoanDivice) {
        this.todayRequestLoanDivice = todayRequestLoanDivice;
    }

    public String getTodayRequestLoanFreMax() {
        return todayRequestLoanFreMax;
    }

    public void setTodayRequestLoanFreMax(String todayRequestLoanFreMax) {
        this.todayRequestLoanFreMax = todayRequestLoanFreMax;
    }

    public String getTodayRequestLoanPMax() {
        return todayRequestLoanPMax;
    }

    public void setTodayRequestLoanPMax(String todayRequestLoanPMax) {
        this.todayRequestLoanPMax = todayRequestLoanPMax;
    }

    public String getLoanIndustry() {
        return loanIndustry;
    }

    public void setLoanIndustry(String loanIndustry) {
        this.loanIndustry = loanIndustry;
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
        sb.append(", actualLoanPlatformCount=").append(actualLoanPlatformCount);
        sb.append(", actualLoanPlatformCount3m=").append(actualLoanPlatformCount3m);
        sb.append(", actualLoanPlatformCount1m=").append(actualLoanPlatformCount1m);
        sb.append(", actualLoanPlatformCount6m=").append(actualLoanPlatformCount6m);
        sb.append(", loanPlatformCount=").append(loanPlatformCount);
        sb.append(", loanPlatformCount3m=").append(loanPlatformCount3m);
        sb.append(", loanPlatformCount1m=").append(loanPlatformCount1m);
        sb.append(", loanPlatformCount6m=").append(loanPlatformCount6m);
        sb.append(", repaymentTimesCount=").append(repaymentTimesCount);
        sb.append(", repaymentPlatformCount=").append(repaymentPlatformCount);
        sb.append(", repaymentPlatformCount3m=").append(repaymentPlatformCount3m);
        sb.append(", repaymentPlatformCount1m=").append(repaymentPlatformCount1m);
        sb.append(", repaymentPlatformCount6m=").append(repaymentPlatformCount6m);
        sb.append(", todayRequestLoanP=").append(todayRequestLoanP);
        sb.append(", todayRequestLoanFre=").append(todayRequestLoanFre);
        sb.append(", todayRequestLoanDivice=").append(todayRequestLoanDivice);
        sb.append(", todayRequestLoanFreMax=").append(todayRequestLoanFreMax);
        sb.append(", todayRequestLoanPMax=").append(todayRequestLoanPMax);
        sb.append(", loanIndustry=").append(loanIndustry);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}