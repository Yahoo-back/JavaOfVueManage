package com.hyy.ifm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * 权限管理-人员管理使用的参数
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class UserParam {
    @ApiModelProperty(value="姓名", required = true)
    private String userName;
    @ApiModelProperty(value="登录账号", required = true)
    private String userCode;
    @ApiModelProperty("性别")
    private String sex;
    @ApiModelProperty("学历")
    private String degree;
    @ApiModelProperty("用户id")
    private String id;
    @ApiModelProperty(value="身份证", required = true)
    private String identityCard;
    @ApiModelProperty("工号")
    private String jobNum;
    @ApiModelProperty(value="电话", required = true)
    private String phone;
    @ApiModelProperty("公司邮箱")
    private String companyEmail;
    @ApiModelProperty("个人邮箱")
    private String personalEmail;
    @ApiModelProperty("QQ")
    private String qq;
    @ApiModelProperty("微信")
    private String weixin;
    @ApiModelProperty("入职时间")
    private Date onjobDate;
    @ApiModelProperty("所属部门")
    private String department;
    @ApiModelProperty("家庭住址")
    private String liveAddr;

}
