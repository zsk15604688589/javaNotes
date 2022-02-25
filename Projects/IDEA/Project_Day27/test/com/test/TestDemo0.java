package com.test;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestDemo0 {

    @Test
    public void test1() throws Exception {

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
            Class<?>[] interfaces = aClass.getInterfaces();
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
                sb.append("  ");
                //获取修饰符
                sb.append(Modifier.toString(field.getModifiers())).append(" ");
                //获取类型
                sb.append(field.getType().getSimpleName()).append(" ");
                //获取名称
                sb.append(field.getName()).append(";\n");
            }
            //获取构造方法
            Constructor<?>[] constructors = aClass.getDeclaredConstructors();
            if (constructors.length > 0) {
                for (Constructor<?> constructor : constructors) {
                    sb.append("  ");
                    //获取构造方法的参数
                    sb.append(Modifier.toString(constructor.getModifiers())).append("  ");
                    sb.append(aClass.getSimpleName()).append("(");
                    //判断方法是否有参数
                    if (constructor.getParameterCount() > 0) {
                        Class<?>[] types = constructor.getParameterTypes();
                        for (Class<?> type : types) {
                            sb.append(type.getSimpleName()).append("  ").append("arg").append(",");
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    sb.append("){}\n");
                }
            }
            //获取方法
            Method[] methods = aClass.getDeclaredMethods();
            if (methods.length > 0) {
                for (Method method : methods) {
                    sb.append("  ");
                    sb.append(Modifier.toString(method.getModifiers())).append(" ");
                    sb.append(method.getReturnType().getSimpleName()).append(" ").append(method.getName()).append("(");
                    //获取方法参数
                    Class<?>[] types = method.getParameterTypes();
                    if (types.length > 0) {
                        for (Class<?> type : types) {
                            sb.append(type.getSimpleName()).append(" ").append("arg").append(".");
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    sb.append("){}\n");
                }
            }
        }
        System.out.println(sb);
    }
}



