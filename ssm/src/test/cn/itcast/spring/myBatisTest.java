package cn.itcast.spring;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class myBatisTest {
    @Test
    public void testMyBatis() throws Exception{
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
// 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
// 创建sqlSession对象
        SqlSession session = factory.openSession();
// 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> all = dao.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}
