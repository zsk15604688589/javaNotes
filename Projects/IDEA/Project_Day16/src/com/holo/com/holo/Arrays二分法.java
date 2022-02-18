/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo;

import java.util.Arrays;

/**
 * @author Holo
 * @date 2022/2/8 17:01
 */
public class Arrays二分法 {
    public static void main(String[] args) {
        //创建数组
        int[] array = {3,1,6,2,5};
        //查找元素对应的下标
        int index = Arrays.binarySearch(array, 20);
        System.out.println(index);
    }
}