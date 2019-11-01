package com.hyy.ifm.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class YoudunConfig implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "有盾公钥")
    private String pubKey;

    @ApiModelProperty(value = "有盾私钥")
    private String secretKey;

    @ApiModelProperty(value = "认证结果回调地址")
    private String callback;

    @ApiModelProperty(value = "可接受的最低识别分数")
    private String ocrScore;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getOcrScore() {
        return ocrScore;
    }

    public void setOcrScore(String ocrScore) {
        this.ocrScore = ocrScore;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pubKey=").append(pubKey);
        sb.append(", secretKey=").append(secretKey);
        sb.append(", callback=").append(callback);
        sb.append(", ocrScore=").append(ocrScore);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}