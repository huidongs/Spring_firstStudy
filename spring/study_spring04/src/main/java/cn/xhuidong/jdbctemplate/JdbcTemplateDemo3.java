package cn.xhuidong.jdbctemplate;

import cn.xhuidong.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @auther huidong
 * @date 2020/1/19 13:07
 *
 * jdbcTemple基本用法
 */
public class JdbcTemplateDemo3 {

    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        JdbcTemplate jt = ac.getBean("jdbcTemplate",JdbcTemplate.class);
        //3.执行操作
        //  jt.execute("insert into account(id,name,money)values (3,'ccc',1111)");


        //保存
        //jt.update("insert into account(name,money)values (?,?)","eee",3333f);
        //更新
        //jt.update("update account set name=?,money=? where id=?","test",4444,4);
        //删除
        //jt.update()
        //查询所有
//        List<Account> accounts = jt.query("select * from account where money > ?",new BeanPropertyRowMapper<Account>(Account.class),900f);
//        for (Account account:accounts) {
//                System.out.println(account);
//        }
        //查询一个
       // Account account = jt.query("select account")
        List<Account> accounts = jt.query("select * from account where money > ?",new BeanPropertyRowMapper<Account>(Account.class),1111f);
        System.out.println(accounts.isEmpty()?"没有内容":accounts.get(0));




    }
}