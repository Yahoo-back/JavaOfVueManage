package com.hyy.ifm.common.utils;

import com.hyy.ifm.bo.AdminUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by sang on 2019/08/30.
 */
public class UserUtils {
    public static AdminUserDetails getCurrentHr() {
        return (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
