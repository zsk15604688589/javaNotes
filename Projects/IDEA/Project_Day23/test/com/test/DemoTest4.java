package com.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Holo
 * @date 2022/2/18 22:56
 */
public class DemoTest4 {

    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //输出
        list.forEach(System.out::print);
    }

    @Test
    public void test2() {
        //不允许修改元素
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.add(100);
        //输出
        list.forEach(System.out::print);
        //异常：java.lang.UnsupportedOperationException
    }

    @Test
    public void test3() {
        //不允许修改元素
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.remove(100);
        //输出
        list.forEach(System.out::print);
        //异常：java.lang.UnsupportedOperationException
    }

    @Test
    public void test4() {
        //不允许修改元素
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //结合转为数组
        Object[] array = list.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            //1
            //2
            //3
            //4
            //5
        }
    }
}