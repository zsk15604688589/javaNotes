package com.holo;

import java.lang.ref.WeakReference;

/**
 * @author Holo
 * @date 2022/2/21 20:24
 */
public class Demo2 {
    public static void main(String[] args) {
        //弱引用
        String str1 = new String("abc");
        WeakReference<String> weakReference = new WeakReference<>(str1);
        //转为强引用
        String s = weakReference.get();
    }
}