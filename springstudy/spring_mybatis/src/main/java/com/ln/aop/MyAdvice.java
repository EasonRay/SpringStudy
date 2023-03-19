package com.ln.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAdvice {

        @Pointcut("execution(* com.ln.dao.EmpDao.getEmpById(..))")
//    @Pointcut("execution(* com.ln.domin.Emp.save())")
//    @Pointcut("execution(* com.ln.*.*Service.getEmpById(..))")
    private void pt() {
    }


    @Around("pt()")
    public Object method(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println(signature.getDeclaringTypeName());
        String name = signature.getName();
        System.out.println(name);
        long start = System.currentTimeMillis();
        System.out.println("before---");
        Object o = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println("after---");
        return o;
    }

    //        @After("pt()")
//    @Before("pt()")
    public void method1() {
        System.out.println("after");
    }
}
