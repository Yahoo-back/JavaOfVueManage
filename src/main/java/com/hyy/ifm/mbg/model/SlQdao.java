package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SlQdao implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "渠道名")
    private String source;

    @ApiModelProperty(value = "渠道id")
    private Integer loginId;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "展示多少")
    private Double sl;

    @ApiModelProperty(value = "uv点击注册数")
    private Double uvCount;

    @ApiModelProperty(value = "注册数")
    private Double countCount;

    @ApiModelProperty(value = "uv点击数")
    private Double uv;

    private String remark;

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

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Double getSl() {
        return sl;
    }

    public void setSl(Double sl) {
        this.sl = sl;
    }

    public Double getUvCount() {
        return uvCount;
    }

    public void setUvCount(Double uvCount) {
        this.uvCount = uvCount;
    }

    public Double getCountCount() {
        return countCount;
    }

    public void setCountCount(Double countCount) {
        this.countCount = countCount;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
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
        sb.append(", source=").append(source);
        sb.append(", loginId=").append(loginId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", sl=").append(sl);
        sb.append(", uvCount=").append(uvCount);
        sb.append(", countCount=").append(countCount);
        sb.append(", uv=").append(uv);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}