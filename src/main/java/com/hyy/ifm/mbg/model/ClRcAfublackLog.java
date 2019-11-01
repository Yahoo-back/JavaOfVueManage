package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ClRcAfublackLog implements Serializable {
    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "用户编号")
    private Long userId;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "返回的流水号")
    private String flowid;

    @ApiModelProperty(value = "欺诈分     0:未命中 ")
    private String fraudscore;

    @ApiModelProperty(value = "欺诈等级")
    private String fraudlevel;

    @ApiModelProperty(value = "响应码")
    private String code;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "风险名单结果集")
    private String riskresult;

    @ApiModelProperty(value = "社会关系网")
    private String socialnetwork;

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

    public String getFlowid() {
        return flowid;
    }

    public void setFlowid(String flowid) {
        this.flowid = flowid;
    }

    public String getFraudscore() {
        return fraudscore;
    }

    public void setFraudscore(String fraudscore) {
        this.fraudscore = fraudscore;
    }

    public String getFraudlevel() {
        return fraudlevel;
    }

    public void setFraudlevel(String fraudlevel) {
        this.fraudlevel = fraudlevel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRiskresult() {
        return riskresult;
    }

    public void setRiskresult(String riskresult) {
        this.riskresult = riskresult;
    }

    public String getSocialnetwork() {
        return socialnetwork;
    }

    public void setSocialnetwork(String socialnetwork) {
        this.socialnetwork = socialnetwork;
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
        sb.append(", flowid=").append(flowid);
        sb.append(", fraudscore=").append(fraudscore);
        sb.append(", fraudlevel=").append(fraudlevel);
        sb.append(", code=").append(code);
        sb.append(", createTime=").append(createTime);
        sb.append(", riskresult=").append(riskresult);
        sb.append(", socialnetwork=").append(socialnetwork);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}