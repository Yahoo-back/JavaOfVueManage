package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DcProductVisitManage implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "产品ID或新闻id")
    private Integer productId;

    @ApiModelProperty(value = "访问次数")
    private Integer count;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "预付款")
    private String money;

    @ApiModelProperty(value = "0: 开启, 1:关闭，2失效")
    private String status;

    @ApiModelProperty(value = "预付款状态0: 未扣完, 1:已扣完")
    private String isMoney;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsMoney() {
        return isMoney;
    }

    public void setIsMoney(String isMoney) {
        this.isMoney = isMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", count=").append(count);
        sb.append(", createTime=").append(createTime);
        sb.append(", money=").append(money);
        sb.append(", status=").append(status);
        sb.append(", isMoney=").append(isMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}