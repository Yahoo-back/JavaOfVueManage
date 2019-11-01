package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DcUserInfo implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "user_id")
    private Integer userId;

    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @ApiModelProperty(value = "性别， 0：男,1：女")
    private String sex;

    @ApiModelProperty(value = "职业")
    private String job;

    @ApiModelProperty(value = "芝麻分")
    private String zhimaScore;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "银行卡号")
    private String bankCard;

    @ApiModelProperty(value = "银行卡开户行")
    private String bankOpen;

    @ApiModelProperty(value = "运行商认证，0:认证, 1:未认证")
    private String mobileAuth;

    @ApiModelProperty(value = "身份证地址")
    private String cardAdd;

    @ApiModelProperty(value = "居住地地址")
    private String liveAdd;

    @ApiModelProperty(value = "认证状态  1.活体 2.借款信息 3.联系人 4.银行卡")
    private String userAuth;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getZhimaScore() {
        return zhimaScore;
    }

    public void setZhimaScore(String zhimaScore) {
        this.zhimaScore = zhimaScore;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getBankOpen() {
        return bankOpen;
    }

    public void setBankOpen(String bankOpen) {
        this.bankOpen = bankOpen;
    }

    public String getMobileAuth() {
        return mobileAuth;
    }

    public void setMobileAuth(String mobileAuth) {
        this.mobileAuth = mobileAuth;
    }

    public String getCardAdd() {
        return cardAdd;
    }

    public void setCardAdd(String cardAdd) {
        this.cardAdd = cardAdd;
    }

    public String getLiveAdd() {
        return liveAdd;
    }

    public void setLiveAdd(String liveAdd) {
        this.liveAdd = liveAdd;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", sex=").append(sex);
        sb.append(", job=").append(job);
        sb.append(", zhimaScore=").append(zhimaScore);
        sb.append(", idCard=").append(idCard);
        sb.append(", bankCard=").append(bankCard);
        sb.append(", bankOpen=").append(bankOpen);
        sb.append(", mobileAuth=").append(mobileAuth);
        sb.append(", cardAdd=").append(cardAdd);
        sb.append(", liveAdd=").append(liveAdd);
        sb.append(", userAuth=").append(userAuth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}