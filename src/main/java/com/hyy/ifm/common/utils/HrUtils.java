package com.hyy.ifm.common.utils;

import com.hyy.ifm.bo.AdminUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by sang on 2017/12/30.
 */
public class HrUtils {
    public static AdminUserDetails getCurrentHr() {
        return (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
