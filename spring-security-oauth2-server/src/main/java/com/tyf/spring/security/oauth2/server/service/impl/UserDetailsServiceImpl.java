package com.tyf.spring.security.oauth2.server.service.impl;

import com.tyf.spring.security.oauth2.server.entity.Permission;
import com.tyf.spring.security.oauth2.server.entity.User;
import com.tyf.spring.security.oauth2.server.mapper.PermissionMapper;
import com.tyf.spring.security.oauth2.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义用户认证与授权
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getByUsername(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if(user != null){
            // 获取用户授权
            List<Permission> permissions = permissionMapper.selectPermissonByUserId(user.getId());

            // 声明用户授权
            permissions.forEach(tbPermission -> {
                if (tbPermission != null && tbPermission.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
            // 由框架完成认证工作
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
        }
        return null;
    }
}
