package com.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Holo
 * @date 2022/2/19 0:12
 */
public class DemoTest10 {
    @Test
    public void test1() {
        Map<Object, String> map = new HashMap<>();
        map.put(null, "abc");
        Hashtable<Object, String> hashtable = new Hashtable<>();
//        hashtable.put(null, "abc");
    }
}