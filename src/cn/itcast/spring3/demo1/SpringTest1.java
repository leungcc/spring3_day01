package cn.itcast.spring3.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {
    @Test
    //传统方式
    public void demo1() {
        HelloService helloService = new HelloServiceImpl();
        helloService.sayHello();
    }

    @Test
    //Spring开发
    public void demo2() {
        //创建一个工厂类
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("userService");
        helloService.sayHello();
    }
}
