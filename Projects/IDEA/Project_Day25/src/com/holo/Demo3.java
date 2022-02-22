package com.holo;

import java.io.*;

/**
 * @author Holo
 * @date 2022/2/22 19:26
 */
public class Demo3 {
    public static void main(String[] args) {
        seria();
        unseria();
        //输出Leon
    }

    //序列化
    public static void seria() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file/objectOut.data"));) {
            //创建对象
            Person person = new Person();
            person.setName("Leon");
            person.setAge(20);
            person.setPassword("KAI20020817");
            //写入文件
            outputStream.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //反序列化
    public static void unseria() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file/objectOut.data"))) {
            //读取对象
            Person person = (Person) objectInputStream.readObject();
            System.out.println(person.getName() + "\t" + person.getAge() + "\t" + person.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    //添加一个版本号的属性
    private static final long serialVersionUID = 1L;
    private String name;
    private String sex;
    private Integer age;
    private transient String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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