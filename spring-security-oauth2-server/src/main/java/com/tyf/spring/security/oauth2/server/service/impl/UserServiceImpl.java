package com.tyf.spring.security.oauth2.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tyf.spring.security.oauth2.server.entity.User;
import com.tyf.spring.security.oauth2.server.mapper.UserMapper;
import com.tyf.spring.security.oauth2.server.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author tyf
 * @since 2019-11-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public User getByUsername(String userName) {
        return getOne(new QueryWrapper<User>().lambda().eq(User::getUsername,userName));
    }
}
