package com.xuefei.service.manager;

import com.xuefei.dto.manager.AccountInfoDto;
import com.xuefei.pojo.manager.Account;

import java.util.List;

public interface IManagerService {

    List<AccountInfoDto> accountInfoList(Integer pageNum, Integer pageSize);

    void register(AccountInfoDto accountInfoDto);

    Account login(String userName, String passWord);

    void delete(Long accountId);

    void update(Account account);
}
