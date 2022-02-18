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
// * @date 7/2/2022 下午4:48
// */
//public class 动态创建二维数组 {
//    public static void main(String[] args) {
//        //动态创建二维数组:2行3列
//        int[] array[] = new int[2][3];
//        //添加元素
//        array[0][0]=1;
//        array[0][1]=2;
//        array[0][2]=3;
//
//        array[1][0]=4;
//        array[1][1]=5;
//        array[1][2]=6;
//
//        //通过嵌套循环获取元素
//        for (int row = 0; row < array.length; row++) {
//            for (int column = 0; column < array[row].length; column++) {
//                System.out.println("array["+row+"]["+column+"]="+array[row][column]);
//            }
//        }
//    }
//}