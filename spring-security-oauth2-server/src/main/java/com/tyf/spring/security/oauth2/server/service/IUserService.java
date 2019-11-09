package com.tyf.spring.security.oauth2.server.service;

import com.tyf.spring.security.oauth2.server.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author tyf
 * @since 2019-11-09
 */
public interface IUserService extends IService<User> {
    /**
     *  根据用户名查询用户
     * @param userName
     * @return
     */
    public User getByUsername(String userName);
}
