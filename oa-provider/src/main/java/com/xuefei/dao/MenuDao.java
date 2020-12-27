package com.xuefei.dao;

import com.xuefei.pojo.manager.Menu;
import com.xuefei.pojo.manager.MenuExample;
import org.springframework.stereotype.Repository;

/**
 * MenuDao继承基类
 */
@Repository
public interface MenuDao extends MyBatisBaseDao<Menu, Long, MenuExample> {
}
