package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 财务统计使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class DataReportParam {
    @ApiModelProperty(value="来源", required = true)
    private String source_cnd;
    @ApiModelProperty(value="创建时间", required = true)
    private String visit_time_FROM_cnd;
    @ApiModelProperty(value="创建时间", required = true)
    private String visit_time_TO_cnd;

}
