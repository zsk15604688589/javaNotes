# 第三章 项目

## 3.1 需求

+ CRUD:添加；修改；删除；显示
+ 把数据存储在数组中
+ 存储的内容就是基本类型

## 3.2 数组

+ 特点：一组类型相同的数据
+ 数组的长度一旦确定就不能修改
+ 数组中的元素下标从零开始

### 3.2.1 数组案例

```java
 package com.holo.www;

public class TestDemo {
    public static void main(String[] args) {
        //创建数组
        int[] array = new int[3];
        //按照下标的位置添加即可
        array[0] = 100;
        array[1] = 200;

        //更新：就是替换下标位置的参数
        array[0] = 500;

        //删除：就是把制定位置的数据还原为默认值
        array[1] = 0;
    }
}
```

### 3.2.2 获取数组中的元素

```java
public class TestDemo {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        
        //循环获取元素
        System.out.println("数组长度:"+ array.length);
        
        //获取元素 
        for (int index = 0;index< array.length;index++){
            System.out.println(array[index]);
        }
    }
    
}
```

### 3.2.3 接收控制台数据

```java
public class TestDemo {
    public static void main(String[] args) {
        //接收控制台的输入数据
        Scanner scanner = new Scanner(System.in);
        //提示信息
        System.out.println("请输入一个数字：");
        int i = scanner.nextInt();
        System.out.println("i"+i);
    }
}
```



## 3.3 完成项目功能--第一版

### 3.3.1 搭建开发环境

```java
public class TestDemo {
    public static void main(String[] args) {
        //创建控制台对象
        Scanner scanner = new Scanner(System.in);
        //创建一个数组，存储数据
        int[] array = new int[5];

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
                    System.out.println("添加");
                    break;
                case 2:
                    System.out.println("显示");
                    break;
                case 3:
                    System.out.println("删除");
                    break;
                case 4:
                    System.out.println("更改");
                    break;
                case 5:
                    System.out.println("退出");
                    break;
            }
        }while (flag);
    }
}
```



### 3.3.2 功能实现

```java
public class TestDemo {
    public static void main(String[] args) {
        //创建控制台对象
        Scanner scanner = new Scanner(System.in);
        //创建一个数组，存储数据
        int[] array = new int[5];

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
                    //通过循环获取一个空位置
                    for (int index = 0; index < array.length; index++){
                        if (array[index]==0){
                            //提示用户添加一个数据
                            System.out.println("请输入一个数字");
                            array[index] = scanner.nextInt();
                            System.out.println("添加成功");
                            //跳出循环体
                            break;
                        }
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
                    //循环查找
                    for (int index = 0;index < array.length; index++){
                        if (array[index] == el){
                            array[index] = 0;
                            System.out.println("删除成功");
                            //跳出循环体
                            break;
                        }
                    }
                    break;
                case 4:
                    //提示
                    System.out.println("请输入一个需要删除的数字");
                    int el1 = scanner.nextInt();
                    //循环查找
                    for (int index = 0; index < array.length;index++){
                        if (array[index]==el1){
                            System.out.println("请输入一个新的数字");
                            array[index]=scanner.nextInt();
                            System.out.println("更新成功");
                            //跳出循环体
                            break;
                        }
                    }
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }while (flag);
    }
}
```



## 3.4 第二版 优化

```java	
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
```

