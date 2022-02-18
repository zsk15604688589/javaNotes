//package com.holo;
//
//public class Demo9 {
//    public static void main(String[] args) {
//        Student student1 = Student.getInstance();
//
//    }
//}
//
////单例模式：懒汉式
//class Student {
//    //创建一个私有的、静态的对象
//    private static volatile Student student = null;
//
//    //私有化
//    private Student() {
//    }
//
//    //创建一个公有的、静态的、返回本类型
//    public synchronized static Student getInstance() {
//        if (student == null) {
//            student = new Student();
//        }
//        return student;
//    }
//
//    //成员方法
//    public void method() {
//        System.out.println("成员方法");
//    }
//}