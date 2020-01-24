package cn.xhuidong.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;

/**
 * @auther huidong
 * @date 2020/1/19 13:07
 *
 * jdbcTemple基本用法
 */
public class JdbcTemplateDemo1 {

    public static void main(String[] args) {
        //准备数据源：spring的内置数据源

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/db_spring");
        ds.setUsername("root");
        ds.setPassword("admin");


        //1.创建JdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate();
        //设置数据源
        jt.setDataSource(ds);
        //2.执行操作
        jt.execute("delete from account where id='3'");




    }
}