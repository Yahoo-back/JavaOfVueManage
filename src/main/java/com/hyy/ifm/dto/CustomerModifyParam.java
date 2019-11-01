package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 查看修改客户列表使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class CustomerModifyParam {
    @ApiModelProperty(value="ID", required = true)
    private Integer id;
    @ApiModelProperty(value="姓名", required = true)
    private String user_name;
    @ApiModelProperty(value="身份证号码", required = true)
    private String id_card;

}
