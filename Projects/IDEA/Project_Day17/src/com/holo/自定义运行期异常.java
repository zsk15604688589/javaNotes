///*
// * Copyright 2022 tu.cn All right reserved. This software is the
// * confidential and proprietary information of tu.cn ("Confidential
// * Information"). You shall not disclose such Confidential Information and shall
// * use it only in accordance with the terms of the license agreement you entered
// * into with Tu.cn
// */
//package com.holo;
//
///**
// * @author Holo
// * @date 2022/2/9 20:32
// */
//public class 自定义运行期异常 {
//    public static void main(String[] args) {
//        //测试
//        method(1, 1);
//    }
//
//    public static void method(int i, int n) {
//        if (n == 0) {
//            //手动抛出
//            throw new MyException("不能为0");
//        }
//        if (!(n > 0 && n <= 100)) {
//            throw new MyException("必须在1-100之间");
//        }
//        int result = i / n;
//        System.out.println("result=" + result);
//    }
//}
//
////自定义异常类
//class MyException extends RuntimeException {
//    public MyException() {
//        super();
//    }
//
//    public MyException(String message) {
//        super(message);
//    }
//
//    public MyException(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    public MyException(Throwable cause) {
//        super(cause);
//    }
//
//    protected MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//        super(message, cause, enableSuppression, writableStackTrace);
//    }
//}
//
