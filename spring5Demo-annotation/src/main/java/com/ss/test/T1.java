package com.ss.test;

import com.ss.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fangsheng
 * @date 2021/8/4 12:26 下午
 */
public class T1 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    UserService userService = context.getBean("userService", UserService.class);
    System.out.println(userService);
    userService.add();
  }
}
