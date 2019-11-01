package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class IfmSysMuen implements Serializable {
    private Integer muenid;

    @ApiModelProperty(value = "菜单名称")
    private String muenName;

    @ApiModelProperty(value = "权限值")
    private String value;

    @ApiModelProperty(value = "父菜单ID")
    private String parentMuenId;

    private Integer xh;

    @ApiModelProperty(value = "链接")
    private String uri;

    private String buttons;

    private String status;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    private static final long serialVersionUID = 1L;

    public Integer getMuenid() {
        return muenid;
    }

    public void setMuenid(Integer muenid) {
        this.muenid = muenid;
    }

    public String getMuenName() {
        return muenName;
    }

    public void setMuenName(String muenName) {
        this.muenName = muenName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getParentMuenId() {
        return parentMuenId;
    }

    public void setParentMuenId(String parentMuenId) {
        this.parentMuenId = parentMuenId;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getButtons() {
        return buttons;
    }

    public void setButtons(String buttons) {
        this.buttons = buttons;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", muenid=").append(muenid);
        sb.append(", muenName=").append(muenName);
        sb.append(", value=").append(value);
        sb.append(", parentMuenId=").append(parentMuenId);
        sb.append(", xh=").append(xh);
        sb.append(", uri=").append(uri);
        sb.append(", buttons=").append(buttons);
        sb.append(", status=").append(status);
        sb.append(", icon=").append(icon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}