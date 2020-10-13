/**
 * author:chenyz
 * 2020/10/13 15:01
 */
package com.alibaba.spring;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserModel {
    private String name;
    private int age;

    public UserModel(){
        this.name = "我是通过UserModel的无参构造方法创建的!";
    }

    public UserModel(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
