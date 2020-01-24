package cn.xhuidong.service.impl;

import cn.xhuidong.dao.IAccountDao;
import cn.xhuidong.dao.impl.AccountDaoImpl;
import cn.xhuidong.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @auther huidong
 * @date 2020/1/11 13:00
 */

@Component(value = "accountService")
public class AccountServiceImpl implements IAccountService {
    //@Autowired
    //@Qualifier("accountDao")
    @Resource(name = "accountDao")
    private IAccountDao iAccountDao ;

    public void saveAccount() {
        iAccountDao.saveAccount();
    }
}
