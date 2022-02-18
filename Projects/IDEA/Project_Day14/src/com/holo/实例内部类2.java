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
//public class 实例内部类2 {
//    public static void main(String[] args) {
//        A.B b = new A().new B();
//        b.methodB();
//    }
//}
//class A{
//    //成员方法
//    public void methodA(){
//        System.out.println("A-method");
//    }
//    class B{//内部类
//        public void methodB(){
//            System.out.println("B-method");
//            //可以调用外部的成员方法
//            methodA();
//        }
//    }
//}