/**
 * author:chenyz
 * 2020/10/13 11:53
 */
package com.alibaba.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //1.bean配置文件位置
        String beanXml = "classpath:/bean.xml";

        //2.创建ClassPathXmlApplicationContext容器，给容器指定需要加载的bean配置文件
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(beanXml);

        //3.从容器中获取需要的bean
        HelloWorld helloWorld = classPathXmlApplicationContext.getBean("helloworld",
                HelloWorld.class);
        helloWorld.say();


        System.out.println("\n第一种：通过反射调用构造方法创建bean对象");
        System.out.println(classPathXmlApplicationContext.getBean("createBeanByConstructor1"));
        System.out.println(classPathXmlApplicationContext.getBean("createBeanByConstructor2"));


        System.out.println("\n第二种：通过静态工厂方法创建bean对象");
        System.out.println(classPathXmlApplicationContext.getBean(
                "createBeanByStaticFactoryMethod1"));
        System.out.println(classPathXmlApplicationContext.getBean(
                "createBeanByStaticFactoryMethod2"));

        System.out.println("\n第三种：通过实例工厂方法创建bean对象");
        System.out.println(classPathXmlApplicationContext.getBean(
                "createBeanByBeanMethod1"));
        System.out.println(classPathXmlApplicationContext.getBean(
                "createBeanByBeanMethod2"));


        System.out.println("\n第四种：通过FactoryBean 创建UserModel对象");
        System.out.println(classPathXmlApplicationContext.getBean("createByFactoryBean"));
        //多次获取createByFactoryBean看看是否是同一个对象.答案是同一个对象。当isSingleton返回为false时就不是同一个对象了
        System.out.println(classPathXmlApplicationContext.getBean("createByFactoryBean"));

    }

}
