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
public class QudaoParam {
    @ApiModelProperty("姓名")
    private String userName;
    @ApiModelProperty("登录账号")
    private String userCode;
    @ApiModelProperty("CPA")
    private String cpa;
    @ApiModelProperty("CPA类型")
    private Integer cpaType;
    @ApiModelProperty("放款率")
    private String loanRate;
    @ApiModelProperty("id")
    private Integer id;

}
