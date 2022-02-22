package com.holo;

import java.io.*;

/**
 * @author Holo
 * @date 2022/2/22 16:50
 */
public class Demo0 {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("file/test.txt");
             OutputStream outputStream = new FileOutputStream("file/copy1.txt");) {
            //文件的复制
            int temp = 0;
            while ((temp = inputStream.read()) > 0) {
//                System.out.print((char)temp);
                outputStream.write(temp);
            }
            //推荐显式的编写此方法
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}