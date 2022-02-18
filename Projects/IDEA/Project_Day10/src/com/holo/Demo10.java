//package com.holo;
//
//public class Demo10 {
//    public static void main(String[] args) {
//        Student student1 = Student.getInstance();
//        //可以通过单例对象调用成员方法了
//        student1.method();
//    }
//}
////单例模式
//class Student {
//    //创建一个私有的、静态的对象
//    private static Student student = new Student();
//
//    //私有化
//    private Student() {
//    }
//
//    //创建一个公有的、静态的、返回本类型
//    public synchronized static Student getInstance() {
//        return student;
//    }
//
//    //成员方法
//    public void method() {
//        System.out.println("成员方法");
//    }
//}