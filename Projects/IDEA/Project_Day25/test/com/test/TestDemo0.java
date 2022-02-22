package com.test;

import org.junit.Test;

import java.io.*;

/**
 * @author Holo
 * @date 2022/2/22 17:26
 */
public class TestDemo0 {

    @Test
    public void test1() {
        //以追加的方式
        try (Writer writer = new FileWriter("file/WriteFile.txt", true);) {
            writer.write("祝你虎年大吉嗷!");
            writer.write("\n");
            writer.write("有你好果汁吃的");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        try (Reader reader = new FileReader("file/test.txt");
             Writer writer = new FileWriter("file/copy2.txt")) {
            //临时变量
            int temp = 0;
            while ((temp = reader.read()) > 0) {
                writer.write(temp);
            }
            //刷新输出流
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        //复制
        try (InputStream inputStream = new FileInputStream("file/test.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
             OutputStream outputStream = new FileOutputStream("file/copy3.txt");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);) {
            //临时变量
            int temp = 0;
            while (((temp = bufferedInputStream.read()) > 0)) {
                bufferedOutputStream.write(temp);
            }
            bufferedOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() {
        //复制
        try (Reader reader = new FileReader("file/test.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             Writer writer = new FileWriter("file/copy4.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer);) {
            //临时变量
            int temp = 0;
            while (((temp = bufferedReader.read()) > 0)) {
                bufferedWriter.write(temp);
                bufferedWriter.flush();
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("success");
    }

    @Test
    public void test5() {
        //复制
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("file/test.txt")));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("file/copy5.txt")));) {
            //临时变量
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null) {
                bufferedWriter.write(temp);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test6() {
        try (OutputStream outputStream = new FileOutputStream("file/Print.txt");
             PrintStream printStream = new PrintStream(outputStream);){
            //设置输出的文件
            System.setOut(printStream);
            System.out.println("输出的文本");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}