//package com.holo;
//
//public class 调用父类的2个参数的构造方法 {
//
//    public static void main(String[] args) {
//        //创建子类对象
//        Son son = new Son();
//    }
//}
//
//class Father {
//    public Father() {
//        System.out.println("父类的无参数构造方法");
//    }
//    public Father(int i){
//        System.out.println("父类的1参数构造方法");
//    }
//    public Father(int i,int n){
//        System.out.println("父类的2参数构造方法");
//    }
//}
//
//class Son extends Father {
//    public Son() {
//        super(1,2);
//        System.out.println("子类的无参数构造方法");
//    }
//}
