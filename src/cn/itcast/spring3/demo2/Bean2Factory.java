package cn.itcast.spring3.demo2;

/**
 * Bean2的静态工厂
 */
public class Bean2Factory {
    public static Bean2 getBean2() {
        System.out.println("静态工厂的实例化");
        return new Bean2();
    }
}
