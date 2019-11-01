package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class BankDict implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "数据类型")
    private String dataType;

    @ApiModelProperty(value = "相同数据类型中某一数据的唯一标识")
    private String itemKey;

    @ApiModelProperty(value = "数据值")
    private String itemValue;

    @ApiModelProperty(value = "序号")
    private String xh;

    @ApiModelProperty(value = "外部数据")
    private String outDataFrom;

    @ApiModelProperty(value = "父类ID")
    private Integer parentId;

    @ApiModelProperty(value = "字段描述")
    private String dictDesc;

    @ApiModelProperty(value = "是否可见")
    private String isView;

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

    public String getIsView() {
        return isView;
    }

    public void setIsView(String isView) {
        this.isView = isView;
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
        sb.append(", outDataFrom=").append(outDataFrom);
        sb.append(", parentId=").append(parentId);
        sb.append(", dictDesc=").append(dictDesc);
        sb.append(", isView=").append(isView);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}