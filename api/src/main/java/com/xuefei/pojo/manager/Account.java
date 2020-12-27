package com.xuefei.pojo.manager;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 * 账户表
 */
@Data
public class Account implements Serializable {
    /**
     * 主键ID
     */
    private Long accountId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 头像路径
     */
    private String imagePath;

    private static final long serialVersionUID = 1L;
}
