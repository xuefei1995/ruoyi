package com.xuefei.dao;

import com.xuefei.pojo.manager.Account;
import com.xuefei.pojo.manager.AccountExample;
import org.springframework.stereotype.Repository;

/**
 * AccountDao继承基类
 */
@Repository
public interface AccountDao extends MyBatisBaseDao<Account, Long, AccountExample> {
}
