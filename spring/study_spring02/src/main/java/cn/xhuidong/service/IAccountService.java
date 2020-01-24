package cn.xhuidong.service;

import cn.xhuidong.domain.Account;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/1/12 14:53
 */
public interface IAccountService {

    //查询所有
    List<Account> findAllAccount();

    //查询一个
    Account findAccountById(int accountId);

    //保存
    void saveAccount(Account account);

    //更新
    void updateAccount(Account account);

    //删除
    void deleteAccount(int accountId);
}
