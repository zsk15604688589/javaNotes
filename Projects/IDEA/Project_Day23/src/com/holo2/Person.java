package com.holo2;

/**
 * @author Holo
 * @date 2022/2/19 0:00
 */
public class Person<T> {
    private String username;
    private T age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}