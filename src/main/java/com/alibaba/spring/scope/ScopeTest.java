/**
 * author:chenyz
 * 2020/10/13 16:53
 */
package com.alibaba.spring.scope;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//singleton是scope的默认值，所以spring容器中默认创建的bean对象是单例
//的，通常spring容器在启动的时候，会将scope为singleton的bean创建好放在容器中
public class ScopeTest {
    ClassPathXmlApplicationContext context;

    @Before
    /**
     * @Before注解，这个是junit提供的功能，这个方法会在所有@Test标注的方法之前之前运行
     */


    public void before(){
        System.out.println("spring容器准备启动.....");
        String beanXml = "classpath:/bean.xml";
        this.context = new ClassPathXmlApplicationContext(beanXml);
        System.out.println("spring容器启动完毕");
    }

    /**
     * 从输出中得到2个结论
     * 前3行的输出可以看出，BeanScopeModel的构造方法是在容器启动过程中调用的，说明这个bean实例在容器启动过程中就创建好了，放在容器中缓存着
     * 最后3行输出的是一样的，说明返回的是同一个bean对象
     */
    @Test
    public void singletonBean(){
        System.out.println("---------单例bean，每次获取的bean实例都一样---------");
        System.out.println(context.getBean("singletonBean"));
        System.out.println(context.getBean("singletonBean"));
        System.out.println(context.getBean("singletonBean"));
    }

    /**
     * 输出中可以看出，容器启动过程中并没有去创建BeanScopeModel对象，3次获取prototypeBean得到
     * 的都是不同的实例，每次获取的时候才会去调用构造方法创建bean实例。
     * 多例bean每次获取的时候都会重新创建，如果这个bean比较复杂，创建时间比较长，会影响系统的性能，这个地方需要注意。
     *
     */
    @Test
    public void prototypeBean(){
        System.out.println("---------多例bean，每次获取的bean实例都不一样---------");
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));
        System.out.println(context.getBean("prototypeBean"));
    }
}


