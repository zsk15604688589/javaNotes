package com.holo;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Scanner;

//public class TestDemo {
//    public static void main(String[] args) {
//        int[] array = new int[3];
//        array[0] = 100;
//        array[1] = 200;
//        array[2] = 300;
//
//        //循环获取元素
//        System.out.println("数组长度:"+ array.length);
//
//        //获取元素
//        for (int index = 0;index< array.length;index++){
//            System.out.println(array[index]);
//        }
//    }
//
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        //创建控制台对象
//        Scanner scanner = new Scanner(System.in);
//        //创建一个数组，存储数据
//        int[] array = new int[5];
//
//        //为了跳出多分支创建一个布尔类型
//        boolean flag = true;
//
//        //提示信息
//        System.out.println("1表示添加；2表示显示；3表示删除；4表示更改;5退出");
//        //使用do-while
//        do{
//            //创建key
//            int key = scanner.nextInt();
//            switch (key) {
//                case 1:
//                    System.out.println("添加");
//                    break;
//                case 2:
//                    System.out.println("显示");
//                    break;
//                case 3:
//                    System.out.println("删除");
//                    break;
//                case 4:
//                    System.out.println("更改");
//                    break;
//                case 5:
//                    System.out.println("退出");
//                    break;
//            }
//        }while (flag);
//    }
//}


//public class TestDemo {
//    public static void main(String[] args) {
//        //创建控制台对象
//        Scanner scanner = new Scanner(System.in);
//        //创建一个数组，存储数据
//        int[] array = new int[5];
//
//        //为了跳出多分支创建一个布尔类型
//        boolean flag = true;
//
//        //提示信息
//        System.out.println("1表示添加；2表示显示；3表示删除；4表示更改;5退出");
//        //使用do-while
//        do{
//            //创建key
//            int key = scanner.nextInt();
//            switch (key) {
//                case 1:
//                    //通过循环获取一个空位置
//                    for (int index = 0; index < array.length; index++){
//                        if (array[index]==0){
//                            //提示用户添加一个数据
//                            System.out.println("请输入一个数字");
//                            array[index] = scanner.nextInt();
//                            System.out.println("添加成功");
//                            //跳出循环体
//                            break;
//                        }
//                    }
//                    break;
//                case 2:
//                    for (int index = 0;index < array.length;index++){
//                        int element = array[index];
//                        if(element!=0){
//                            System.out.println(element);
//                        }
//                    }
//                    break;
//                case 3:
//                    //提示
//                    System.out.println("请输入一个需要删除的数字");
//                    int el = scanner.nextInt();
//                    //循环查找
//                    for (int index = 0;index < array.length; index++){
//                        if (array[index] == el){
//                            array[index] = 0;
//                            System.out.println("删除成功");
//                            //跳出循环体
//                            break;
//                        }
//                    }
//                    break;
//                case 4:
//                    //提示
//                    System.out.println("请输入一个需要删除的数字");
//                    int el1 = scanner.nextInt();
//                    //循环查找
//                    for (int index = 0; index < array.length;index++){
//                        if (array[index]==el1){
//                            System.out.println("请输入一个新的数字");
//                            array[index]=scanner.nextInt();
//                            System.out.println("更新成功");
//                            //跳出循环体
//                            break;
//                        }
//                    }
//                    break;
//                case 5:
//                    flag = false;
//                    break;
//            }
//        }while (flag);
//    }
//}

public class TestDemo{
    public static void main(String[] args) {
        do{
            System.out.println("hello");
        }while(true);
    }
}

