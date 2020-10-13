/**
 * author:chenyz
 * 2020/10/13 15:18
 */
package com.alibaba.spring;

public class UserStaticFactory {

    public static UserModel buildUser1(){
        System.out.println(UserStaticFactory.class+".buildUser1");

        UserModel userModel = new UserModel();
        userModel.setName("通过工厂静态无参方法创建UerModel实例对象");

        return userModel;
    }

    public static UserModel buildUser2(String name,int age){
        System.out.println(UserStaticFactory.class+".buildUser2");

        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);

        return userModel;
    }
}
