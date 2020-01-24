package cn.xhuidong.test;

import cn.xhuidong.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther huidong
 * @date 2020/1/16 13:09
 */
public class AOPTest {

    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取对象
        IAccountService iAccountService = (IAccountService) applicationContext.getBean("accountService");
        //3.执行方法
        iAccountService.saveAccount();

    }
}
