package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DcDict implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "类型")
    private String dataType;

    @ApiModelProperty(value = "key")
    private String itemKey;

    @ApiModelProperty(value = "value")
    private String itemValue;

    @ApiModelProperty(value = "排序")
    private String xh;

    @ApiModelProperty(value = "0: 未启用, 1: 启用")
    private String isUse;

    @ApiModelProperty(value = "关联外键或其他")
    private String outDataFrom;

    @ApiModelProperty(value = "父类id")
    private Integer parentId;

    @ApiModelProperty(value = "描述")
    private String dictDesc;

    @ApiModelProperty(value = "1.展示  2.不展示")
    private String showese;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getIsUse() {
        return isUse;
    }

    public void setIsUse(String isUse) {
        this.isUse = isUse;
    }

    public String getOutDataFrom() {
        return outDataFrom;
    }

    public void setOutDataFrom(String outDataFrom) {
        this.outDataFrom = outDataFrom;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getDictDesc() {
        return dictDesc;
    }

    public void setDictDesc(String dictDesc) {
        this.dictDesc = dictDesc;
    }

    public String getShowese() {
        return showese;
    }

    public void setShowese(String showese) {
        this.showese = showese;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dataType=").append(dataType);
        sb.append(", itemKey=").append(itemKey);
        sb.append(", itemValue=").append(itemValue);
        sb.append(", xh=").append(xh);
        sb.append(", isUse=").append(isUse);
        sb.append(", outDataFrom=").append(outDataFrom);
        sb.append(", parentId=").append(parentId);
        sb.append(", dictDesc=").append(dictDesc);
        sb.append(", showese=").append(showese);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}