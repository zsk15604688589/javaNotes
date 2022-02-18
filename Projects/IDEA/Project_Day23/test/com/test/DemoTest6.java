package com.test;

import com.holo1.Person;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Holo
 * @date 2022/2/18 23:44
 */
public class DemoTest6 {
    @Test
    public void test1() {
        Set<Person> set = new TreeSet<>((x, y) -> x.getAge() - y.getAge());
        //添加元素
        set.add(new Person("小朱", 20));
        set.add(new Person("小任", 19));
        set.add(new Person("小孙", 21));
        System.out.println(set);
        //升序输出
        //[Person{username='小任', age=19}, Person{username='小朱', age=20}, Person{username='小孙', age=21}]
    }


}