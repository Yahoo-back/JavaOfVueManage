package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class IfmSysUserOperate implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "对应ifm_user的id")
    private Integer ifmUserId;

    @ApiModelProperty(value = "IP地址")
    private String address;

    @ApiModelProperty(value = "操作记录")
    private String operate;

    @ApiModelProperty(value = "操作时间")
    private Date operateDate;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIfmUserId() {
        return ifmUserId;
    }

    public void setIfmUserId(Integer ifmUserId) {
        this.ifmUserId = ifmUserId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
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
        sb.append(", ifmUserId=").append(ifmUserId);
        sb.append(", address=").append(address);
        sb.append(", operate=").append(operate);
        sb.append(", operateDate=").append(operateDate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}