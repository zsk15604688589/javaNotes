package com.test;

import com.holo3.Person;
import org.junit.Test;

/**
 * @author Holo
 * @date 2022/2/19 0:07
 */
public class DemoTest9 {
    @Test
    public void test1(){
        Person<String,Integer> person = new Person<>();
        //添加数据
        person.setAge(12);

    }
}