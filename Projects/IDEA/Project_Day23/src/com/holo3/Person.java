package com.holo3;

/**
 * @author Holo
 * @date 2022/2/19 0:05
 */
public class Person<T1,T2> {
    private T1 username;
    private T2 age;

    public T1 getUsername() {
        return username;
    }

    public void setUsername(T1 username) {
        this.username = username;
    }

    public T2 getAge() {
        return age;
    }

    public void setAge(T2 age) {
        this.age = age;
    }
}