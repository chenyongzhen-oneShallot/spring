package com.alibaba.spring.Dependency.setter;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

    /**
     * setter注入相对于构造函数注入要灵活一些，构造函数需要指定对应构造函数中所有参数的值，而
     * setter注入的方式没有这种限制，不需要对所有属性都进行注入，可以按需进行注入。
     */
    @Test
    public void diBySetterTest(){
        String beanXml = "classpath:/diBySetter.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(beanXml);
        System.out.println(classPathXmlApplicationContext.getBean("diBySetter"));
    }
}
