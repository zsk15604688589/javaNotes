package com.test;

import org.junit.Test;

import java.util.*;

/**
 * @author Holo
 * @date 2022/2/18 20:53
 */
public class DemoTest {

    @Test
    public void test1() {
        Map map = new HashMap();
        map.put("1001", "小明");
        map.put("1002", "小亮");
        map.put("1001", "小李");
        System.out.println(map);
        //输出:{1002=小亮, 1001=小李}
    }

    @Test
    public void test2() {
        Map map = new HashMap();
        map.put("1001", "小明");
        map.put("1002", "小亮");
        map.put("1001", "小李");
        //遍历
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            //获取entry
            Map.Entry entry = (Map.Entry) iterator.next();
            //获取key和value
            System.out.println(entry.getKey() + "\t" + entry.getValue());
            //输出：
            //      1002	小亮
            //      1001	小李
        }
    }

    @Test
    public void test3() {
        Map map = new HashMap();
        map.put("1001", "小明");
        map.put("1002", "小亮");
        map.put("1001", "小李");

        //遍历
        Set set = map.keySet();
        Collection values = map.values();

        //底层就是迭代
        set.forEach(System.out::println);
        //1002
        //1001
        for (Object value : values) {
            System.out.println(value);
            //小亮
            //小李
        }
    }
}