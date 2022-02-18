package com.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Holo
 * @date 2022/2/18 23:09
 */
public class DemoTest5 {

    @Test
    public void test1() {
        List list = Arrays.asList(1, 2, 3, 4, "abc");
        //类型转换
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int next = (int) iterator.next();
        }
    }

    @Test
    public void test2() {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, "abcd");
    }
}