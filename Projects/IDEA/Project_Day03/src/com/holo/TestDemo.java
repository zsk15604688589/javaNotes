//package com.holo.www;
//
//import java.util.Arrays;
//
//
//public class TestDemo
//{
//    public static void main (String[] args)
//    {
//       //创建变量
//       int i = 10;
//
//       if (i>3 && i++>0){}
//
//       System.out.println(i);
//    }
//}



//public class TestDemo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        boolean op1 = 10>5;
//        boolean op2 = 10<5;
//
//        //输出
//        System.out.println("op1 = " + op1);
//        System.out.println("op2 = " + op2);
//
//        //短路与，逻辑与
//        System.out.println("op1&&op2 = " + (op1&&op2));
//        System.out.println("op1&op2 = " + (op1&op2));
//
//        //短路或，逻辑或
//        System.out.println("op1||op2 = " + (op1||op2));
//        System.out.println("op1|op2 = " + (op1|op2));
//
//        //取反
//        System.out.println("!op1 = " + !op1);
//
//        //异或
//        System.out.println("op1^op2 = " + (op1^op2));
//        System.out.println("op^|op1 = " + (op1^op1));
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        //创建变量
//        int i = 10;
//        //三元运算符
//        int n = i>30?1:-1;
//        System.out.println(n);
//
//        //三元运算符
//        boolean bo = i%3==0?true:false;
//        System.out.println(bo);
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        int age = 3;
//        if(age>0&&age<=5){
//            System.out.println("儿童");
//        }
//
//        if(age>5&&age<=10){
//            System.out.println("小学生");
//        }
//
//        if(age>10&&age<=18){
//            System.out.println("中学生");
//        }
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        int age = 3;
//        if(age>0&&age<=5){
//            System.out.println("儿童");
//        }else if(age>5&&age<=10){
//            System.out.println("小学生");
//        }else if(age>10&&age<=18){
//            System.out.println("中学生");
//        }else {
//            System.out.println("大学生");
//        }
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        int age = 3;
//        if(3%2==0){
//            System.out.println("偶数");
//        }else{
//            System.out.println("奇数");
//        }
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        int key = 1;
//        switch (key){
//            case 0:
//                System.out.println(0);
//                break;
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println(-1);
//                break;
//        }
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        int key = 1;
//        switch (key){
//            case 0:
//                System.out.println(0);
//            case 1:
//                System.out.println(1);
//            case 2:
//                System.out.println(2);
//            case 3:
//                System.out.println(3);
//            default:
//                System.out.println(-1);
//        }
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        int key = 1;
//        int i = 10;
//        switch (key){
//            case 0:
//                i++;
//            case 1:
//                i+=10;
//            case 2:
//                i--;
//            case 3:
//                i++;
//        }
//        System.out.println("i="+i);
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        int key = 10;
//        switch (key){
//            default:
//                System.out.println(-1);
//                break;
//            case 0:
//                System.out.println(0);
//                break;
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//        }
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        for (int i=0;i<5;i++){
//            System.out.println(i);
//        }
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        for (;;){
//            System.out.println("abc");
//        }
//    }
//}

//public class TestDemo{
//    public static void main(String[] args){
//        int i=0;
//        for (;i<5;){
//            System.out.println(i);
//            i++;
//        }
//    }
//}


//public class TestDemo{
//    public static void main(String[] args) {
//        for (int i = 0;; i < 5; i++) {
//            i += 1;
//        }
//        System.out.println(i);
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i<5){
//            System.out.println(i);
//            i++;
//        }
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<5);
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        int i = 10,n = 0;
//        do {
//            n++;
//            i--;
//        }while(n<5);
//        System.out.println(i);
//        System.out.println(n);
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++){
//            if (i==2){
//                break;
//            }
//            System.out.println(i);
//        }
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        for (int n = 0;n < 5; n++){
//            for (int i = 0; i < 5; i++){
//                if (i==2){
//                    break;
//                }
//                System.out.println(i);
//            }
//                System.out.println("------外层------");
//        }
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        for (int n = 0;n < 5; n++){
//            for (int i = 0; i < 5; i++){
//                if (i==2){
//                    break;
//                }
//                System.out.println(i);
//            }
//            System.out.println("------外层------");
//        }
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        //创建变量
//        boolean flag = false;
//        for (int n = 0;n < 5; n++){
//            if (flag){
//                break;
//            }
//            for (int i = 0; i < 5; i++){
//                if (i==2){
//                    flag = true;
//                    break;
//                }
//                System.out.println(i);
//            }
//            System.out.println("------外层------");
//        }
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        for (int n = 0; n < 5; n++){
//            for (int i = 0; i < 5; i++){
//                if (i==2){
//                    return;//方法弹栈
//                }
//                System.out.println(i);
//            }
//            System.out.println("------外层------");
//        }
//    }
//}

//public class TestDemo {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++){
//            if (i == 2){
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//}