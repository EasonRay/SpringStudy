package com.itheima.dao.impl;


import com.itheima.dao.UserDao;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy
//@Profile("test")//只有在test环境下，他才能被注入到spring容器中
public class UserDaoImpl implements UserDao {
}
