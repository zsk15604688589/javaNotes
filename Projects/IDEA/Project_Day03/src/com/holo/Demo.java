//package com.holo.www;

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建参数
//        byte b = 100;
//        //byte b1 = 1000;错误，超出范围
//
//        //short b = 1000;错误，变量不能同名
//        short s = 1000;//正确
//
//        int i = 1000;//正确
//
//        long l = i;//正确,因为int比long小，默认转换了
//
//        //int i1 = l;错误，long比int大，超出范围了。精度丢失
//        int i1 = (int)l; //正确，可以强制进行类型转换
//
//        int i2 = 10/3; //正确，多种类型混合运算过程中，返回最大的类型
//
//        long l1 = 10;
//        //int f = l1/3;错误，返回的是long类型
//        int i3 = (int)l1/3; //可以把long强制转为int类型
//        //byte b1 = (byte)l1/3;错误，返回的是int类型
//        byte b2 = (byte)(l1/3); //正确
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        short s1 = 10;
//        //short s2 = s1 + 1;错误,因为需要转为int后再运算
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        char c1 = 'a';
//        int i1 = c1 + 100;//正确char转为int以后在运算
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        int i = 10;
//        i++ ; //自身加一
//        System.out.println(i);
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        int i = 10;
//        //++在后表示先赋值，自身再加一
//        int n = i++ ;
//        System.out.println(i);
//        System.out.println(n)
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        int i = 10;
//        //++在前表示先加一在赋值
//        int n = ++i ;
//        System.out.println(i);
//        System.out.println(n)
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        int i = 10;
//        //i++相当于i=i+1
//        i = i+1;
//        System.out.println(i);
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        int i = 10;
//        //i++相当于i=i+1
//        i = i+1;
//        System.out.println(i);
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        short i = 10;
//        i = i + 1;
//        System.out.println(i);
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        short i = 10;
//        //正确，推荐使用 +=、-=、*=、/=，因为自动转为接收的类型
//        i += 1;
//        System.out.println(i);
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        int i = 10;
//        //正确，推荐使用 +=、-=、*=、/=，因为自动转为接收的类型
//        i /= 3;
//        System.out.println(i);
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //创建变量
//        int i = 10;
//        int n = i % 3;//就是取余数
//        System.out.println(n);
//    }
//}

//public class Demo
//{
//    public static void main (String[] args)
//    {
//        //总记录数
//        int total = 20;
//        //每页显示9条
//        int pageSize = 9;
//        //总页码
//        int pages = 1;
//        if (total%pageSize==0)
//        {
//            pages = total/pageSize;
//        }
//        else
//        {
//            pages = total/pageSize+1;
//        }
//        System.out.printf("总页码:"+pages);
//    }
//}