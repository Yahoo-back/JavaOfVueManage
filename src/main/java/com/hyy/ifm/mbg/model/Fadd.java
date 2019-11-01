package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Fadd implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "user_id")
    private Integer userId;

    @ApiModelProperty(value = "法大大返回的客户编号")
    private String customerNo;

    @ApiModelProperty(value = "法大大返回的实名认证流水号")
    private String rnaNo;

    @ApiModelProperty(value = "法大大返回的签章图片Id")
    private String picId;

    @ApiModelProperty(value = "合同编号1")
    private String htNo1;

    @ApiModelProperty(value = "合同编号2")
    private String htNo2;

    @ApiModelProperty(value = "合同编号3")
    private String htNo3;

    @ApiModelProperty(value = "手动签署交易号1")
    private String reqNo1;

    @ApiModelProperty(value = "手动签署交易号2")
    private String reqNo2;

    @ApiModelProperty(value = "手动签署交易号3")
    private String reqNo3;

    @ApiModelProperty(value = "申请时间")
    private Date creatTime;

    @ApiModelProperty(value = "响应时间")
    private Date endTime;

    @ApiModelProperty(value = "委托划付还款服务协议")
    private String type1;

    @ApiModelProperty(value = "授权扣款服务协议")
    private String type2;

    @ApiModelProperty(value = "评估及推荐服务协议")
    private String type3;

    @ApiModelProperty(value = "自定义印章上传")
    private String remark;

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

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getRnaNo() {
        return rnaNo;
    }

    public void setRnaNo(String rnaNo) {
        this.rnaNo = rnaNo;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getHtNo1() {
        return htNo1;
    }

    public void setHtNo1(String htNo1) {
        this.htNo1 = htNo1;
    }

    public String getHtNo2() {
        return htNo2;
    }

    public void setHtNo2(String htNo2) {
        this.htNo2 = htNo2;
    }

    public String getHtNo3() {
        return htNo3;
    }

    public void setHtNo3(String htNo3) {
        this.htNo3 = htNo3;
    }

    public String getReqNo1() {
        return reqNo1;
    }

    public void setReqNo1(String reqNo1) {
        this.reqNo1 = reqNo1;
    }

    public String getReqNo2() {
        return reqNo2;
    }

    public void setReqNo2(String reqNo2) {
        this.reqNo2 = reqNo2;
    }

    public String getReqNo3() {
        return reqNo3;
    }

    public void setReqNo3(String reqNo3) {
        this.reqNo3 = reqNo3;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3;
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
        sb.append(", userId=").append(userId);
        sb.append(", customerNo=").append(customerNo);
        sb.append(", rnaNo=").append(rnaNo);
        sb.append(", picId=").append(picId);
        sb.append(", htNo1=").append(htNo1);
        sb.append(", htNo2=").append(htNo2);
        sb.append(", htNo3=").append(htNo3);
        sb.append(", reqNo1=").append(reqNo1);
        sb.append(", reqNo2=").append(reqNo2);
        sb.append(", reqNo3=").append(reqNo3);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", type1=").append(type1);
        sb.append(", type2=").append(type2);
        sb.append(", type3=").append(type3);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}