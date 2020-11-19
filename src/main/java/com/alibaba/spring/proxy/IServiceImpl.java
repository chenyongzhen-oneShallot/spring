/**
 * author:chenyz
 * 2020/11/19 15:50
 */
package com.alibaba.spring.proxy;

public class IServiceImpl implements IService{
    @Override
    public void m1(){
        System.out.println("我是IService对象,m1方法");
    }
    @Override
    public void m2(){
        System.out.println("我是IService对象,m2方法");
    }
    @Override
    public void m3(){
        System.out.println("我是IService对象,m3方法");
    }

}
