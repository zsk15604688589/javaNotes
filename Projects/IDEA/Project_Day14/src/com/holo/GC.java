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
// * @date 2022/1/21 22:16
// */
//public class GC {
//    public static void main(String[] args) {
//        //创建对象
//        Person person = new Person();
//        //不使用了
//        person = null;
//        //通知垃圾回收器
//        System.gc();
//    }
//}
//class Person{
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("垃圾回收前被调用了");
//    }
//}