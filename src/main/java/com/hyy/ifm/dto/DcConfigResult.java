package com.hyy.ifm.dto;

import com.hyy.ifm.mbg.model.DcConfig;
import lombok.Getter;
import lombok.Setter;

public class DcConfigResult extends DcConfig {
    @Getter
    @Setter
    private String associate_name;
}
