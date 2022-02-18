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
 * @date 2022/1/11 14:31
 */
public class Demo5 {
    public static void main(String[] args) {
    sum(1,2);
}

    //因为没有重载，所以增加了记忆方法的困难
    public static double sum(int i, double n) {
        return i+n;
    }
    public static double sum(int i, int n) {
        return i+n;
    }
    public static long sum(long i, int n) {
        return i+n;
    }
}