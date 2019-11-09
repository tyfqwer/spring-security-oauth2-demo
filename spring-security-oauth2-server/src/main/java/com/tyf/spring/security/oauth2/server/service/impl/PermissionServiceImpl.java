package com.tyf.spring.security.oauth2.server.service.impl;

import com.tyf.spring.security.oauth2.server.entity.Permission;
import com.tyf.spring.security.oauth2.server.mapper.PermissionMapper;
import com.tyf.spring.security.oauth2.server.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author tyf
 * @since 2019-11-09
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
