package com.tyf.spring.security.oauth2.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringSecurityOauth2ServerApplication.class})// 指定启动类
public class DemoTest {

    @Test
    public void pass(){
        System.out.println(new BCryptPasswordEncoder().encode("123456"));

    }
}
