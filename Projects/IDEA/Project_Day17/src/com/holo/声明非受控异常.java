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
// * @date 2022/2/9 20:15
// */
//public class 声明非受控异常 {
//    public static void main(String[] args) {
//        //可以不缩写try-catch,因为是个非受控异常
//        method();
//        //建议缩写异常处理
//        try {
//            method();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void method() throws ArithmeticException {//声明异常
//        int i = 10;
//        int n = 0;
//        int result = i / n;
//        System.out.println(result);
//    }
//}