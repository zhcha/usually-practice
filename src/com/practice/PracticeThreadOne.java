package com.practice;

public class PracticeThreadOne {

    private static int count = 10;

    public synchronized static void m() {
        count--;
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

    }
}
