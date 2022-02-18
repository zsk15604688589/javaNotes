/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo;


public class Demo4 {
    public static void main(String[] args) {
        int methodInt = methodInt(1,2);
    }

    //因为没有重载，所以增加了记忆方法的困难
    public static int methodInt(int i, int n) {
        return i+n;
    }
    public static long methodInt(long i, int n) {
        return i+n;
    }
    public static double methodInt(double i, int n) {
        return i+n;
    }
}