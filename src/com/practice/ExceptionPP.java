package com.practice;

public class ExceptionPP {

    public static String exceptionPP() {
        try {
            ExceptionP.exceptionP();
            return "未发生异常";
        } catch (Exception e) {
            return "发生异常";
        }
    }

}
