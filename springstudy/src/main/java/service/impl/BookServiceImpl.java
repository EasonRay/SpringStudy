package service.impl;

import dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import service.BookService;

@Component("bookService")
public class BookServiceImpl implements BookService {
    //5.删除业务中使用new的方式创建的DAO对象
    @Autowired//自动装配
    @Qualifier("bookDao")//指定名称
    private BookDao bookDao;
//    @Value("1000")
    @Value("${name}")
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void save() {
        System.out.println("book service save"+num);
        bookDao.save();
    }
    //6.提供对应的set方法

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
