/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo;

import java.util.Scanner;

/**
 * @author Holo
 * @date 2022/1/11 15:10
 */
public class Demo9 {
    public static void main(String[] args) {
        //控制台对象
        Scanner scanner = new Scanner(System.in);
        //跳出循环体的标识
        boolean flag = true;
        //提示信息
        System.out.println("1.添加；2.显示；3.删除;4.更新;5.退出");
        //循环
        do {
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    System.out.println("请输入一个数字");
                    save(scanner.nextInt());
                    break;
                case 2:
                    findAll();
                    break;
                case 3:
                    System.out.println("请输入一个要删除的数字");
                    delete(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("请输入需要更新的数字");
                    int i = scanner.nextInt();
                    System.out.println("请输入需要更新的新数字");
                    int n = scanner.nextInt();
                    update(i, n);
                    break;
            }
        } while (flag);

    }

    //创建数组
    static int[] array = new int[3];

    //获取数据下标
    public static int findByIndex(int element) {
        //通过判断element的值决定查找空位置还是对应元素的下标
        for (int index = 0; index < array.length; index++) {
            if (element == 0) {//获取空位置
                if (array[index] == 0) {
                    return index;
                }
            } else {//查询对应元素的下标
                if (array[index] == element) {
                    return index;
                }
            }
        }
        return -1;
    }

    //添加数据
    public static void save(int el) {
        //获取一个保存元素的空位置
        int index = findByIndex(0);
        //判断下标
        if (index != -1) {
            array[index] = el;
            System.out.println("操作成功");
        } else {
            System.out.println("满了");
        }
    }

    //显示数据
    public static void findAll() {
        for (int index = 0; index < array.length; index++) {
            int i = array[index];
            if (i != 0) {
                System.out.println(i);
            }
        }
    }

    //删除数据
    public static void delete(int el) {
        //根据元素获取下标
        int index = findByIndex(el);
        //判断
        if (index != -1) {
            array[index] = 0;
            System.out.println("操作成功");
        } else {
            System.out.println("查无此数据，请重新输入");
        }
    }

    //更新数据
    public static void update(int el, int taget) {
        //根据元素获取下标
        int index = findByIndex(el);
        //判断
        if (index != -1) {
            array[index] = taget;
            System.out.println("操作成功");
        } else {
            System.out.println("查无此数据，请重新输入");
        }
    }
}