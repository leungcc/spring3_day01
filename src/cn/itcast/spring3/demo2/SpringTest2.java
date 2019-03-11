package cn.itcast.spring3.demo2;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 的实例化测试
 */
public class SpringTest2 {

    /**
     * 无参数构造方法实例化
     */
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        System.out.println(bean1);
    }

    /**
     * 静态工厂实例化
     */
    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        System.out.println(bean2);
    }

    @Test
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
        System.out.println(bean3);
        bean3.fuxk();
    }
}
