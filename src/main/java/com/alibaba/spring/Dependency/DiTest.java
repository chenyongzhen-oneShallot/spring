package com.alibaba.spring.Dependency;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    /**
     * 优缺点
     * 参数位置的注入对参数顺序有很强的依赖性，若构造函数参数位置被人调整过，会导致注入出错。
     * 不过通常情况下，不建议去在代码中修改构造函数，如果需要新增参数的，可以新增一个构造函数来实
     * 现，这算是一种扩展，不会影响目前已有的功能。
     */
    @Test
    public void diByConstructorParamIndex(){
        ClassPathXmlApplicationContext context = IocUtil.context("classpath:/dependencybeans.xml");
        System.out.println(context.getBean("diByConstructorParamIndex"));
    }

    /**
     * 实际上按照参数位置或者按照参数的类型注入，都有一个问题，很难通过bean的配置文件，知道这个
     * 参数是对应UserModel中的那个属性的，代码的可读性不好，比如我想知道这每个参数对应
     * UserModel中的那个属性，必须要去看UserModel的源码，下面要介绍按照参数名称注入的方式比上
     * 面这2种更优秀一些
     */
    @Test
    public void diByConstructorParamType(){
        ClassPathXmlApplicationContext context = IocUtil.context("classpath:/dependencybeans.xml");
        System.out.println(context.getBean("diByConstructorParamType"));
    }

    /**
     * java通过反射的方式可以获取到方法的参数名称，不过源码中的参数通过编译之后会变成class对象，通
     * 常情况下源码变成class文件之后，参数的真实名称会丢失，参数的名称会变成arg0,arg1,arg2这样的，
     * 和实际参数名称不一样了，如果需要将源码中的参数名称保留在编译之后的class文件中，编译的时候
     * 需要用下面的命令：javac -parameters java源码
     * 但是我们难以保证编译代码的时候，操作人员一定会带上-parameters参数，所以方法的参数可能在
     * class文件中会丢失，导致反射获取到的参数名称和实际参数名称不符
     * spring提供了解决方案，通过ConstructorProperties注解来定义参数的
     * 名称，将这个注解加在构造方法上面
     */
    @Test
    public void diByConstructorParamName(){
        ClassPathXmlApplicationContext context = IocUtil.context("classpath:/dependencybeans.xml");
        System.out.println(context.getBean("diByConstructorParamName"));
    }
}
