package com.niit.vhr1.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Auther:zhugq
 * @Date: 2020/04/22/10:51
 */
@Data
public class Hr implements UserDetails {
    //    hrID
    private Integer id;
    //姓名
    private String name;
    //手机号码
    private String phone;
    //住宅电话
    private String telephone;
    //联系地址
    private String address;

    private Boolean enabled;
    //用户名
    private String username;
    //密码
    private String password;

    private String userface;

    private String remark;

    private List<Role> roles;
    private static final long serialVersionUID = 1L;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>(roles.size());
        for (Role role:roles){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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
        return true;
    }
}