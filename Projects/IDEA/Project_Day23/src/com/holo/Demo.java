package com.holo;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Holo
 * @date 2022/2/18 23:29
 */
public class Demo {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        //添加元素
        set.add(new Person("小朱", 20));
        set.add(new Person("小任", 19));
        set.add(new Person("小孙", 21));
        System.out.println(set);
        //降序输出
        //[Person{username='小孙', age=21}, Person{username='小朱', age=20}, Person{username='小任', age=19}]

    }
}