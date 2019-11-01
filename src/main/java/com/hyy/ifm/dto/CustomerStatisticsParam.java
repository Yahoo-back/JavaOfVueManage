package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 客诉模块-保存退款使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class CustomerStatisticsParam {
    @ApiModelProperty(value="开始时间", required = true)
    private String visit_time_FROM_cnd;
    @ApiModelProperty(value="结束时间", required = true)
    private String visit_time_TO_cnd;
    @ApiModelProperty(value="姓名")
    private String user_name_cnd;
}
