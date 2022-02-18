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
 * @date 2022/1/13 13:44
 */
public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        student.show();
    }
}

class Student {
    public void show() {
        System.out.println("show-method");
        this.save();
    }

    public void save() {
        System.out.println("save-method");
    }
}