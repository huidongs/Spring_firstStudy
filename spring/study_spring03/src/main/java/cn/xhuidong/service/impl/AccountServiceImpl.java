package cn.xhuidong.service.impl;

import cn.xhuidong.service.IAccountService;

/**
 * @auther huidong
 * @date 2020/1/13 10:28
 */
public class AccountServiceImpl implements IAccountService {


    public void saveAccount() {
        System.out.println("执行了保存");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新");

    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
