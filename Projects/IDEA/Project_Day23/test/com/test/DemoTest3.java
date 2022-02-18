package com.test;

import org.junit.Test;

import java.util.*;

/**
 * @author Holo
 * @date 2022/2/18 22:06
 */
public class DemoTest3 {
    @Test
    public void Test1() {
        List list = new ArrayList();
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);
        //输出:[3, 2, 1]
        //可以使用工具类排序
        Collections.sort(list);
        System.out.println(list);
        //输出:[1, 2, 3]
    }

    @Test
    public void test2() {
        Set set = new HashSet();
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(3223);
        set.add(1133);
        set.add(1231);
        System.out.println(set);
        //无序，不重复
        //[1, 2, 3, 3223, 1133, 1231]

        //可以使用工具类排序
        //可以把set添加list中
        List list = new ArrayList(set);
        Collections.sort(list);
        System.out.println(list);
        //[1, 2, 3, 1133, 1231, 3223]
    }

    @Test
    public void test3() {
        List list = new ArrayList();
        list.add("java");
        list.add("scala");
        list.add("python");
        System.out.println(list);
        //输出：[java, scala, python]

        //未排序，便使用二分查找
        int index = Collections.binarySearch(list, "python");
        System.out.println(index);
        //输出：-2
        //排序
        Collections.sort(list);
        System.out.println(list);
        //[java, python, scala]

        //获取元素对应的下标
        int index1 = Collections.binarySearch(list, "python");
        System.out.println(index1);
        //输出:1
    }

    @Test
    public void test4() {
        List list = new ArrayList();
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);
        //[3, 1, 2]
        //可以使用工具类逆序
        Collections.reverse(list);
        System.out.println(list);
        //[2, 1, 3]
    }
}