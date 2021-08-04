package Test;

import entity.Stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fangsheng
 * @date 2021/8/4 12:26 下午
 */
public class T1 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    Stu stu = (Stu) context.getBean("stuConstructor");
    System.out.println(stu);
  }
}
