package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 查看业务配置使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class DcDictParam{
    @ApiModelProperty("data_type字段")
    private String data_type;
    @ApiModelProperty(value="查询时的data_type字段", required = true)
    private String data_type_cnd;
    @ApiModelProperty("价格区间")
    private String item_value_cnd;
    @ApiModelProperty("是否使用")
    private String is_use_cnd;
}
