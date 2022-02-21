package com.holo;

/**
 * @author Holo
 * @date 2022/2/21 20:00
 */
public class Demo0 {
    public static void main(String[] args) throws Exception {
        Person newInstance = (Person) Class.forName("com.holo.Person").newInstance();
        System.out.println(newInstance.getName());
        //输出:Leon
    }
}

class Person {
    private String name = "Leon";
    private String age = "boy";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}