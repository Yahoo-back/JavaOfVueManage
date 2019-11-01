package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 点击来源数据统计图使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class DataSourceChartParam {
    @ApiModelProperty(value="商品名称", required = true)
    private String source;
    @ApiModelProperty(value="创建时间", required = true)
    private String daysFrom;
    @ApiModelProperty(value="创建时间", required = true)
    private String daysTo;

}
