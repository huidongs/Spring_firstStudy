package cn.xhuidong.ui;

import cn.xhuidong.dao.IAccountDao;
import cn.xhuidong.service.IAccountService;
import cn.xhuidong.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther huidong
 * @date 2020/1/11 13:23
 */
public class Client {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAccountService iAccountService = (IAccountService) applicationContext.getBean("accountService");
        IAccountDao iAccountDao = applicationContext.getBean("accountDao",IAccountDao.class);

        iAccountService.saveAccount();
        System.out.println(iAccountDao);
        System.out.println(iAccountService);

    }
}
