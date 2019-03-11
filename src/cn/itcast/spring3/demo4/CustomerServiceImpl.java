package cn.itcast.spring3.demo4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CustomerServiceImpl implements CustomerService, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public CustomerServiceImpl() {
        super();
        System.out.println("实例化CustomerService");
    }

    //可以使用 Ctrl+Shift+Up/Down 上下移动语句

    private String name;
    public void setName(String name) {
        System.out.println("第二步：属性的注入");
        System.out.println(name);
        this.name = name;
    }

    public void add() {
        System.out.println("添加客户");
    }
    public void find() {
        System.out.println("查询客户");
    }

    //实现 BeanNameAware 必须重写的方法
    //让类了解Spring容器，把在xml配置的id注入进来了
    @Override
    public void setBeanName(String id) {
        System.out.println("第三步：注入配置的类的名称" + id);
    }

    //实现了 ApplicationContextAware 必须重写的方法
    //让类了解Spring容器，把applicationContext注入
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：注入applicationContext");
    }


    //实现了 InitializingBean 必须重写的方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后");
    }


    public void setup() {
        System.out.println("第七步：调用手动设置的初始化方法");
    }

    public void teardown() {
        System.out.println("第十一步：调用手动销毁方法");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：实现了 DisposableBean执行destroy方法");
    }
}
