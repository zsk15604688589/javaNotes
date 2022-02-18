package com.test;

import org.junit.Test;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author Holo
 * @date 2022/2/19 0:18
 */
public class DemoTest11 {
    @Test
    public void test1() {
        Properties properties = new Properties();
        //添加元素
        properties.put(10086, "老朱");//key和value都是引用类型（Object）
        properties.setProperty("10010", "老杨");//key和value必须是字符串类型
        //遍历
        Object obj = properties.get(10086);//key和返回的类型都是引用类型
        String property = properties.getProperty("10010");//key和返回的类型都是String
        System.out.println(obj);//输出：老朱
        System.out.println(property);//输出：老杨
    }

    @Test
    public void test2() throws Exception {
        Properties properties = new Properties();
        //加载元素
        properties.load(new FileReader("D:\\fz\\中科浩成\\java\\Projects\\IDEA\\Project_Day23\\test\\com\\test\\data.properties"));
        //读取文件内容，就是按照key/value的方式读取
        String name = properties.getProperty("name");
        String sex = properties.getProperty("sex");
        String age = properties.getProperty("age");
        System.out.println(name + "\t" + sex + "\t" + age);
    }
}

