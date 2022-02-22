package com.test;

import org.junit.Test;

import java.io.*;

/**
 * @author Holo
 * @date 2022/2/22 19:07
 */
public class TestDemo1 {


    @Test//序列化
    public static void seria() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file/objectOut.data"));) {
            //创建对象
            Person person = new Person();
            person.setName("Leon");
            //写入文件
            outputStream.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test//反序列化
    public static void unseria() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file/objectOut.data"))) {
        //读取对象
            Person person =  (Person) objectInputStream.readObject();
            System.out.println(person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}