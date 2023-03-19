package com.ln.config;


import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.ln")
@PropertySource("jdbc.properties")
@EnableAspectJAutoProxy
@EnableTransactionManagement
@Import({JDBCConfig.class,MybatisConfig.class})
public class SpringConfig {
}
