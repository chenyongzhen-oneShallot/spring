package com.alibaba.spring.Dependency.otherBean;

import com.alibaba.spring.Dependency.UserModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 若我们依赖的对象是容器中的其他bean对象的时候，需要用下面的方式进行注入
 * 注入容器中的bean有两种写法：
 * ref属性方式(构造器的方式,setter方式)
 * 内置bean的方式(构造器的方式,setter方式)
 *
 */
@Setter
@Getter
@ToString
public class PersonModel {
    private UserModel userModel;

    public PersonModel(){

    }

    public PersonModel(UserModel userModel){
        this.userModel  = userModel;
    }

}
