package com.holo;

import java.lang.ref.SoftReference;

/**
 * @author Holo
 * @date 2022/2/21 20:16
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        //强引用
        String str = new String("abc");
        //软引用
        String str1 = new String("ABC");
        SoftReference<String> softReference = new SoftReference<>(str1);
    }
}