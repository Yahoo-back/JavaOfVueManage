package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UserBankcard implements Serializable {
    private Integer id;

    private Integer userId;

    @ApiModelProperty(value = "卡号")
    private String cardNo;

    @ApiModelProperty(value = "银行编号")
    private String bankCode;

    @ApiModelProperty(value = "前六位")
    private String cardTop;

    @ApiModelProperty(value = "卡号后四位")
    private String cardLast;

    @ApiModelProperty(value = "绑卡请求")
    private String requestNo;

    @ApiModelProperty(value = "是否鉴权成功, 0: 验证中, 1: 成功")
    private String isAuth;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "绑定成功时间")
    private Date bindTime;

    @ApiModelProperty(value = "鉴权方: 1:快钱 2.畅捷 3.合力宝")
    private String authFrom;

    @ApiModelProperty(value = "备注, 留用")
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCardTop() {
        return cardTop;
    }

    public void setCardTop(String cardTop) {
        this.cardTop = cardTop;
    }

    public String getCardLast() {
        return cardLast;
    }

    public void setCardLast(String cardLast) {
        this.cardLast = cardLast;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(String isAuth) {
        this.isAuth = isAuth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    public String getAuthFrom() {
        return authFrom;
    }

    public void setAuthFrom(String authFrom) {
        this.authFrom = authFrom;
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
        sb.append(", cardNo=").append(cardNo);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", cardTop=").append(cardTop);
        sb.append(", cardLast=").append(cardLast);
        sb.append(", requestNo=").append(requestNo);
        sb.append(", isAuth=").append(isAuth);
        sb.append(", createTime=").append(createTime);
        sb.append(", bindTime=").append(bindTime);
        sb.append(", authFrom=").append(authFrom);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}