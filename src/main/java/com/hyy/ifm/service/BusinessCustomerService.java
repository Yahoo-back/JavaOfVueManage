package com.hyy.ifm.service;


import com.hyy.ifm.dto.BusinessCustomerParam;
import com.hyy.ifm.mbg.model.DcInterestCustomer;

import java.util.List;

public interface BusinessCustomerService {

    /**
     * 商务合作列表
     */
    List<DcInterestCustomer> qryBusinessCustomerList(BusinessCustomerParam businessCustomerParam, Integer pageSize, Integer pageNum);

    /**
     * 导出
     */
    List<DcInterestCustomer> exportBusinessCustomerList(BusinessCustomerParam businessCustomerParam);

}
