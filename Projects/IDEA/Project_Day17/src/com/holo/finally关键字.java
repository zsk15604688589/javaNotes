///*
// * Copyright 2022 tu.cn All right reserved. This software is the
// * confidential and proprietary information of tu.cn ("Confidential
// * Information"). You shall not disclose such Confidential Information and shall
// * use it only in accordance with the terms of the license agreement you entered
// * into with Tu.cn
// */
//package com.holo;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
///**
// * @author Holo
// * @date 2022/2/9 19:40
// */
//public class finally关键字 {
//    public static void main(String[] args) {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("必须执行的代码");
//        }
//    }
//}