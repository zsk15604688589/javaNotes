//package com.test;
//
//import com.holo.Person;
//import org.junit.Test;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;
//
///**
// * @author Holo
// * @date 2022/2/17 16:16
// */
//public class TestDemo {
//
//    @Test
//    public void test1() {
//        Set set = new HashSet();
//        //添加元素
//        set.add("a");
//        set.add("b");
//        set.add("c");
//
//        System.out.println(set);
//        //输出:[a, b, c]
//        //在添加一个a出现重复值，会去掉
//        set.add("a");
//        System.out.println(set);
//        //输出:[a, b, c]
//    }
//
//    @Test
//    public void test2() {
//        Set set = new HashSet();
//        //添加元素
//        String s1 = "abc";
//        String s2 = "abc";
//        //输出哈希码
//        System.out.println(s1.hashCode());//输出:96354
//        System.out.println(s2.hashCode());//输出:96354
//        //※注意：相同的对象有相同的哈希码，但是，相同的哈希码不一定是同一个对象
//        String s3 = new String("abc");
//        System.out.println(s3.hashCode());//输出:96354
//        //==比较的是地址
//        System.out.println(s3 == s1);     //输出:false
//    }
//
//    @Test
//    public void test3() {
//        Person person1 = new Person(10010, "张三");
//        Person person2 = new Person(10010, "张三");
//        Set set = new HashSet();
//        set.add(person1);
//        set.add(person2);
//
//        //查看哈希码
//        System.out.println("person1的哈希码:" + person1.hashCode());//输出:person1的哈希码:1334729950
//        System.out.println("person2的哈希码:" + person2.hashCode());//输出:person1的哈希码:1347137144
//
//        //输出集合
//        System.out.println(set);
//        //输出:[com.holo.Person@4f8e5cde, com.holo.Person@504bae78]
//
//
//    }
//
//    @Test
//    public void test4() {
//        Person person1 = new Person(10010, "张三");
//        Person person2 = new Person(10010, "李四");
//        Set set = new HashSet();
//        set.add(person1);
//        set.add(person2);
//
//        //查看哈希码
//        System.out.println("person1的哈希码:" + person1.hashCode());
//        //输出:person1的哈希码:1334729950
//        System.out.println("person2的哈希码:" + person2.hashCode());
//        //输出:person1的哈希码:1347137144
//
//        //输出集合
//        System.out.println(set);
//        //输出:[Person{id=10010, username='张三'}, Person{id=10010, username='李四'}]
//
//        ////判断是否为同一对象
//        System.out.println(person1.equals(person2));
//    }
//
//    @Test
//    public void test5() {
//        Person person1 = new Person(10010, "张三");
//        Person person2 = new Person(10010, "李四");
//        Set set = new HashSet();
//        set.add(person1);
//        set.add(person2);
//
//        //查看哈希码
//        System.out.println("person1的哈希码:" + person1.hashCode());
//        //输出:person1的哈希码:10010
//        System.out.println("person2的哈希码:" + person2.hashCode());
//        //输出:person1的哈希码:10010
//
//        //输出集合
//        System.out.println(set);
//        //输出:[Person{id=10010, username='张三'}, Person{id=10010, username='李四'}]
//
//        ////判断是否为同一对象
//        System.out.println(person1.equals(person2));
//        //输出:false
//    }
//
//
//    @Test
//    public void test6() {
//        Person person1 = new Person(10010, "张三");
//        Person person2 = new Person(10010, "张三");
//        Set set = new HashSet();
//        set.add(person1);
//        set.add(person2);
//
//        //查看哈希码
//        System.out.println("person1的哈希码:" + person1.hashCode());
//        //输出:person1的哈希码:10010
//        System.out.println("person2的哈希码:" + person2.hashCode());
//        //输出:person1的哈希码:10010
//
//        //输出集合
//        System.out.println(set);
//        //输出:[Person{id=10010, username='张三'}, Person{id=10010, username='李四'}]
//
//        ////判断是否为同一对象
//        System.out.println(person1.equals(person2));
//        //输出:false
//    }
//
//    @Test
//    public void test7() {
//        Person person1 = new Person(10010, "张三");
//        Person person2 = new Person(10010, "张三");
//        Set set = new HashSet();
//        set.add(person1);
//        set.add(person2);
//
//        //查看哈希码
//        System.out.println("person1的哈希码:" + person1.hashCode());
//        //输出:person1的哈希码:10010
//        System.out.println("person2的哈希码:" + person2.hashCode());
//        //输出:person1的哈希码:10010
//
//        //输出集合
//        System.out.println(set);
//        //输出:[Person{id=10010, username='张三'}]
//
//        ////判断是否为同一对象
//        System.out.println(person1.equals(person2));
//        //输出:true
//    }
//
//    @Test
//    public void test8() {
//        Person person1 = new Person(10010, "张三");
//        Person person2 = new Person(10010, "张三");
//        Person person3 = new Person(10010, "王五");
//        Set set = new HashSet();
//        set.add(person1);
//        set.add(person2);
//        set.add(person3);
//        //查看哈希码
//        System.out.println("person1的哈希码:" + person1.hashCode());
//        //输出:person1的哈希码:-764879
//        System.out.println("person2的哈希码:" + person2.hashCode());
//        //输出:person2的哈希码:-764879
//        System.out.println("person3的哈希码:" + person3.hashCode());
//        //输出:person3的哈希码:-927055
//
//        //输出集合
//        System.out.println(set);
//        //输出:[Person{id=10010, username='王五'}, Person{id=10010, username='张三'}]
//
//        ////判断是否为同一对象
//        System.out.println(person1.equals(person2));
//        //输出:true
//        System.out.println(person1.equals(person3));
//        //输出:false
//    }
//
//    @Test
//    public void test9(){
//        Set set = new TreeSet();
//        set.add(2);
//        set.add(5);
//        set.add(3);
//        set.add(3);
//        set.add(1);
//        System.out.println(set);
//        //输出:[1, 2, 3, 5]
//    }
//
//
//}