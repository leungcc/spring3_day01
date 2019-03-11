package cn.itcast.spring3.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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

    @Test
    //测试用文件目录下的 applicationContext.xml 配置文件
    public void demo3() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("userService");
        helloService.sayHello();
    }

    @Test
    //旧用法，用 BeanFactory
    //ApplicationContext是继承于BeanFactory的
    public void demo4() {
        //resource一样分两种：一种是 ClassPathResource，一种是 FileSystemResource
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        HelloService helloService = (HelloService) beanFactory.getBean("userService");
        helloService.sayHello();
    }
}
