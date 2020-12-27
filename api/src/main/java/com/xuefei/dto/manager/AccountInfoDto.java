package com.xuefei.dto.manager;

import com.xuefei.pojo.manager.Permission;
import com.xuefei.pojo.manager.Role;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class AccountInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 账户ID
     */
    private Long accountId;

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    private String userName;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    @Size(max = 8, message = "密码长度不能超过八位")
    private String password;

    /**
     * 邮箱
     */
    @NotBlank(message = "邮箱不能为空")
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$", message = "邮箱格式错误")
    private String email;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 头像路径
     */
    private String imagePath;

    /**
     * 包含角色
     */
    @NotEmpty(message = "必须指定角色")
    private List<Role> roles;

    /**
     * 包含权限
     */
    private List<Permission> permissions;
}
