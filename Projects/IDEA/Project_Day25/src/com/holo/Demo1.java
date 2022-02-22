package com.holo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author Holo
 * @date 2022/2/22 17:09
 */
public class Demo1 {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("file/test.txt")) {
            //文件的复制
            int temp = 0;
            while ((temp = reader.read()) > 0) {
                System.out.print((char) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}