package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查找所有用户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 转账
     * @param name
     * @param targetName
     * @param money
     */
    void transfer(String name,String targetName,float money);
}
