package com.holo;

public interface StudentManager {
    public abstract void save();
    public static final int ABC = 100;
    //实现的方法：使用default关键字就是要覆盖的
    default void delete(){
        System.out.println("这是一个删除方法");
    }
}

//public interface StudentManager {
//    void save();
//    int ABC = 100;
//}