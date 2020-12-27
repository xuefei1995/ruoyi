package com.xuefei.dao;

import com.xuefei.pojo.manager.Role;
import com.xuefei.pojo.manager.RoleExample;
import org.springframework.stereotype.Repository;

/**
 * RoleDao继承基类
 */
@Repository
public interface RoleDao extends MyBatisBaseDao<Role, Long, RoleExample> {
}
