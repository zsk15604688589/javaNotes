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
// * @date 2022/2/8 16:23
// */
//public class BubbleSort {
//    public static void main(String[] args) {
//        //创建数组
//        int[] array = {3, 1, 6, 2, 5};
//        //循环比较
//        for (int i = array.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                //判断
//                if (array[j] > array[j + 1]) {
//                    //必须使用一个临时变量保存一下j位置的元素
//                    int temp = array[j];
//                    //交换位置
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        //输出排序后的元素
//        for (int index = 0; index < array.length; index++) {
//            System.out.println(array[index]);
//        }
//    }
//}