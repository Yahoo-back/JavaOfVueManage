package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * 用戶管理列表使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class UserManageParam {
    @ApiModelProperty("登录账号")
    private String user_code_cnd;
    @ApiModelProperty("身份证")
    private String identity_card_cnd;
    @ApiModelProperty("渠道名")
    private String user_name_cnd;
    @ApiModelProperty("性别")
    private String sex_cnd;
    @ApiModelProperty("状态")
    private String status_cnd;
}
