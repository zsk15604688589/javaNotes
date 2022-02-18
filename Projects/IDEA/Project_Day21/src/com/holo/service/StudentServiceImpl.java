package com.holo.service;

import com.holo.domain.Student;
import com.holo.utils.StudentUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Holo
 * @date 2022/2/16 17:15
 */
public class StudentServiceImpl implements StudentService {

    //创建一个存储学生的结合
    private List list = new ArrayList();//接口指向实现类

    @Override
    public void save(Student student) {
        //通过工具类添加学号和日期
        student.setSid(String.valueOf(StudentUtils.geyKeyLong()));
        student.setDateTime(StudentUtils.getDate());
        list.add(student);
    }

    @Override
    public List findAll() {
        return list;
    }

    @Override
    public Student findById(String id) {
        //遍历集合
        if (list.size() > 0) {
            //迭代模式
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                //获取学生
                Student student = (Student) iterator.next();
                //按照学号查找学生
                if (student != null && id.equals(student.getSid())) {
                    return student;
                }
            }
        }
        return null;
    }

    @Override
    public void update(Student student) {
        //按照学号查找对象
        Student stu = findById(student.getSid());
        //判断
        if (stu != null) {//更新对象时,不能修改id的
            if (student.getUsername() != null) {
                stu.setUsername(student.getUsername());
            }
            if (student.getSex() != null) {
                stu.setSex(student.getSex());
            }
            if (student.getAge() != null) {
                stu.setAge(student.getAge());
            }
        }
    }


    @Override
    public void delete(String id) {
        //按照学号查找学生
        Student student = findById(id);
        //删除
        if (student != null) {
            list.remove(student);
        } else {
            System.out.println("没有这个学生");
        }
    }
    //    public void delete(String id) {
//        //按照学号查找学生
//        Student student = findById(id);
//        if (student != null) {
//            student = null;
//        }
//    }
}