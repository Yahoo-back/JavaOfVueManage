package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 支付退款使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class PayRefundParam {
    @ApiModelProperty(value="ID", required = true)
    private Integer id;
    @ApiModelProperty(value="金额", required = true)
    private String money;
    @ApiModelProperty(value="状态", required = true)
    private String status;
    @ApiModelProperty(value="类型", required = true)
    private String type;
}
