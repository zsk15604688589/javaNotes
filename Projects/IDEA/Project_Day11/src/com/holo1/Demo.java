//package com.holo1;
//
//public class Demo {
//
//    public static void main(String[] args) {
//        Student student = new Student();
//        //可以直接调用父类对象的方法
//        student.setAge(11);
//        System.out.println(student.getAge());
//    }
//}
//
//class Student extends Person {
//    private int sid;
//
//    public int getSid() {
//        return sid;
//    }
//
//    public void setSid(int sid) {
//        this.sid = sid;
//    }
//}
//
//class User extends Person {
//    private int uid;
//
//    public int getUid() {
//        return uid;
//    }
//
//    public void setUid(int uid) {
//        this.uid = uid;
//    }
//}
//
//class Person {
//    private String username;
//    private String sex;
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
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
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
//}