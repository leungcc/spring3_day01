package cn.itcast.spring3.demo4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     *
     * @param bean 实例对象
     * @param beanName 在配置文件中配置的类的标识
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(final Object bean, String beanName) throws BeansException {
        System.out.println("第五步：在初始化之前执行...");

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        System.out.println("第八步：初始化后执行...");

        //对你想处理的类进行增强控制
        if(beanName.equals("customerService")){
            Object proxy = (Object) Proxy.newProxyInstance(
                bean.getClass().getClassLoader(),
                bean.getClass().getInterfaces() ,
                new InvocationHandler() {
                    // 调用目标方法的时候,调用invoke方法.
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        if("add".equals(method.getName())){
                            System.out.println("bean增强: 权限校验...");
                            Object result = method.invoke(bean, args);
                            //System.out.println(System.currentTimeMillis());
                            return result;
                        }
                        return method.invoke(bean, args);
                    }
                }
            );
            return proxy;
        }
        return bean;
    }
}
