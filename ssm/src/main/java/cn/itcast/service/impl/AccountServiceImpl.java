package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层:执行查询所有");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("业务层:保存账户成功");
    }

    @Override
    public void transfer(String name, String targetName, float money) {
        Account firstAccount = accountDao.findByName(name);
        Account targetAccount = accountDao.findByName(targetName);
        System.out.println(firstAccount);
        firstAccount.setMoney(firstAccount.getMoney()-money);
        targetAccount.setMoney(targetAccount.getMoney()+money);
        accountDao.saveById(firstAccount);
        //int i = 1/0;
        accountDao.saveById(targetAccount);
        System.out.println("转账成功");
    }
}
