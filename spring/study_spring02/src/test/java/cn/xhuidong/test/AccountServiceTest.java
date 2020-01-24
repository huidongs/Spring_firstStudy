package cn.xhuidong.test;

import cn.xhuidong.domain.Account;
import cn.xhuidong.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/1/12 17:42
 */
public class AccountServiceTest {
    @Test
    public void testFindAll(){
        //1.获取容易
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.得到业务层对象
        IAccountService iAccountService = (IAccountService) applicationContext.getBean("accountService");
        //3执行方法
        List<Account> accounts = iAccountService.findAllAccount();
        for (Account account : accounts ){
            System.out.println(account);
        }
    }
}
