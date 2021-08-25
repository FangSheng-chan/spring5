package com.ss.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PersonProxy {
    // 抽取公共切入点
    @Pointcut("execution(* com.ss.annotation.User.add(..))")
    public void pointCut() {}

    // 前置通知
    @Before(value = "pointCut()")
    public void before() {
        System.out.println("PersonProxy before......");
    }

    // 后置通知（返回结果之后执行）
    @AfterReturning("execution(* com.ss.annotation.User.add(..))")
    public void afterReturning() {
        System.out.println("PersonProxy afterReturning.........");
    }

    // 最终通知 （方法执行之后执行,不管有没有报错都会执行）
    @After(value = "execution(* com.ss.annotation.User.add(..))")
    public void after() {
        System.out.println("PersonProxy after.........");
    }

    // 异常通知
    @AfterThrowing(value = "execution(* com.ss.annotation.User.add(..))")
    public void afterThrowing() {
        System.out.println("PersonProxy afterThrowing.........");
    }

    // 环绕通知
    @Around(value = "execution(* com.ss.annotation.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("PersonProxy 环绕之前.........");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("PersonProxy 环绕之后.........");
    }
}
