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
// * @date 2022/2/9 19:27
// */
//public class try_catch {
//    public static void main(String[] args) {
//        int i = 10;
//        int n = 0;
//        try {
//            //业务代码
//            //因为,这一行代码被0除,所以,下一行代码不会被执行
//            int result = i / n;
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            //e表示ArithmeticException类的局部变量
//            System.out.println("不能被0除");
//        }
//    }
//}