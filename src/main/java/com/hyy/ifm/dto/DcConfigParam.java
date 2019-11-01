package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 查看推广配置使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class DcConfigParam {
    @ApiModelProperty("名称")
    private String name_cnd;
    @ApiModelProperty("链接")
    private String url_cnd;
    @ApiModelProperty("位置")
    private String position_cnd;
    @ApiModelProperty("状态")
    private String status_cnd;
    @ApiModelProperty("开始时间")
    private String start_time_FROM_cnd;
    @ApiModelProperty("开始时间")
    private String start_time_TO_cnd;
    @ApiModelProperty("结束时间")
    private String end_time_FROM_cnd;
    @ApiModelProperty("结束时间")
    private String end_time_TO_cnd;

}
