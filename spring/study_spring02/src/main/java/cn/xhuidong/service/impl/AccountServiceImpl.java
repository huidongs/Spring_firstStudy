package cn.xhuidong.service.impl;

import cn.xhuidong.dao.IAccountDao;
import cn.xhuidong.domain.Account;
import cn.xhuidong.service.IAccountService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @auther huidong
 * @date 2020/1/12 15:00
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao iAccountDao;

    public  void  setAccount(IAccountDao iAccountDao){
            this.iAccountDao=iAccountDao;
    }

    public List<Account> findAllAccount() {
        return iAccountDao.findAllAccount();
    }


    public Account findAccountById(int accountID) {
        return iAccountDao.findAccountById(accountID);
    }

    public void saveAccount(Account account) {
        iAccountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        iAccountDao.updateAccount(account);
    }

    public void deleteAccount(int accountId) {
        iAccountDao.deleteAccount(accountId);
    }
}
