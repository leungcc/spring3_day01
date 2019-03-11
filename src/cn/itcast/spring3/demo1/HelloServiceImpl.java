package cn.itcast.spring3.demo1;

/**
 * 入门案例实现类
 */
public class HelloServiceImpl implements HelloService {
    private String info;
    public void sayHello() {
        System.out.println("Hello Spring ..." + info);
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
