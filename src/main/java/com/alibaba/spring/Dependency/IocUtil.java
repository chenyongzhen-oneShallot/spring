package com.alibaba.spring.Dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocUtil {
    public static ClassPathXmlApplicationContext context(String beanXml){
        return new ClassPathXmlApplicationContext(beanXml);
    }
}
