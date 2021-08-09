package Test;

import autowire.Emp;
import entity.Orders;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的生命周期
 * @author fangsheng
 * @date 2021/8/5 12:32 下午
 */
public class T3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
