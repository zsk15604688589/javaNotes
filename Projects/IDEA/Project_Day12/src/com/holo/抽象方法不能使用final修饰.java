package com.holo;
public class 抽象方法不能使用final修饰 {
    public static void main(String[] args) {

    }
}
abstract class Father{
    //抽象方法
    public final abstract void show();
}
class Son extends Father{
    @Override
    public void show() {
        System.out.println("必须实现抽象方法");
    }
}