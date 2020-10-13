/**
 * author:chenyz
 * 2020/10/13 11:10
 */
package com.alibaba.spring.test;

public class test2 {

    private test1 test1;

    public test2(test1 test1){
        this.test1 = test1;

    }

    public void a(){
        this.test1.a();
    }

}
