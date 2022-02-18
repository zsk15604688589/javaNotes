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
// * @date 2022/2/10 17:32
// */
//public class 比较 {
//    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = new String("abc");
//        String s3 = new String("abc");
//
//        //比较地址
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);
//        //因为,String已经重写了equals方法,进行了基本类型的值得比较
//        System.out.println(s1.equals(s2));
//    }
//}