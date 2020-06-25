package com.practice;

public class Son extends Parent{

    @Override
    public int sayHi(int i, String j) {
        super.age = 11;
        return super.sayHi(10,"0");
    }
}
