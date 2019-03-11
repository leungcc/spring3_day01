package cn.itcast.spring3.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest4 {

    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
        System.out.println("执行业务");
        customerService.add();
        customerService.find();
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
