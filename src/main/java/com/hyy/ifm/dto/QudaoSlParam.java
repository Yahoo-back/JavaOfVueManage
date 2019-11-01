package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 渠道商的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class QudaoSlParam {
    @ApiModelProperty("渠道名")
    private String userName;
    @ApiModelProperty("渠道账号")
    private String userCode;
    @ApiModelProperty("渠道缩量百分比")
    private String sl;
    @ApiModelProperty("渠道缩量需改时间")
    private String updateTime;
    @ApiModelProperty("id")
    private Integer id;

}
