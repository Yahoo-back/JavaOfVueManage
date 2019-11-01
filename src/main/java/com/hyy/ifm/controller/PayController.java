package com.hyy.ifm.controller;

import com.hyy.ifm.common.api.CommonResult;
import com.hyy.ifm.dto.PayRefundParam;
import com.hyy.ifm.service.PayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 支付管理
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "PayController", description = "支付管理")
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private PayService payService;

    @ApiOperation(value = "退款")
    @RequestMapping(value = "/thirdPay", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult thirdPay(PayRefundParam param) {
        return payService.thirdPay(param);
    }

}
