package ss.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ss.service.UserService;

public class Test {

  public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
      UserService userService = context.getBean("userService", UserService.class);
      userService.accountMoney();
  }
}
