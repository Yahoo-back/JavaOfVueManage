package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 客诉模块-客户列表使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class RefundParam {
    @ApiModelProperty(value="手机号")
    private String mobile_cnd;
    @ApiModelProperty(value="身份证号")
    private String id_card_cnd;

}
