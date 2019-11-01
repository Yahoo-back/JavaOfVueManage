package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 输入查询参数
 * Created by macro on 2018/08/24.
 */
@Getter
@Setter
public class BusinessCustomerParam {
    @ApiModelProperty("商品名称")
    private String name_cnd;
    @ApiModelProperty("手机号")
    private String mobile_cnd;
    @ApiModelProperty("开始时间")
    private String create_time_FROM_cnd;
    @ApiModelProperty("结束时间")
    private String create_time_TO_cnd;

}
