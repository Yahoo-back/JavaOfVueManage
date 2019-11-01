package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 客诉模块-邮寄退款使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class RefundMailParam {
    @ApiModelProperty(value="手机号")
    private String mobile_cnd;
    @ApiModelProperty(value="身份证号")
    private String id_card_cnd;
    @ApiModelProperty(value="银行卡号")
    private String bank_card_cnd;
    @ApiModelProperty(value="订单号")
    private String request_no_cnd;
}
