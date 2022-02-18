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
// * @date 2022/2/8 16:38
// */
//public class SelectionSort {
//    public static void main(String[] args) {
//        //创建数组
//        int[] array = {3, 10, 6, 2, 5, 1};
//        //循环比较:选择排序的方式
//        for (int i = 0; i < array.length; i++) {
//            //设置一个最小的下标值,获取该元素
//            int min = i;
//            //循环获取最小的元素
//            for (int j = i + 1; j < array.length; j++) {
//                //判断比较的结果
//                if (array[j] < array[min]) {
//                    //更换最小的元素对应的下标
//                    min = j;
//                }
//            }
//            //找到最小的元素后交换位置
//            if (min != i) {
//                int temp = array[i];
//                array[i] = array[min];
//                array[min] = temp;
//            }
//        }
//        //输出排序后的元素
//        for (int index = 0; index < array.length; index++) {
//            System.out.println(array[index]);
//        }
//    }
//}