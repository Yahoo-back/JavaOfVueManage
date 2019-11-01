package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 查看客户支付列表使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class CustomerPayParam {
    @ApiModelProperty("渠道名")
    private String name_cnd;

}
