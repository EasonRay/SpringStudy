package config;

import com.alibaba.druid.pool.DruidDataSource;
import dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JDBCConfig {

    //1.定义一个方法获得要管理的对象
    //2.添加@Bean，表示当前方法返回值是一个bean
//    @Value("com.mysql.cj.jdbc.Driver")
    @Value("${driverClass}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${user}")
    private String username;
    @Value("${password}")
    private String password;
    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
