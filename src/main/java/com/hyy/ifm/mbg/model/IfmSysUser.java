package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class IfmSysUser implements Serializable {
    private Integer userid;

    @ApiModelProperty(value = "用户名")
    private String userName;

    private String orgId;

    @ApiModelProperty(value = "工号")
    private String jobNum;

    @ApiModelProperty(value = "性别")
    private String sex;

    private String degree;

    @ApiModelProperty(value = "身份证号")
    private String identityCard;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "公司邮箱")
    private String companyEmail;

    @ApiModelProperty(value = "私人邮箱")
    private String personalEmail;

    @ApiModelProperty(value = "住址")
    private String liveAddr;

    @ApiModelProperty(value = "创建时间")
    private Date creatDate;

    @ApiModelProperty(value = "登陆表的ID")
    private String lgnId;

    @ApiModelProperty(value = "4.离职")
    private String status;

    private Date onjobdate;

    @ApiModelProperty(value = "微信")
    private String weixin;

    @ApiModelProperty(value = "qq")
    private String qq;

    @ApiModelProperty(value = "部门")
    private String department;

    @ApiModelProperty(value = "渠道注册金额")
    private String cpa;

    @ApiModelProperty(value = "CPA类型  0:uv  1:注册")
    private Integer cpatype;

    @ApiModelProperty(value = "放款率")
    private String loanrate;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getLiveAddr() {
        return liveAddr;
    }

    public void setLiveAddr(String liveAddr) {
        this.liveAddr = liveAddr;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public String getLgnId() {
        return lgnId;
    }

    public void setLgnId(String lgnId) {
        this.lgnId = lgnId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOnjobdate() {
        return onjobdate;
    }

    public void setOnjobdate(Date onjobdate) {
        this.onjobdate = onjobdate;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCpa() {
        return cpa;
    }

    public void setCpa(String cpa) {
        this.cpa = cpa;
    }

    public Integer getCpatype() {
        return cpatype;
    }

    public void setCpatype(Integer cpatype) {
        this.cpatype = cpatype;
    }

    public String getLoanrate() {
        return loanrate;
    }

    public void setLoanrate(String loanrate) {
        this.loanrate = loanrate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", userName=").append(userName);
        sb.append(", orgId=").append(orgId);
        sb.append(", jobNum=").append(jobNum);
        sb.append(", sex=").append(sex);
        sb.append(", degree=").append(degree);
        sb.append(", identityCard=").append(identityCard);
        sb.append(", phone=").append(phone);
        sb.append(", companyEmail=").append(companyEmail);
        sb.append(", personalEmail=").append(personalEmail);
        sb.append(", liveAddr=").append(liveAddr);
        sb.append(", creatDate=").append(creatDate);
        sb.append(", lgnId=").append(lgnId);
        sb.append(", status=").append(status);
        sb.append(", onjobdate=").append(onjobdate);
        sb.append(", weixin=").append(weixin);
        sb.append(", qq=").append(qq);
        sb.append(", department=").append(department);
        sb.append(", cpa=").append(cpa);
        sb.append(", cpatype=").append(cpatype);
        sb.append(", loanrate=").append(loanrate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
