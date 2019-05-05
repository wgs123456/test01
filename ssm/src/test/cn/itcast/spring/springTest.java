package cn.itcast.spring;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
    /**
     * 测试spring配置
     */
    @Test
    public void testSpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springConfig.xml");
        AccountService as = context.getBean("accountService", AccountService.class);
        as.findAll();
    }
}
