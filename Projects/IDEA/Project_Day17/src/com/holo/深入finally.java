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
// * @date 2022/2/9 19:44
// */
//public class 深入finally {
//    public static void main(String[] args) {
//        int result = method();
//        System.out.println(result);
//    }
//
//    public static int method() {
//        int a = 10;
//        try {
//            return a;
//        } finally {
//            System.out.println("在return之前执行");
//            a = 100;
//        }
//    }
//}