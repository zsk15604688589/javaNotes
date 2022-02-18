package com.holo;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo2 {
    public static void main(String[] args) {
        //创建控制台对象
        Scanner scanner = new Scanner(System.in);
        //创建一个数组，存储数据
        int[] array = new int[3];

        //为了跳出多分支创建一个布尔类型
        boolean flag = true;

        //提示信息
        System.out.println("1表示添加；2表示显示；3表示删除；4表示更改;5退出");
        //使用do-while
        do{
            //创建key
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    //创建一个变量：判断是否满了
                    boolean full = true;
                    //通过循环获取一个空位置
                    for (int index = 0; index < array.length; index++){
                        if (array[index]==0){
                            full = false;
                            //提示用户添加一个数据
                            System.out.println("请输入一个数字");
                            array[index] = scanner.nextInt();
                            System.out.println("添加成功");
                            //跳出循环体
                            break;
                        }
                    }
                    if (full){
                        System.out.println("已经加满了");
                    }
                    break;
                case 2:
                    for (int index = 0;index < array.length;index++){
                        int element = array[index];
                        if(element!=0){
                            System.out.println(element);
                        }
                    }
                    break;
                case 3:
                    //提示
                    System.out.println("请输入一个需要删除的数字");
                    int el = scanner.nextInt();
                    //是否能找到元素的一个标识
                    boolean f = true;
                    //循环查找
                    for (int index = 0;index < array.length; index++){
                        if (array[index] == el){
                            f = false;
                            array[index] = 0;
                            System.out.println("删除成功");
                            //跳出循环体
                            break;
                        }
                    }
                    if (f){
                        System.out.println("查无此数据，请重新输入");
                    }
                    break;
                case 4:
                    //提示
                    System.out.println("请输入一个需要删除的数字");
                    int el1 = scanner.nextInt();
                    boolean ff = true;
                    //循环查找
                    for (int index = 0; index < array.length;index++){
                        if (array[index]==el1){
                            ff = false;
                            System.out.println("请输入一个新的数字");
                            array[index]=scanner.nextInt();
                            System.out.println("更新成功");
                            //跳出循环体
                            break;
                        }
                    }
                    //判断
                    if (ff) {
                        System.out.println("查无此数据，请重新输入");
                    }
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }while (flag);
    }
}