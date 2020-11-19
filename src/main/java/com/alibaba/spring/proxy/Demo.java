/**
 * author:chenyz
 * 2020/11/19 16:52
 */
package com.alibaba.spring.proxy;

import org.junit.Test;

public class Demo {
    @Test
    public void demo(){
        IService service = CostTimeInvocationHandler.createProxy(new IServiceImpl(),IService.class);
        service.m1();
        service.m2();
        service.m3();
    }

}
