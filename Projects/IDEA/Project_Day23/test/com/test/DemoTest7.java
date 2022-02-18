package com.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Holo
 * @date 2022/2/18 23:51
 */
public class DemoTest7 {
    @Test
    public void test1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1001, "老朱");
        map.put(1002, "老任");
        map.put(1003, "老李");
    }

    @Test
    public void test2() {
        //创建集合
        List<Map<Integer, String>> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(10010, "老朱");
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(10086, "老任");
        //向集合中添加元素
        list.add(map);
        list.add(map1);
        System.out.println(list);
        //输出：[{10010=老朱}, {10086=老任}]
    }
}