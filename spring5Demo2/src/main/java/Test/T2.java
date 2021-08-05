package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fangsheng
 * @date 2021/8/5 12:32 下午
 */
public class T2 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config2.xml");
  }
}
