package com.xuefei.pojo.manager;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * 菜单表
 */
@Data
public class Menu implements Serializable {
    /**
     * 主键ID
     */
    private Long menuId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单链接
     */
    private String uri;

    private static final long serialVersionUID = 1L;
}
