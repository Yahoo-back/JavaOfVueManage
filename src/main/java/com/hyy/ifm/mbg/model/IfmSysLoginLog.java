package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class IfmSysLoginLog implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String userCode;

    @ApiModelProperty(value = "登陆时间")
    private Date logindate;

    private String loginplace;

    private String status;

    @ApiModelProperty(value = "登陆IP")
    private String address;

    private String mac;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Date getLogindate() {
        return logindate;
    }

    public void setLogindate(Date logindate) {
        this.logindate = logindate;
    }

    public String getLoginplace() {
        return loginplace;
    }

    public void setLoginplace(String loginplace) {
        this.loginplace = loginplace;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userCode=").append(userCode);
        sb.append(", logindate=").append(logindate);
        sb.append(", loginplace=").append(loginplace);
        sb.append(", status=").append(status);
        sb.append(", address=").append(address);
        sb.append(", mac=").append(mac);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}