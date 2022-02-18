/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo;

/**
 * @author Holo
 * @date 2022/1/11 14:54
 */
public class Demo8 {
    public static void main(String[] args) {
        int sum = rec(5);
        System.out.println(sum);
    }

    public static int rec(int n){
        if (n==1)
            return 1;
        return n+rec(n-1);
    }
}