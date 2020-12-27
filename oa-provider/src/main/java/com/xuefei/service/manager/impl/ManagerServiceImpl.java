package com.xuefei.service.manager.impl;

import com.github.pagehelper.PageHelper;
import com.xuefei.dao.*;
import com.xuefei.dto.manager.AccountInfoDto;
import com.xuefei.pojo.manager.*;
import com.xuefei.service.manager.IManagerService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@DubboService(version = "1.0.0", timeout = 500, interfaceClass = IManagerService.class,
        loadbalance = "roundrobin", retries = 1) //retries重试次数（不包括第一次调用），幂等的情况下用数据才不会有问题
public class ManagerServiceImpl implements IManagerService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private AccountRoleDao accountRoleDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PermissionDao permissionDao;

    @Autowired
    private RolePermissionDao rolePermissionDao;


    @Override
    public List<AccountInfoDto> accountInfoList(Integer pageNum, Integer pageSize) {

        List<AccountInfoDto> list = new ArrayList<>();

        //分页
        PageHelper.startPage(pageNum, pageSize);

        //查询所有账户
        List<Account> accounts = accountDao.selectByExample(new AccountExample());

        List<AccountRole> accountRoles = accountRoleDao.selectByExample(new AccountRoleExample());
        Map<Long, List<AccountRole>> accountRoleMap = accountRoles.stream().collect(Collectors.groupingBy(AccountRole::getAccountId));

        //查询所有角色
        List<Role> roles = roleDao.selectByExample(new RoleExample());
        Map<Long, List<Role>> rolesMap = roles.stream().collect(Collectors.groupingBy(Role::getRoleId));

        List<RolePermission> rolePermissions = rolePermissionDao.selectByExample(new RolePermissionExample());
        Map<Long, List<RolePermission>> rolePermissionsMap = rolePermissions.stream().collect(Collectors.groupingBy(
                RolePermission::getRoleId));

        //查询所有权限
        List<Permission> permissions = permissionDao.selectByExample(new PermissionExample());
        Map<Long, List<Permission>> permissionsMap = permissions.stream().collect(Collectors.groupingBy(Permission::getPermissionId));


        //组装
        for (Account account : accounts) {
            AccountInfoDto accountInfoDto = new AccountInfoDto();
            BeanUtils.copyProperties(account, accountInfoDto);
            accountInfoDto.setRoles(new ArrayList<>());
            accountInfoDto.setPermissions(new ArrayList<>());

            List<AccountRole> accountRoleList = accountRoleMap.get(account.getAccountId());
            for (AccountRole accountRole : accountRoleList) {
                accountInfoDto.getRoles().addAll(rolesMap.get(accountRole.getRoleId()));

                List<RolePermission> rolePermissionList = rolePermissionsMap.get(accountRole.getRoleId());
                for (RolePermission rolePermission : rolePermissionList) {
                    accountInfoDto.getPermissions().addAll(permissionsMap.get(rolePermission.getPermissionId()));
                }
            }

            list.add(accountInfoDto);
        }

        return list;
    }

    // TODO 程序此处有个bug，因配置了timeout假设在500ms内没返回，就会发起重试，可能导致同一个用户写入多条数据
    @Override
    public void register(AccountInfoDto accountInfoDto) {

        //try {
        //    TimeUnit.SECONDS.sleep(5);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        Account account = new Account();
        BeanUtils.copyProperties(accountInfoDto, account);
        String md5Pwd = DigestUtils.md5DigestAsHex(account.getPassword().getBytes()); //md5加密
        account.setPassword(md5Pwd);
        account.setCreateTime(new Date());

        accountDao.insert(account);

        for (Role role : accountInfoDto.getRoles()) {
            AccountRole accountRole = new AccountRole();
            accountRole.setAccountId(account.getAccountId());
            accountRole.setRoleId(role.getRoleId());

            accountRoleDao.insert(accountRole);
        }
    }

    @Override
    public Account login(String userName, String passWord) {

        String md5Pwd = DigestUtils.md5DigestAsHex(passWord.getBytes()); //md5加密

        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andUserNameEqualTo(userName).andPasswordEqualTo(md5Pwd);

        List<Account> list = accountDao.selectByExample(accountExample);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }

        return null;
    }

    @Override
    public void delete(Long accountId) {
        accountDao.deleteByPrimaryKey(accountId);

        AccountRoleExample accountRoleExample = new AccountRoleExample();
        accountRoleExample.createCriteria().andAccountIdEqualTo(accountId);

        accountRoleDao.deleteByExample(accountRoleExample);

    }

    @Override
    public void update(Account account) {
        accountDao.updateByPrimaryKey(account);
    }

}
