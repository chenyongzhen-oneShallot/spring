/**
 * author:chenyz
 * 2020/10/13 11:13
 */
package com.alibaba.spring.test;

public class run {
    public static void main(String[] args) {
//        test1 test1 = new test1();
//        test1.a();
        test2 test2 = new test2(new test1());
        test2.a();
    }
}
