package com.holo;

import java.io.FileWriter;
import java.io.Writer;

/**
 * @author Holo
 * @date 2022/2/22 17:16
 */
public class Demo2 {
    public static void main(String[] args) {
        //以覆盖的方式
        try (Writer writer = new FileWriter("file/WriteFile.txt");) {
            writer.write("祝你虎年大吉嗷!");
            writer.write("\n");
            writer.write("有你好果汁吃的");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}