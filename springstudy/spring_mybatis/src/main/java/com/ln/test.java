package com.ln;

import com.ln.config.SpringConfig;
import com.ln.dao.EmpDao;
import com.ln.domin.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmpDao bean = ctx.getBean(EmpDao.class);
        Emp empById = bean.getEmpById(1);
        System.out.println(empById);
//        Emp emp = ctx.getBean(Emp.class);
//        emp.save();
    }
}
