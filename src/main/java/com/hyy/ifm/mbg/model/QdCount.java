package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class QdCount implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "渠道名")
    private String source;

    @ApiModelProperty(value = "含验证码的注册数")
    private Integer count;

    @ApiModelProperty(value = "uv注册数")
    private Integer countuv;

    @ApiModelProperty(value = "未认证数")
    private Integer nonecount;

    @ApiModelProperty(value = "活体数")
    private Integer facecount;

    @ApiModelProperty(value = "个人信息数")
    private Integer percount;

    @ApiModelProperty(value = "银行卡数")
    private Integer bankcount;

    @ApiModelProperty(value = "联系人数")
    private Integer concatcount;

    @ApiModelProperty(value = "运营商数")
    private Integer yuncount;

    @ApiModelProperty(value = "放款数")
    private Integer paycount;

    @ApiModelProperty(value = "注册时间")
    private Date visitTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCountuv() {
        return countuv;
    }

    public void setCountuv(Integer countuv) {
        this.countuv = countuv;
    }

    public Integer getNonecount() {
        return nonecount;
    }

    public void setNonecount(Integer nonecount) {
        this.nonecount = nonecount;
    }

    public Integer getFacecount() {
        return facecount;
    }

    public void setFacecount(Integer facecount) {
        this.facecount = facecount;
    }

    public Integer getPercount() {
        return percount;
    }

    public void setPercount(Integer percount) {
        this.percount = percount;
    }

    public Integer getBankcount() {
        return bankcount;
    }

    public void setBankcount(Integer bankcount) {
        this.bankcount = bankcount;
    }

    public Integer getConcatcount() {
        return concatcount;
    }

    public void setConcatcount(Integer concatcount) {
        this.concatcount = concatcount;
    }

    public Integer getYuncount() {
        return yuncount;
    }

    public void setYuncount(Integer yuncount) {
        this.yuncount = yuncount;
    }

    public Integer getPaycount() {
        return paycount;
    }

    public void setPaycount(Integer paycount) {
        this.paycount = paycount;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", source=").append(source);
        sb.append(", count=").append(count);
        sb.append(", countuv=").append(countuv);
        sb.append(", nonecount=").append(nonecount);
        sb.append(", facecount=").append(facecount);
        sb.append(", percount=").append(percount);
        sb.append(", bankcount=").append(bankcount);
        sb.append(", concatcount=").append(concatcount);
        sb.append(", yuncount=").append(yuncount);
        sb.append(", paycount=").append(paycount);
        sb.append(", visitTime=").append(visitTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}