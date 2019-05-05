package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {
    /**
     * 查找所有信息
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    @Insert("insert into account values(null,#{name},#{money})")
    void saveAccount(Account account);

    /**
     * 根据姓名查用户
     * @param name
     * @return
     */
    @Select("select * from account where name = #{name}")
    Account findByName(String name);

    /**
     * 修改用户信息
     * @param account
     */
    @Update("update account set name = #{name},money = #{money} where id =#{id}")
    void saveById(Account account);
}
