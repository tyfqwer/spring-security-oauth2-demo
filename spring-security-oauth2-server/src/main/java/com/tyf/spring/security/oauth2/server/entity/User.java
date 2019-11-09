package com.tyf.spring.security.oauth2.server.entity;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 用户表
    * </p>
*
* @author tyf
* @since 2019-11-09
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("tb_user")
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            /**
            * 用户名
            */
    private String username;

            /**
            * 密码，加密存储
            */
    private String password;

            /**
            * 注册手机号
            */
    private String phone;

            /**
            * 注册邮箱
            */
    private String email;

    private LocalDateTime created;

    private LocalDateTime updated;


}
