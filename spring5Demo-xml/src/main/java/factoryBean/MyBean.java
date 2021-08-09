package factoryBean;

import entity.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author fangsheng
 * @date 2021/8/5 12:41 下午
 */
public class MyBean implements FactoryBean<Course> {

    /**
     * 定义返回Bean
     * @return
     * @throws Exception
     */
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
