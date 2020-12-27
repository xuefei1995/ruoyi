package com.xuefei.dao;

import com.xuefei.pojo.manager.RolePermission;
import com.xuefei.pojo.manager.RolePermissionExample;
import org.springframework.stereotype.Repository;

/**
 * RolePermissionDao继承基类
 */
@Repository
public interface RolePermissionDao extends MyBatisBaseDao<RolePermission, Long, RolePermissionExample> {
}
