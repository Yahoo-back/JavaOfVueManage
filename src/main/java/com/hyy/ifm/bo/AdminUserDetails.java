package com.hyy.ifm.bo;

import com.hyy.ifm.mbg.model.IfmSysLogin;
import com.hyy.ifm.mbg.model.IfmSysMuen;
import com.hyy.ifm.mbg.model.IfmSysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 * Created by macro on 2018/4/26.
 */
public class AdminUserDetails implements UserDetails {
    private IfmSysLogin umsAdmin;
    private List<IfmSysMuen> IfmSysMuen;
    private IfmSysUser ifmSysUser;
    private String address;

    public AdminUserDetails(IfmSysLogin umsAdmin, List<IfmSysMuen> IfmSysMuen, IfmSysUser ifmSysUser, String address) {
        this.umsAdmin = umsAdmin;
        this.IfmSysMuen = IfmSysMuen;
        this.ifmSysUser = ifmSysUser;
        this.address = address;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return IfmSysMuen.stream()
                .filter(IfmSysMuen -> IfmSysMuen.getValue()!=null)
                .map(IfmSysMuen ->new SimpleGrantedAuthority(IfmSysMuen.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUserCode();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
//        return umsAdmin.getStatus().equals(1);
        return true;
    }

    public String getAddress() {
        return address;
    }

    public Integer getUserid() {
        return ifmSysUser.getUserid();
    }
}
