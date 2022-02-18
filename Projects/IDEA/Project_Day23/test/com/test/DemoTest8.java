package com.test;

import com.holo2.Person;
import org.junit.Test;

/**
 * @author Holo
 * @date 2022/2/19 0:02
 */
public class DemoTest8 {
    @Test
    public void test1(){
        Person<String> person = new Person<>();
        //添加数据
        person.setAge("12");
    }
}