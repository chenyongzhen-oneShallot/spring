package com.alibaba.spring.Dependency;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * spring依赖注入通常有2种方式：构造函数的方式和set属性的方式
 * 构造器注入又分为3种注入方式：
 * 根据构造器参数索引注入
 * 根据构造器参数类型注入
 * 根据构造器参数名称注入
 */
@Setter
@Getter
@ToString
public class UserModel {
    private String name;
    private int age;
    private String desc;

    public UserModel(){

    }

    public UserModel(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

//    @ConstructorParameters({"name","age","desc"})
    public UserModel(String name, int age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }
}
