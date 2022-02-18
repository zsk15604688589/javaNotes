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
// * @date 2022/2/8 16:47
// */
//public class BinarySearch {
//    public static void main(String[] args) {
//        //创建数组
//        int[] array = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        //使用二分查找
//        int index = binarySearch(array, 20);
//        System.out.println(index);
//    }
//
//    //获取下标的值
//    public static int binarySearch(int[] array, int value) {
//        //开始的下标
//        int begin = 0;
//        //结束的下标
//        int end = array.length - 1;
//        //循环
//        while (begin <= end) {
//            //折半
//            int mid = (begin + end) / 2;
//            //判断
//            if (value == array[mid]) {
//                return mid;
//            } else if (value > array[mid]) {//数据在后一半
//                //开始的下标变化
//                begin = mid + 1;
//            } else if (value < array[mid]) {//数据在前一半
//                //结束的下标变化
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//}