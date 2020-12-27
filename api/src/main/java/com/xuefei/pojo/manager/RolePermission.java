package com.xuefei.pojo.manager;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * 角色权限关联表
 */
@Data
public class RolePermission implements Serializable {
    /**
     * 主键ID
     */
    private Long rolePermissionId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID
     */
    private Long permissionId;

    private static final long serialVersionUID = 1L;
}
