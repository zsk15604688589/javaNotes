package com.test;

import org.junit.Test;

import java.io.*;

/**
 * @author Holo
 * @date 2022/2/21 22:28
 */
public class DemoTest {
    @Test
    public void test1() throws Exception {
        //创建输入字节流
        FileInputStream inputStream = new FileInputStream("D:\\$Study\\中科浩成\\java\\Projects\\IDEA\\Project_Day24\\test\\com\\test\\data.txt");
        //读取
        int temp = 0;
        while ((temp = inputStream.read()) > 0) {
            System.out.print((char) temp);
        }
    }

    @Test
    public void test2() throws Exception {
        OutputStream outputStream = null;
        try {
            //创建输出字节流
            outputStream = new FileOutputStream("D:\\$Study\\中科浩成\\java\\Projects\\IDEA\\Project_Day24\\test\\com\\test\\data.txt");
            outputStream.write(1);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}