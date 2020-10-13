/**
 * author:chenyz
 * 2020/10/13 16:51
 */
package com.alibaba.spring.scope;

public class BeanScopeModel {
    public BeanScopeModel(String beanScope){
        System.out.println(String.format("create BeanScopeModel,{sope=%s}, {this=%s}", beanScope, this));
    }

}
