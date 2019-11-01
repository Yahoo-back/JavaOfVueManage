package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DcVisitLog implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "类型, 0: 首页, 1: 注册页, 2: 注册量, 3:来源")
    private String classify;

    @ApiModelProperty(value = "访问时间, 精确到小时")
    private Date visitTime;

    @ApiModelProperty(value = "访问次数")
    private Integer count;

    @ApiModelProperty(value = "注册次数  Uv")
    private Integer countUv;

    @ApiModelProperty(value = "访问次数 Uv")
    private Integer uv;

    private String source;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCountUv() {
        return countUv;
    }

    public void setCountUv(Integer countUv) {
        this.countUv = countUv;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", classify=").append(classify);
        sb.append(", visitTime=").append(visitTime);
        sb.append(", count=").append(count);
        sb.append(", countUv=").append(countUv);
        sb.append(", uv=").append(uv);
        sb.append(", source=").append(source);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}