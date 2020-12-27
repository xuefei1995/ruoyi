package com.xuefei.dao;

import com.xuefei.pojo.manager.Permission;
import com.xuefei.pojo.manager.PermissionExample;
import org.springframework.stereotype.Repository;

/**
 * PermissionDao继承基类
 */
@Repository
public interface PermissionDao extends MyBatisBaseDao<Permission, Long, PermissionExample> {
}
