package com.holo.dao;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * @author Holo
 * @date 2022/2/24 16:39
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
    private Properties properties = new Properties();

    @Override
    public void save(T t, String table) throws Exception {

        //获取反射的类型
        Class<?> aClass = t.getClass();
        //获取属性名称
        Field[] fields = aClass.getDeclaredFields();
        //根据属性名称调用对应的get方法获取数据
        for (Field field : fields) {
            //获取属性名称
            String name = field.getName();
            //get方法
            String methodName = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
            //根据方法名称动态执行方法
            Object value = aClass.getDeclaredMethod(methodName).invoke(t);
//            System.out.println(name + "=" + value);

            //添加到属性类的对象中
            properties.setProperty(name, value.toString());

            //保存到文件
            Writer writer = new FileWriter(table);
            properties.store(writer, "");
        }
    }

    @Override
    public File findById(T t, String table) throws Exception {
        //获取反射类型
        Class<?> aClass = t.getClass();
        String methodName = "getId";

        //获取key的值
        Object value = aClass.getDeclaredMethod(methodName).invoke(t);

        //获取对应目录中所有的文件
        File file = new File(table);
        File[] files = file.listFiles();
        for (File file1 : files) {
            try (FileReader reader = new FileReader(file1)) {
                //加载到属性类中
                properties.load(reader);
                if (value.toString().equals(properties.getProperty("id"))) {
                    return file1;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void delete(T t, String table) throws Exception {

        //判断文件是否存在
        File file = findById(t, table);
        if (file != null) {
            file.delete();
        }
    }

    @Override
    public void update(T t, String table) throws Exception {
        //获取需要修改的文件
        File file = findById(t, table);
        //判断
        if (file != null) {
            //获取反射的类型
            Class<?> aClass = t.getClass();
            //获取属性名称
            Field[] fields = aClass.getDeclaredFields();
            //根据属性名称调用对应的get方法获取数据
            for (Field field : fields) {
                //属性名称
                String name = field.getName();
                //get方法
                String methodName = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
                //根据方法名称动态执行方法
                Object value = aClass.getDeclaredMethod(methodName).invoke(t);

                //添加到属性类的对象中
                properties.setProperty(name, value.toString());
                //更新到文件
                Writer writer = new FileWriter(file);
                properties.store(writer, "");
            }
        }
    }

    @Override
    public List<T> findAll(Class aclass, String table) {
        List<T> list = null;
        //获取所有的文件
        File file = new File(table);
        File[] files = file.listFiles();
        if (files.length > 0) {
            list = new ArrayList<>();
            //把properties文件中的数据还原为对象,再添加到集合中
            for (File file1 : files) {
                try (Reader reader = new FileReader(file1)) {
                    //创建对象
                    T instance = (T) aclass.newInstance();
                    //加载
                    properties.load(reader);
                    Set<Object> keys = properties.keySet();
                    for (Object key : keys) {
                        //方法名称
                        String methodName = "set" + key.toString().substring(0, 1).toUpperCase() + key.toString().substring(1);
                        //获取对应属性的类型
                        Class<?> type = aclass.getDeclaredField(key.toString()).getType();
                        //必须判断属性的类型是否匹配,否则报错
                        if (type.getSimpleName().contains("Integer")) {
                            aclass.getDeclaredMethod(methodName, type).invoke(instance, Integer.valueOf(properties.getProperty(key.toString())));
                        } else if (type.getSimpleName().contains("Double")) {
                            aclass.getDeclaredMethod(methodName, type).invoke(instance, Double.valueOf(properties.getProperty(key.toString())));
                        } else {
                            aclass.getDeclaredMethod(methodName, type).invoke(instance, properties.getProperty(key.toString()));
                        }
                    }
                    //把对象添加到集合汇总
                    list.add(instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}