package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AppYoudunResult implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "user_detail的uuid")
    private Integer userId;

    private String partnerOrderId;

    private String idNumber;

    private String address;

    private String verifyStatus;

    private String similarity;

    private String authResult;

    private String failReason;

    private Date createDate;

    private String status;

    private String idcardFrontPhoto;

    private String idcardBackPhoto;

    private String livingPhoto;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    public void setPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getSimilarity() {
        return similarity;
    }

    public void setSimilarity(String similarity) {
        this.similarity = similarity;
    }

    public String getAuthResult() {
        return authResult;
    }

    public void setAuthResult(String authResult) {
        this.authResult = authResult;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdcardFrontPhoto() {
        return idcardFrontPhoto;
    }

    public void setIdcardFrontPhoto(String idcardFrontPhoto) {
        this.idcardFrontPhoto = idcardFrontPhoto;
    }

    public String getIdcardBackPhoto() {
        return idcardBackPhoto;
    }

    public void setIdcardBackPhoto(String idcardBackPhoto) {
        this.idcardBackPhoto = idcardBackPhoto;
    }

    public String getLivingPhoto() {
        return livingPhoto;
    }

    public void setLivingPhoto(String livingPhoto) {
        this.livingPhoto = livingPhoto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", partnerOrderId=").append(partnerOrderId);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", address=").append(address);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", similarity=").append(similarity);
        sb.append(", authResult=").append(authResult);
        sb.append(", failReason=").append(failReason);
        sb.append(", createDate=").append(createDate);
        sb.append(", status=").append(status);
        sb.append(", idcardFrontPhoto=").append(idcardFrontPhoto);
        sb.append(", idcardBackPhoto=").append(idcardBackPhoto);
        sb.append(", livingPhoto=").append(livingPhoto);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}