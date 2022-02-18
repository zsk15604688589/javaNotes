package com.holo;

public class DataBaseHolo {
    //构造方法私有化
    private DataBaseHolo(){}
    //创建对象
    private static DataBaseHolo dataBaseHolo = new DataBaseHolo();

    //创建方法
    public static DataBaseHolo getInstance(){
        return dataBaseHolo;
    }
    //创建数据库
    private Student[] students = new Student[3];
    //返回数组的方法:成员方法
    public Student[] getStudents(){
        return students;
    }
}