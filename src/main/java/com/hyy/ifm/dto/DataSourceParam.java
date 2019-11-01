package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 点击来源数据统计使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class DataSourceParam {
    @ApiModelProperty("来源")
    private String source_cnd;
    @ApiModelProperty("创建时间")
    private String visit_time_FROM_cnd;
    @ApiModelProperty("创建时间")
    private String visit_time_TO_cnd;

}
