package com.practice;

public class ExceptionP {

    public static void exceptionP() {
        try {
            int i = 4 / 0;
        } catch (Exception e) {
            System.out.println("算数异常");
            throw new RuntimeException();
        }

    }

}