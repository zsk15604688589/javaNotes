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
 * @date 2022/1/22 0:22
 */
public class lambda函数实现 {
    public static void main(String[] args) {
        A a = ()->"lambda函数实现";
        //调用
        Object back = a.callBack();
        System.out.println(back);
    }
}
interface A{
    Object callBack();
}