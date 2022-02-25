package com.holo.dao;

import com.holo.domain.Student;
import com.holo.utils.StudentTools;

import java.io.*;
import java.util.Properties;

/**
 * @author Holo
 * @date 2022/2/23 15:00
 */
public class StudentDaoImpl implements StudentDao {
    //数据表
    private String table = "resources/database/student/";
    //模拟数据库
    private Properties properties = new Properties();

    //    @Override
//    public void save(Student student) {
//        //把实体对象中的数据添加到属性类中
//        properties.put("id", StudentTools.getKey() + "");
//        properties.put("username", student.getUsername());
//        properties.put("sex", student.getSex());
//        properties.put("age", student.getAge() + "");
//        //保存
//        //字符输出流
//        try (Writer writer = new FileWriter(table + StudentTools.getFileName());) {
//            properties.store(writer, "");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    @Override
    public void save(Student student) {
        //把实体对象中的数据添加到属性类中
        properties.setProperty("id", StudentTools.getKey() + "");
        properties.setProperty("username", student.getUsername());
        properties.setProperty("sex", student.getSex());
        properties.setProperty("age", student.getAge() + "");
        //保存
        //字符输出流
        try (Writer writer = new FileWriter(table + StudentTools.getFileName());) {
            properties.store(writer, "");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void findAll() {
        //获取指定目录中所有文件
        final File file = new File(table);
        final File[] files = file.listFiles();
        //遍历文件
        for (File file1 : files) {
            //加载到属性对象中
            try (Reader reader = new FileReader(file1)) {
                properties.load(reader);
                //按照key获取value
                System.out.println(
                        "id=" + properties.getProperty("id") +
                                "\t username=" + properties.getProperty("username") +
                                "\t  sex=" + properties.getProperty("sex") +
                                "\t age=" + properties.getProperty("age"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public File findById(String id) {
        //获取指定目录中所有文件
        final File file = new File(table);
        final File[] files = file.listFiles();
        //遍历文件
        for (File file1 : files) {
            //加载到属性对象中
            try (Reader reader = new FileReader(file1)) {
                properties.load(reader);
                //判断id
                if (id.equals(properties.getProperty("id"))) {
                    return file1;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        final File file = findById(id);
        //判断
        if (file != null) {
            file.delete();
        }
    }

    @Override
    public void update(Student student) {
        //先找到需要修改的文件
        final File file = findById(student.getId() + "");
        //判断
        if (file != null) {
            properties.setProperty("username", student.getUsername());
            properties.setProperty("sex", student.getSex());
            properties.setProperty("age", student.getAge() + "");
            //保存
            //字符输出流
            try (Writer writer = new FileWriter(file);) {
                properties.store(writer, "");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}