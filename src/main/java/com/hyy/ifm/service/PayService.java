package com.hyy.ifm.service;

import com.alibaba.fastjson.JSONObject;
import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.PayRefundParam;

/**
 * 支付Service
 * Created by macro on 2019/08/29.
 */
public interface PayService {
    /**
     * 退款
     */
    CommonResult thirdPay(PayRefundParam param);

    // 绑卡支付
    JSONObject xfBindCardPay(JSONObject param);
}
