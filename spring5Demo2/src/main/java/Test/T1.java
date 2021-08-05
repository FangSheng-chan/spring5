package Test;

import entity.Course;
import factoryBean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fangsheng
 * @date 2021/8/4 12:26 下午
 */
public class T1 {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
    // 返回值类型可以不是定义的bean类型！
    Course course = context.getBean("myBean", Course.class);
    System.out.println(course);
  }
}
