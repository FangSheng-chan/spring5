package com.ss.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 2、创建增强类（编写增强逻辑）
// （1）在增强类里面，创建方法，让不同方法代表不同通知类型
// 增强的类
@Component
@Aspect
@Order(1)
public class UserProxy {

  // 抽取公共切入点
  @Pointcut("execution(* com.ss.annotation.User.add(..))")
  public void pointCut() {}

  // 前置通知
  @Before(value = "pointCut()")
  public void before() {
    System.out.println("before......");
  }

  // 后置通知（返回结果之后执行）
  @AfterReturning("execution(* com.ss.annotation.User.add(..))")
  public void afterReturning() {
    System.out.println("afterReturning.........");
  }

  // 最终通知 （方法执行之后执行,不管有没有报错都会执行）
  @After(value = "execution(* com.ss.annotation.User.add(..))")
  public void after() {
    System.out.println("after.........");
  }

  // 异常通知
  @AfterThrowing(value = "execution(* com.ss.annotation.User.add(..))")
  public void afterThrowing() {
    System.out.println("afterThrowing.........");
  }

  // 环绕通知
  @Around(value = "execution(* com.ss.annotation.User.add(..))")
  public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("环绕之前.........");

    // 被增强的方法执行
    proceedingJoinPoint.proceed();

    System.out.println("环绕之后.........");
  }
}
