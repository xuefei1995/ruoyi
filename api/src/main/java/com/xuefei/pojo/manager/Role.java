package com.xuefei.pojo.manager;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * 角色表
 */
@Data
public class Role implements Serializable {
    /**
     * 主键ID
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    private static final long serialVersionUID = 1L;
}
