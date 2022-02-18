///*
// * Copyright 2022 tu.cn All right reserved. This software is the
// * confidential and proprietary information of tu.cn ("Confidential
// * Information"). You shall not disclose such Confidential Information and shall
// * use it only in accordance with the terms of the license agreement you entered
// * into with Tu.cn
// */
//package com.holo;
//
///**
// * @author Holo
// * @date 2022/1/21 22:38
// */
//public class 比较引用类型 {
//    public static void main(String[] args) {
//        //创建对象
//        Monkey 六耳猕猴 = new Monkey();
//        六耳猕猴.setUsername("齐天大圣");
//        六耳猕猴.setAge(19);
//
//        //创建对象
//        Monkey 灵明石猴 = new Monkey();
//        灵明石猴.setUsername("齐天大圣");
//        灵明石猴.setAge(19);
//
//        //比较
//        System.out.println(六耳猕猴);
//        System.out.println(灵明石猴);
//        System.out.println(六耳猕猴.equals(灵明石猴));
//    }
//}
//
//class Monkey {
//    private String username;
//    private int age;
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public boolean equals(Object anObject) {
//        if (this == anObject) {
//            return true;
//        }
//        //判断是否为指定的类型
//        if (anObject instanceof Monkey) {
//            Monkey anObjectther = (Monkey) anObject;
//            //判断username和age
//            if (age == another.getAge() && username.equals(another.getUsername())) {
//                return true;
//            }
//        }
//        return false;
//    }
//}