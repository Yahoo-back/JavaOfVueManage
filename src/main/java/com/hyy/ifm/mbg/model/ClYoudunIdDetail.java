package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ClYoudunIdDetail implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "用户标识")
    private Long userId;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "出生日期")
    private String birthday;

    @ApiModelProperty(value = "住址")
    private String address;

    @ApiModelProperty(value = "曾用名")
    private String names;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "身份证掩码")
    private String idNumberMask;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "可信姓名")
    private String nameCredible;

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumberMask() {
        return idNumberMask;
    }

    public void setIdNumberMask(String idNumberMask) {
        this.idNumberMask = idNumberMask;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNameCredible() {
        return nameCredible;
    }

    public void setNameCredible(String nameCredible) {
        this.nameCredible = nameCredible;
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
        sb.append(", birthday=").append(birthday);
        sb.append(", address=").append(address);
        sb.append(", names=").append(names);
        sb.append(", gender=").append(gender);
        sb.append(", idNumberMask=").append(idNumberMask);
        sb.append(", nation=").append(nation);
        sb.append(", nameCredible=").append(nameCredible);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}