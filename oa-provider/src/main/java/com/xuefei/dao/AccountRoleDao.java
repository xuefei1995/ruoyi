package com.xuefei.dao;

import com.xuefei.pojo.manager.AccountRole;
import com.xuefei.pojo.manager.AccountRoleExample;
import org.springframework.stereotype.Repository;

/**
 * AccountRoleDao继承基类
 */
@Repository
public interface AccountRoleDao extends MyBatisBaseDao<AccountRole, Long, AccountRoleExample> {
}
