package com.itheima.test;


import com.itheima.config.SpringConfig;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationContextTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = app0licationContext.getBean(UserService.class);
//        userService.show();
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserDaoImpl userDao = applicationContext.getBean(UserDaoImpl.class);
//        System.out.println(userDao);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.show();
    }
}
