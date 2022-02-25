package com.test;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author Holo
 * @date 2022/2/23 18:12
 */
public class TestDemo2 {

    @Test
    public void test1() throws Exception {
        //获取反射的类型
        Class<?> aClass = Class.forName("com.test.Student");
        //创建对象
        Student student = (Student) aClass.newInstance();
        System.out.println(student.getId());
    }

    @Test
    public void test2() throws Exception {
        //获取反射的类型
        Class<Student> aClass = Student.class;
        //创建对象
        Student student = (Student) aClass.newInstance();
        System.out.println(student.getId());
    }

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
            // Field[] fields = aClass.getFields();//获取的是公有类型的
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
}



