package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 查看商品列表使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class DcProductParam {
    @ApiModelProperty("是否是首页热门")
    private String is_hot_cnd;
    @ApiModelProperty("商品名称")
    private String name_cnd;
    @ApiModelProperty("分类")
    private String classify_cnd;
    @ApiModelProperty("位置")
    private String position_cnd;
    @ApiModelProperty("状态")
    private String status_cnd;
    @ApiModelProperty("创建时间")
    private String create_time_FROM_cnd;
    @ApiModelProperty("创建时间")
    private String create_time_TO_cnd;
}
