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
 * @date 2022/1/11 14:45
 */
public class Demo7 {
    public static void main(String[] args) {
        int sum = rec(5);
        System.out.println(sum);
    }

    /**
     * 5+rec(5-1)
     * 4+rec(4-1)
     * 3+rec(3-1)
     * 2+rec(2-1)
     * 1
     * */
    public static int rec(int i){
        if (i==1)
            return 1;
        return i+rec(i-1);
    }
}