package com.practice;

import java.io.IOException;

public class PracticeTwo {

    public static void main(String[] args) throws IOException {
        Parent p = new Parent();
        p.sayHi(10,"");
        p = null;
        System.gc();
        System.in.read();//阻塞main线程,让垃圾回收线程有时间执行
    }
}
