package com.tyf.spring.security.oauth2.server.mapper;

import com.tyf.spring.security.oauth2.server.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author tyf
 * @since 2019-11-09
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    List<Permission> selectPermissonByUserId(@Param("userId") Long userId);

}
