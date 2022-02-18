package com.holo;

//枚举类
public enum Msg {
    DEL("删除", 1), SHOW("显示", 0);
    private String message;
    private Integer flag;

    //含参数的构造方法
    private Msg(String message, int flag) {
        this.message = message;
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public Integer getFlag() {
        return flag;
    }
}