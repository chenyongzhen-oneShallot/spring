/**
 * author:chenyz
 * 2020/10/13 16:06
 */
package com.alibaba.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

import java.util.TreeSet;

public class UserFactoryBean implements FactoryBean<UserModel> {
    int count = 1;
    @Nullable
    @Override
    public UserModel getObject() throws Exception{//返回了一个创建好的UserModel对象
        UserModel userModel = new UserModel();
        //此处用到了一个count，通过这个一会可以看出isSingleton不同返回值的时候从容器获取的bean是否是同一个
        userModel.setName("我是通过FactoryBean创建的第" + count++ + "对象");
        return userModel;
    }

    @Nullable
    @Override
    public Class<?> getObjectType(){//返回对象的Class对象
        return UserModel.class;
    }

    @Override
    public boolean isSingleton(){//返回true，表示创建的对象是单例的，那么我们每次从容器中获取这个对象的时候都是同一个对象
        return true;
    }
}
