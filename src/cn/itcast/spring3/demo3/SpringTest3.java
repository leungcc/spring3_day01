package cn.itcast.spring3.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用范围
 */
public class SpringTest3 {
    //测试scope
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer c1 = (Customer) applicationContext.getBean("customer");
        Customer c2 = (Customer) applicationContext.getBean("customer");
        System.out.println(c1);
        System.out.println(c2);
        //两次地址一样，证明只实例化一次
    }

    //测试初始化销毁
    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) applicationContext.getBean("product");
        System.out.println(product);
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
