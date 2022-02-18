package com.holo;

public class Demo {
    public static void main(String[] args) {
        //获取标识及对应的数字
        String message = Msg.DEL.getMessage();
        Integer flag = Msg.SHOW.getFlag();
        //显示
        System.out.println(message);
        System.out.println(flag);
    }
}