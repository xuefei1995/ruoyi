package com.xuefei.pojo.manager;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * 权限表
 */
@Data
public class Permission implements Serializable {
    /**
     * 主键ID
     */
    private Long permissionId;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 菜单链接
     */
    private String uri;

    /**
     * 新增 0-否 1-是
     */
    private Boolean c;

    /**
     * 查询 0-否 1-是
     */
    private Boolean r;

    /**
     * 更新 0-否 1-是
     */
    private Boolean u;

    /**
     * 删除 0-否 1-是
     */
    private Boolean d;

    private static final long serialVersionUID = 1L;
}
