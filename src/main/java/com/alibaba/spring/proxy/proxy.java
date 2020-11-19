/**
 * author:chenyz
 * 2020/11/19 14:17
 */
package com.alibaba.spring.proxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class proxy {

    @Test
    public void m1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取对应接口代理类
        Class<IService> proxyClass =
                (Class<IService>) Proxy.getProxyClass(IService.class.getClassLoader(),
                        IService.class);

        //创建代理类的处理器
        InvocationHandler invocationHandler = new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method,Object[] args){
                System.out.println("我是InvocationHandler,被调用的方法是"+method.getName());
                return null;
            }
        };

        //创建代理类实例
        IService proxyService =
                proxyClass.getConstructor(InvocationHandler.class).newInstance(invocationHandler);

        //调用代理方法
        proxyService.m1();
        proxyService.m2();
        proxyService.m3();
    }

}
