/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo;

public class Demo3 {
    public static void main(String[] args) {
        int sum = method(1, 2);
        System.out.println(sum);
    }

    public static int method(int i,int n) {
        return i+n;
    }
}