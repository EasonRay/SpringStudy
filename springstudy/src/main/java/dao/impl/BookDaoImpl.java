package dao.impl;

import dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bookDao")
//@Scope("prototype")
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save");
    }
    @PostConstruct
    public void init() {
        System.out.println("init");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destory");
    }
}
