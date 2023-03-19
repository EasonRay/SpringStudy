package testspring;

import com.alibaba.druid.util.DruidDataSourceUtils;
import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.BookService;
import service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
//        BookService bookService=new BookServiceImpl();
//        bookService.save();
        //3.获取Ioc容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext ctx=new FileSystemXmlApplicationContext("D:\\mavenproject\\springstudy\\src\\main\\resources\\applicationContext.xml");

        //4.获取Bean
        BookService bookService = (BookService) ctx.getBean("bookService");
//        BookService bookService1 = ctx.getBean("bookService",BookService.class);

//        bookService.save();
        System.out.println(bookService);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
    }
}
