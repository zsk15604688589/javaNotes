package com.holo.action;

import com.holo.dao.StudentDao;
import com.holo.dao.StudentDaoImpl;
import com.holo.domain.Student;

import java.util.Scanner;

/**
 * @author Holo
 * @date 2022/2/23 17:54
 */
public class StudentAction {
    private StudentDao dao = new StudentDaoImpl();

    //添加
    public void saveStudent(Scanner scanner) {
        //创建对象
        Student student = new Student();
        //提示
        System.out.println("请输入姓名:");
        student.setUsername(scanner.next());
        System.out.println("请输入性别:");
        student.setSex(scanner.next());
        System.out.println("请输入年龄:");
        student.setAge(scanner.nextInt());
        //保存
        dao.save(student);
    }

    //显示
    public void show() {
        dao.findAll();
    }

    //删除
    public void deleteStudent(Scanner scanner) {
        //提示
        System.out.println("请输入学号:");
        dao.delete(scanner.next());
    }

    //更新
    public void updateStudent(Scanner scanner) {
        //创建对象
        Student student = new Student();
        //提示
        System.out.println("请输入学号:");
        student.setId(scanner.nextLong());
        System.out.println("请输入姓名:");
        student.setUsername(scanner.next());
        System.out.println("请输入性别:");
        student.setSex(scanner.next());
        System.out.println("请输入年龄:");
        student.setAge(scanner.nextInt());
        //更新
        dao.update(student);
    }
}