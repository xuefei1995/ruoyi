package com.xuefei.pojo.manager;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * 账户角色关联表
 */
@Data
public class AccountRole implements Serializable {
    /**
     * 主键ID
     */
    private Long accountRoleId;

    /**
     * 账户ID
     */
    private Long accountId;

    /**
     * 角色ID
     */
    private Long roleId;

    private static final long serialVersionUID = 1L;
}
