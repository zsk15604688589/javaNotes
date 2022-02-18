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
// * @date 2022/1/22 0:15
// */
//public class 匿名内部类 {
//    public static void main(String[] args) {
//        B b = new B();
//        //调用方法，匿名实现接口中的方法
//        b.exec(new A() {
//            @Override
//            public Object callback() {
//                return "匿名实现";
//            }
//        });
//
//    }
//}
//
//interface A {
//    Object callback();
//}
//
//class B {
//    //成员方法
//    public Object exec(A a) {
//        return a.callback();
//    }
//}