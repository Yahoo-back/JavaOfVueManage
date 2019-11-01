package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class DcProduct implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "产品名称")
    private String name;

    @ApiModelProperty(value = "产品图标")
    private String logo;

    @ApiModelProperty(value = "分类表id")
    private Integer classifyId;

    @ApiModelProperty(value = "利息")
    private String interest;

    @ApiModelProperty(value = "费用说明，无实质性作用，展示给客户看的说明")
    private String ktxDesc;

    @ApiModelProperty(value = "价格区间id")
    private String money;

    @ApiModelProperty(value = "产品链接")
    private String link;

    @ApiModelProperty(value = "结算方式, 手动填写")
    private String settleWay;

    @ApiModelProperty(value = "分期方式 0：按天 ，1 ：按月")
    private String perioWay;

    @ApiModelProperty(value = "分期期数，天就是0到31  月：1到12")
    private String periodization;

    @ApiModelProperty(value = "申请条件id集合 ，以逗号隔开")
    private String conditionList;

    @ApiModelProperty(value = "申请资料id集合，以逗号隔开")
    private String dataList;

    @ApiModelProperty(value = "产品联系人")
    private String contact;

    @ApiModelProperty(value = "产品联系人的联系方式")
    private String contactInfo;

    @ApiModelProperty(value = "后台链接")
    private String managerUrl;

    @ApiModelProperty(value = "后台登陆用户名")
    private String managerUser;

    @ApiModelProperty(value = "后台登陆用户密码")
    private String managerPassword;

    @ApiModelProperty(value = "所属公司")
    private String company;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "商品状态, 0: 下架, 1: 上架, 2: 删除")
    private String status;

    @ApiModelProperty(value = "是否首页, 0: 不是, 1: 是")
    private String isHot;

    @ApiModelProperty(value = "热门排序")
    private String hotSort;

    @ApiModelProperty(value = "排序, 越小越靠前")
    private Integer sort;

    @ApiModelProperty(value = "申请人数")
    private String applyNum;

    @ApiModelProperty(value = "0: 默认, 1: 置顶, 根据sort和创建时间排序, 2: 置底, sort为总记录+1")
    private String position;

    private String settleCycle;

    private String settleWayCpa;

    private String settleWayCps;

    @ApiModelProperty(value = "描述")
    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getKtxDesc() {
        return ktxDesc;
    }

    public void setKtxDesc(String ktxDesc) {
        this.ktxDesc = ktxDesc;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSettleWay() {
        return settleWay;
    }

    public void setSettleWay(String settleWay) {
        this.settleWay = settleWay;
    }

    public String getPerioWay() {
        return perioWay;
    }

    public void setPerioWay(String perioWay) {
        this.perioWay = perioWay;
    }

    public String getPeriodization() {
        return periodization;
    }

    public void setPeriodization(String periodization) {
        this.periodization = periodization;
    }

    public String getConditionList() {
        return conditionList;
    }

    public void setConditionList(String conditionList) {
        this.conditionList = conditionList;
    }

    public String getDataList() {
        return dataList;
    }

    public void setDataList(String dataList) {
        this.dataList = dataList;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getManagerUrl() {
        return managerUrl;
    }

    public void setManagerUrl(String managerUrl) {
        this.managerUrl = managerUrl;
    }

    public String getManagerUser() {
        return managerUser;
    }

    public void setManagerUser(String managerUser) {
        this.managerUser = managerUser;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    public String getHotSort() {
        return hotSort;
    }

    public void setHotSort(String hotSort) {
        this.hotSort = hotSort;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(String applyNum) {
        this.applyNum = applyNum;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSettleCycle() {
        return settleCycle;
    }

    public void setSettleCycle(String settleCycle) {
        this.settleCycle = settleCycle;
    }

    public String getSettleWayCpa() {
        return settleWayCpa;
    }

    public void setSettleWayCpa(String settleWayCpa) {
        this.settleWayCpa = settleWayCpa;
    }

    public String getSettleWayCps() {
        return settleWayCps;
    }

    public void setSettleWayCps(String settleWayCps) {
        this.settleWayCps = settleWayCps;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", logo=").append(logo);
        sb.append(", classifyId=").append(classifyId);
        sb.append(", interest=").append(interest);
        sb.append(", ktxDesc=").append(ktxDesc);
        sb.append(", money=").append(money);
        sb.append(", link=").append(link);
        sb.append(", settleWay=").append(settleWay);
        sb.append(", perioWay=").append(perioWay);
        sb.append(", periodization=").append(periodization);
        sb.append(", conditionList=").append(conditionList);
        sb.append(", dataList=").append(dataList);
        sb.append(", contact=").append(contact);
        sb.append(", contactInfo=").append(contactInfo);
        sb.append(", managerUrl=").append(managerUrl);
        sb.append(", managerUser=").append(managerUser);
        sb.append(", managerPassword=").append(managerPassword);
        sb.append(", company=").append(company);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", isHot=").append(isHot);
        sb.append(", hotSort=").append(hotSort);
        sb.append(", sort=").append(sort);
        sb.append(", applyNum=").append(applyNum);
        sb.append(", position=").append(position);
        sb.append(", settleCycle=").append(settleCycle);
        sb.append(", settleWayCpa=").append(settleWayCpa);
        sb.append(", settleWayCps=").append(settleWayCps);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}