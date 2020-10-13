/**
 * author:chenyz
 * 2020/10/13 15:42
 */
package com.alibaba.spring;

public class UserFactory {

    public UserModel buildUser1(){
        UserModel userModel = new UserModel();
        userModel.setName("bean实例方法创建的对象");
        return userModel;
    }

    public UserModel buildUser2(String name,int age){
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);
        return userModel;
    }
}
