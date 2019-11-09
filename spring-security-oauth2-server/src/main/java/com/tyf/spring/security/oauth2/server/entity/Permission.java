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
    * 权限表
    * </p>
*
* @author tyf
* @since 2019-11-09
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("tb_permission")
    public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

            /**
            * 父权限
            */
    private Long parentId;

            /**
            * 权限名称
            */
    private String name;

            /**
            * 权限英文名称
            */
    private String enname;

            /**
            * 授权路径
            */
    private String url;

            /**
            * 备注
            */
    private String description;

    private LocalDateTime created;

    private LocalDateTime updated;


}
