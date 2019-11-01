package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ClRcXinyanBehaviorRule implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "贷款机构数")
    private Integer loansOrgCount;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "贷款行为分")
    private Integer loansScore;

    @ApiModelProperty(value = "贷款行为置信度")
    private Integer loansCredibility;

    @ApiModelProperty(value = "贷款放款总订单数	")
    private Integer loansCount;

    @ApiModelProperty(value = "近1个月贷款笔数")
    private Integer latestOneMonth;

    @ApiModelProperty(value = "贷款已结清订单数")
    private Integer loansSettleCount;

    @ApiModelProperty(value = "贷款逾期订单数")
    private Integer loansOverdueCount;

    @ApiModelProperty(value = "最近一次贷款时间")
    private String loansLatestTime;

    @ApiModelProperty(value = "信用贷款时长")
    private Integer loansLongTime;

    @ApiModelProperty(value = "历史贷款机构成功扣款笔数")
    private Integer historySucFee;

    @ApiModelProperty(value = "历史贷款机构失败扣款笔数")
    private Integer historyFailFee;

    @ApiModelProperty(value = "近1个月贷款机构成功扣款笔数")
    private Integer latestOneMonthSuc;

    @ApiModelProperty(value = "消费金融类机构数")
    private Integer consfinOrgCount;

    @ApiModelProperty(value = "近6个月贷款笔数")
    private Integer latestSixMonth;

    @ApiModelProperty(value = "网络贷款类机构数")
    private Integer loansCashCount;

    @ApiModelProperty(value = "近3个月贷款笔数")
    private Integer latestThreeMonth;

    @ApiModelProperty(value = "最近一次贷款时间与申请时间相隔天数")
    private Integer loansLatestTimeData;

    @ApiModelProperty(value = "近1个月贷款机构失败扣款笔数")
    private Integer latestOneMonthFail;

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

    public Integer getLoansOrgCount() {
        return loansOrgCount;
    }

    public void setLoansOrgCount(Integer loansOrgCount) {
        this.loansOrgCount = loansOrgCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLoansScore() {
        return loansScore;
    }

    public void setLoansScore(Integer loansScore) {
        this.loansScore = loansScore;
    }

    public Integer getLoansCredibility() {
        return loansCredibility;
    }

    public void setLoansCredibility(Integer loansCredibility) {
        this.loansCredibility = loansCredibility;
    }

    public Integer getLoansCount() {
        return loansCount;
    }

    public void setLoansCount(Integer loansCount) {
        this.loansCount = loansCount;
    }

    public Integer getLatestOneMonth() {
        return latestOneMonth;
    }

    public void setLatestOneMonth(Integer latestOneMonth) {
        this.latestOneMonth = latestOneMonth;
    }

    public Integer getLoansSettleCount() {
        return loansSettleCount;
    }

    public void setLoansSettleCount(Integer loansSettleCount) {
        this.loansSettleCount = loansSettleCount;
    }

    public Integer getLoansOverdueCount() {
        return loansOverdueCount;
    }

    public void setLoansOverdueCount(Integer loansOverdueCount) {
        this.loansOverdueCount = loansOverdueCount;
    }

    public String getLoansLatestTime() {
        return loansLatestTime;
    }

    public void setLoansLatestTime(String loansLatestTime) {
        this.loansLatestTime = loansLatestTime;
    }

    public Integer getLoansLongTime() {
        return loansLongTime;
    }

    public void setLoansLongTime(Integer loansLongTime) {
        this.loansLongTime = loansLongTime;
    }

    public Integer getHistorySucFee() {
        return historySucFee;
    }

    public void setHistorySucFee(Integer historySucFee) {
        this.historySucFee = historySucFee;
    }

    public Integer getHistoryFailFee() {
        return historyFailFee;
    }

    public void setHistoryFailFee(Integer historyFailFee) {
        this.historyFailFee = historyFailFee;
    }

    public Integer getLatestOneMonthSuc() {
        return latestOneMonthSuc;
    }

    public void setLatestOneMonthSuc(Integer latestOneMonthSuc) {
        this.latestOneMonthSuc = latestOneMonthSuc;
    }

    public Integer getConsfinOrgCount() {
        return consfinOrgCount;
    }

    public void setConsfinOrgCount(Integer consfinOrgCount) {
        this.consfinOrgCount = consfinOrgCount;
    }

    public Integer getLatestSixMonth() {
        return latestSixMonth;
    }

    public void setLatestSixMonth(Integer latestSixMonth) {
        this.latestSixMonth = latestSixMonth;
    }

    public Integer getLoansCashCount() {
        return loansCashCount;
    }

    public void setLoansCashCount(Integer loansCashCount) {
        this.loansCashCount = loansCashCount;
    }

    public Integer getLatestThreeMonth() {
        return latestThreeMonth;
    }

    public void setLatestThreeMonth(Integer latestThreeMonth) {
        this.latestThreeMonth = latestThreeMonth;
    }

    public Integer getLoansLatestTimeData() {
        return loansLatestTimeData;
    }

    public void setLoansLatestTimeData(Integer loansLatestTimeData) {
        this.loansLatestTimeData = loansLatestTimeData;
    }

    public Integer getLatestOneMonthFail() {
        return latestOneMonthFail;
    }

    public void setLatestOneMonthFail(Integer latestOneMonthFail) {
        this.latestOneMonthFail = latestOneMonthFail;
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
        sb.append(", loansOrgCount=").append(loansOrgCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", loansScore=").append(loansScore);
        sb.append(", loansCredibility=").append(loansCredibility);
        sb.append(", loansCount=").append(loansCount);
        sb.append(", latestOneMonth=").append(latestOneMonth);
        sb.append(", loansSettleCount=").append(loansSettleCount);
        sb.append(", loansOverdueCount=").append(loansOverdueCount);
        sb.append(", loansLatestTime=").append(loansLatestTime);
        sb.append(", loansLongTime=").append(loansLongTime);
        sb.append(", historySucFee=").append(historySucFee);
        sb.append(", historyFailFee=").append(historyFailFee);
        sb.append(", latestOneMonthSuc=").append(latestOneMonthSuc);
        sb.append(", consfinOrgCount=").append(consfinOrgCount);
        sb.append(", latestSixMonth=").append(latestSixMonth);
        sb.append(", loansCashCount=").append(loansCashCount);
        sb.append(", latestThreeMonth=").append(latestThreeMonth);
        sb.append(", loansLatestTimeData=").append(loansLatestTimeData);
        sb.append(", latestOneMonthFail=").append(latestOneMonthFail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}