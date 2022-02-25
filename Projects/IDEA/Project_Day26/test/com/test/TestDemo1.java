package com.test;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Holo
 * @date 2022/2/23 17:24
 */
public class TestDemo1 {

    @Test
    public void test1() {
        //读取文件
        File file = new File("resources/test1.txt");
        //File file = new File("resources/","test1.txt")
        //判断文件是否存在
        if (file.exists()) {
            System.out.println("存在");
        } else {
            System.out.println("不能存在");
        }
    }

    @Test
    public void test2() {
        File file = new File("resources/test2.txt");
        try {
            //创建文件
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        File file = new File("resources/directory1");
        File file1 = new File("resources/directory2/test1");
        //创建目录
        file.mkdir();
        file1.mkdirs();
    }

    @Test
    public void test4() {
        File file = new File("resources");
        //获取所有文件
        File[] files = file.listFiles();
        //判断获取的是目录还是文件
        for (File file1 : files) {
            if (file1.isFile()) {
            }
            if (file1.isDirectory()) {
            }
        }
    }

}