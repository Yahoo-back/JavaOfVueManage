package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 查看客户列表使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class CustomerParam {
    @ApiModelProperty("手机号")
    private String mobile_cnd;
    @ApiModelProperty("姓名")
    private String user_name_cnd;
    @ApiModelProperty("身份证号码")
    private String id_card_cnd;
    @ApiModelProperty("银行卡号")
    private String bank_card_cnd;
    @ApiModelProperty("认证状态")
    private String user_auth_cnd;
    @ApiModelProperty("状态")
    private String status_cnd;
    @ApiModelProperty("渠道")
    private String source_cnd;
    @ApiModelProperty("创建时间")
    private String create_time_FROM_cnd;
    @ApiModelProperty("创建时间")
    private String create_time_TO_cnd;
    @ApiModelProperty("创建时间")
    private String pay_time_FROM_cnd;
    @ApiModelProperty("创建时间")
    private String pay_time_TO_cnd;

}
