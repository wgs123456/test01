package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有账户
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("控制层：AccountController执行了");
        List<Account> lists = accountService.findAll();
        for (Account list : lists) {
            System.out.println(list);
        }
        return "success";
    }

    /**
     * 保存账户
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("控制层：saveAccount执行了");
        accountService.saveAccount(account);
        return "success";
    }

    @RequestMapping("/transfer")
    public String transfer(String name,String targetName,float money){
        System.out.println("name:"+name+"  targetName:"+targetName+"  money:"+money);
        System.out.println("控制层：saveAccount执行了");
        accountService.transfer(name,targetName,money);
        return "success";
    }
}
