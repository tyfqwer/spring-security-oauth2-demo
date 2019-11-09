package com.tyf.spring.security.oauth2.resource.service.impl;

import com.tyf.spring.security.oauth2.resource.entity.Content;
import com.tyf.spring.security.oauth2.resource.mapper.ContentMapper;
import com.tyf.spring.security.oauth2.resource.service.IContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tyf
 * @since 2019-11-09
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

}
