package com.alibaba.spring.Dependency.otherBean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OtherBeanTest {

    @Test
    public void Test(){
        String beanXml = "classpath:/diBean.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(beanXml);
        System.out.println(classPathXmlApplicationContext.getBean("diByRefConstructor"));
        System.out.println(classPathXmlApplicationContext.getBean("diByRefSetter"));
        System.out.println(classPathXmlApplicationContext.getBean("diByInConstructor"));
        System.out.println(classPathXmlApplicationContext.getBean("diByInSetter"));
    }
}
