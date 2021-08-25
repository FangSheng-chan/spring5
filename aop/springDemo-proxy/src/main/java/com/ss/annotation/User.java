package com.ss.annotation;

import org.springframework.stereotype.Component;

// 1、创建类，在类里面定义方法
@Component
public class User {
  public void add() {
    System.out.println("add.......");
    // 测试 afterThrowing
    //    int i = 1 / 0;
  }
}
