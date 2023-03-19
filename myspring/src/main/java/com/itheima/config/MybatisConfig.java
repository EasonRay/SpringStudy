package com.itheima.config;


import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
@MapperScan("com.itheima.mapper")
public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean ssfb=new SqlSessionFactoryBean();
        ssfb.setDataSource(dataSource);
        ssfb.setTypeAliasesPackage("com.itheima.pojo");
        return ssfb;
    }

    //此函数的作用和@MapperScan一样
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        MapperScannerConfigurer mapperScannerConfigurer=new MapperScannerConfigurer();
//        mapperScannerConfigurer.setBasePackage("com.itheima.mapper");
//        return mapperScannerConfigurer;
//    }
}
