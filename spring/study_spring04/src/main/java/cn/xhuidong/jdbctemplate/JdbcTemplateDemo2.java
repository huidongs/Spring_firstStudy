package cn.xhuidong.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @auther huidong
 * @date 2020/1/19 13:07
 *
 * jdbcTemple基本用法
 */
public class JdbcTemplateDemo2 {

    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        JdbcTemplate jt = ac.getBean("jdbcTemplate",JdbcTemplate.class);
        //3.执行操作
        jt.execute("insert into account(id,name,money)values (3,'ccc',1111)");


//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl("jdbc:mysql://localhost:3306/db_spring");
//        ds.setUsername("root");
//        ds.setPassword("admin");
//
//
//        //1.创建JdbcTemplate对象
//        JdbcTemplate jt = new JdbcTemplate();
//        //设置数据源
//        jt.setDataSource(ds);
//        //2.执行操作
//        jt.execute("delete from account where id='3'");




    }
}