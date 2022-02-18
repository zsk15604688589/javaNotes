package com.test;

import com.holo.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Holo
 * @date 2022/2/17 18:10
 */
public class TestDemo1 {

    @Test
    public void test1() {
        //创建对象
        Person person1 = new Person("小朱", 20);
        Person person2 = new Person("小任", 21);
        Person person3 = new Person("小李", 22);

        //创建集合
        Set set = new TreeSet();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        System.out.println(set);
        //[Person{username='小朱', age=20}, Person{username='小任', age=21}, Person{username='小李', age=22}]
    }

    @Test
    public void test2() {
        //创建对象
        Person person1 = new Person("小朱", 20);
        Person person2 = new Person("小任", 21);
        Person person3 = new Person("小李", 22);

        //创建集合
        Set set = new TreeSet(new Comparator() {//需要对元素进行排序的时候在匿名实现
            @Override
            public int compare(Object o1, Object o2) {
                return ((Person) o1).getAge() - ((Person) o2).getAge();
            }
        });
        set.add(person1);
        set.add(person2);
        set.add(person3);
        System.out.println(set);
        //[Person{username='小朱', age=20}, Person{username='小任', age=21}, Person{username='小李', age=22}]
    }

    @Test
    public void test3() {//匿名实现
        //创建对象
        Person person1 = new Person("小朱", 20);
        Person person2 = new Person("小任", 21);
        Person person3 = new Person("小李", 22);

        //创建集合
        Set set = new TreeSet(new Comparator() {//需要对元素进行排序的时候在匿名实现
            @Override
            public int compare(Object o1, Object o2) {
                return ((Person) o1).getAge() - ((Person) o2).getAge();
            }
        });
        set.add(person1);
        set.add(person2);
        set.add(person3);
        System.out.println(set);
        //[Person{username='小朱', age=20}, Person{username='小任', age=21}, Person{username='小李', age=22}]
    }

    @Test
    public void test4() {//lambda函数实现
        //创建对象
        Person person1 = new Person("小朱", 20);
        Person person2 = new Person("小任", 21);
        Person person3 = new Person("小李", 22);
        //使用lambda函数的方式
        Comparator comparator = (o1, o2) -> ((Person) o2).getAge() - ((Person) o1).getAge();
        Set set = new TreeSet(comparator);
        set.add(person1);
        set.add(person2);
        set.add(person3);
        System.out.println(set);
        //[Person{username='小李', age=22}, Person{username='小任', age=21}, Person{username='小朱', age=20}]
    }


}