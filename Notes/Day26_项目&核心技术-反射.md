## 9.8 File

### 9.8.1 常用方法

```java
package com.test;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Holo
 * @date 2022/2/23 17:24
 */
public class TestDemo1 {

    @Test
    public void test1() {
        //读取文件
        File file = new File("resources/test1.txt");
        //File file = new File("resources/","test1.txt")
        //判断文件是否存在
        if (file.exists()) {
            System.out.println("存在");
        } else {
            System.out.println("不能存在");
        }
    }

    @Test
    public void test2() {
        File file = new File("resources/test2.txt");
        try {
            //创建文件
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        File file = new File("resources/directory1");
        File file1 = new File("resources/directory2/test1");
        //创建目录
        file.mkdir();
        file1.mkdirs();
    }

    @Test
    public void test4() {
        File file = new File("resources");
        //获取所有文件
        File[] files = file.listFiles();
        //判断获取的是目录还是文件
        for (File file1 : files) {
            if (file1.isFile()) {
            }
            if (file1.isDirectory()) {
            }
        }
    }

}
```

## 9.9 项目

### 9.9.1 技术分析

+ 使用流和文件完成数据库模拟
+ 分包、分类编写功能
+ 使用Properties完成数据的存储

### 9.9.2 编写

#  第十章 核心技术 反射

+ 动态创建对象的过程就是反射

## 10.1 反射的方式

### 10.1.1 Class.forName

```java
@Test
public void test1() throws Exception{
//获取反射的类型
    Class<?> aClass = Class.forName("com.test.Student");
    //创建对象
    Student student = (Student) aClass.newInstance();
    System.out.println(student.getId());
}
```

### 10.1.2 `.class`

```java
@Test
public void test2() throws Exception {
    //获取反射的类型
    Class<Student> aClass = Student.class;
    //创建对象 
    Student student = (Student) aClass.newInstance();
    System.out.println(student.getId());
}
```

### 10.1.3 getClass

```java
@Test
public void test3() throws Exception {
    //获取反射的类型
    String str = "abc";
    Class<? extends String> aClass = str.getClass();
    //创建对象
    String abc = aClass.newInstance();
    System.out.println(abc);
    //输出到内存中
}
```

### 10.1.4 直接使用类加载器

```java
@Test
public void test4() throws Exception {
    //匿名实现
    ClassLoader classLoader = new ClassLoader() {
    };
    //获取反射类型
    Class<?> aClass = classLoader.loadClass("com.test.Student");
    Student student = (Student) aClass.newInstance();
    System.out.println(student.getId());
}
```

## 10.2 实现反编译

```java
@Test
public void test5() throws Exception {

    StringBuilder sb = new StringBuilder();
    //获取反射类型
    Class<Student> aClass = Student.class;
    //获取包名称
    sb.append(aClass.getPackage()).append("; \n");
    //获取修饰符
    sb.append(Modifier.toString(aClass.getModifiers())).append(" ");
    //判断是类文件还是接口文件
    if (!aClass.isInterface()) {
        sb.append("class ");
        //获取类名称
        sb.append(aClass.getName());
        sb.append(aClass.getSimpleName());
        //判断是否有父类和接口
        if (!aClass.getSuperclass().getSimpleName().equals("Object")) {
            sb.append(" ").append("extends ").append(aClass.getSuperclass().getSimpleName());
        }
        //获取接口
        final Class<?>[] interfaces = aClass.getInterfaces();
        if (interfaces.length > 0) {
            sb.append(" implements ");
            for (Class<?> anInterface : interfaces) {
                sb.append(anInterface.getSimpleName()).append(",");
            }
            //去掉最后的逗号
            sb.deleteCharAt(sb.length() - 1);
            sb.append("{ \n");
        }
        // Field[] fields = aClass.getFields();//获取的是共有类型的
        Field[] fields = aClass.getDeclaredFields();//获取所有属性
        for (Field field : fields) {
            sb.append(" ");
            //获取修饰符
            sb.append(Modifier.toString(field.getModifiers())).append(" ");
            //获取类型
            sb.append(field.getType().getSimpleName()).append(" ");
            //获取名称
            sb.append(field.getName()).append(";\n");
        }
    }
    System.out.println(sb);
}
```