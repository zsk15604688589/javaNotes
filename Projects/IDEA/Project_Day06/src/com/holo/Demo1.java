/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo;

public class Demo1 {
    public static void main(String[] args) {
        method(1);
    }
    //自定义的一个方法
    public static void method(int key) {
        switch (key){
            case 1:
                System.out.println("执行了第一个语句");
            break;
            case 2:
                System.out.println("执行了第二个语句");
                break;
            default:
                System.out.println("执行了其他语句");
                break;
        }
    }
}