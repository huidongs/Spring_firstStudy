package cn.xhuidong.dao.impl;

import cn.xhuidong.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @auther huidong
 * @date 2020/1/11 13:04
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
