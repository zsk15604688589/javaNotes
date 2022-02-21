package com.holo;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @author Holo
 * @date 2022/2/21 20:33
 */
public class Demo3 {
    public static void main(String[] args) {
        String str = new String("abc");
        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        //创建一个虚引用
        PhantomReference phan = new PhantomReference(str, queue);
    }
}