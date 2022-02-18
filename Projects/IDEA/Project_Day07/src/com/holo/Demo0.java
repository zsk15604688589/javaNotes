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
 * @date 2022/1/12 13:31
 */
public class Demo0 {
    public static void main(String[] args) {
        //创建对象,把堆内存中的这个对象的内存地址赋值给参数student
        Student student = new Student();
        student.id = 031;
        student.name = "朱少楷";
        student.sex = "男";
        student.address = "鹤岗";
        student.age = 20;
//        System.out.println("内存地址："+student);
    }
}