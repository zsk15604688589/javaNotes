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
// * @date 2022/1/21 23:51
// */
//public class 静态内部类 {
//    public static void main(String[] args) {
//        //不需要创建外部对象，直接创建内部对象即可
//        A.B b = new A.B();
//        b.methodB();
//        //可以直接调用静态方法
//        System.out.println(A.B.i);
//    }
//}
//
//class A {
//    //静态方法
//    public static void methodA() {
//        System.out.println("A-method");
//    }
//
//    static class B {//内部类
//        public static int i = 100;
//
//        public void methodB() {
//            System.out.println("B-method");
//            //可以调用外部的成员方法
//            methodA();
//        }
//    }
//}