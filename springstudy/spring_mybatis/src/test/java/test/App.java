package test;

import com.ln.config.SpringConfig;
import com.ln.domin.Emp;
import com.ln.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class App {
    @Autowired
    private EmpService empService;

    @Test
    public void test(){
        Emp empById = empService.getEmpById(2);
        System.out.println(empById);
//        Emp emp = new Emp();
//        emp.save();
    }

//    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        EmpDao bean = ctx.getBean(EmpDao.class);
//        Emp empById = bean.getEmpById(1);
//        System.out.println(empById);
//    }

}
