package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 客诉模块-保存退款使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class RefundSaveParam {
    @ApiModelProperty(value="用户ID", required = true)
    private Integer id;
    @ApiModelProperty(value="图片地址", required = true)
    private String file_url;
    @ApiModelProperty(value="退款金额")
    private String money;

}
