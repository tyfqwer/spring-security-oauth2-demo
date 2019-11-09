package com.tyf.spring.security.oauth2.resource.controller;


import com.tyf.spring.security.oauth2.resource.entity.Content;
import com.tyf.spring.security.oauth2.resource.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tyf
 * @since 2019-11-09
 */
@RestController
public class ContentController {

    @Autowired
    private IContentService iContentService;

    @GetMapping(value = "/view")
    public List<Content> getContentList(){
        return iContentService.list();
    }

}
