package com.hyy.ifm.dto;

import com.hyy.ifm.mbg.model.DcProduct;
import lombok.Getter;
import lombok.Setter;

public class DcProductResult extends DcProduct {
    @Getter
    @Setter
    private String classify;
}
