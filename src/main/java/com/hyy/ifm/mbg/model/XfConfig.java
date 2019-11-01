package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class XfConfig implements Serializable {

    private Integer id;

    @ApiModelProperty(value = "接口地址")
    private String url;

    @ApiModelProperty(value = "商户编号")
    private String mchntcd;

    @ApiModelProperty(value = "商户密码")
    private String password;

    @ApiModelProperty(value = "终端编号")
    private String terminalid;

    @ApiModelProperty(value = "商户密钥")
    private String securityKey;

    @ApiModelProperty(value = "用户私钥")
    private String privateKey;

    @ApiModelProperty(value = "讯付公钥")
    private String pubKey;

    @ApiModelProperty(value = "回调地址")
    private String callbackUrl;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMchntcd() {
        return mchntcd;
    }

    public void setMchntcd(String mchntcd) {
        this.mchntcd = mchntcd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(String terminalid) {
        this.terminalid = terminalid;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
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
        sb.append(", url=").append(url);
        sb.append(", mchntcd=").append(mchntcd);
        sb.append(", password=").append(password);
        sb.append(", terminalid=").append(terminalid);
        sb.append(", securityKey=").append(securityKey);
        sb.append(", privateKey=").append(privateKey);
        sb.append(", pubKey=").append(pubKey);
        sb.append(", callbackUrl=").append(callbackUrl);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
