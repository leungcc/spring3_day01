package cn.itcast.spring3.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest5 {
    //setter方法注入对象属性
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }

    //构造器注入对象属性
    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car2 car2 = (Car2) applicationContext.getBean("car2");
        System.out.println(car2);
    }

    //SpEL: #{personInfo.showName()}
    @Test
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car3 = (Car) applicationContext.getBean("car3");
        System.out.println(car3);
    }

    //名称空间p：属性是对象实例的
    @Test
    public void demoPerson() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    //名称空间p：属性注入
    @Test
    public void demoCarP() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car carP = (Car) applicationContext.getBean("car_p");
        System.out.println(carP);
    }

    //名称空间p：属性注入（ref）
    @Test
    public void demoPersonP() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person personP = (Person) applicationContext.getBean("person_p");
        System.out.println(personP);
    }
}
