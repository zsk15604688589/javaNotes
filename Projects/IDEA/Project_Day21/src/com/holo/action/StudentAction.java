package com.holo.action;


import com.holo.domain.Student;
import com.holo.service.StudentService;
import com.holo.service.StudentServiceImpl;

import java.util.List;
import java.util.Scanner;

/**
 * @author Holo
 * @date 2022/2/16 18:02
 */
public class StudentAction {
    //创建业务对象
    private StudentService service = new StudentServiceImpl();
    //创建控制台对象
    private Scanner scanner = new Scanner(System.in);

    //添加
    public void saveStudent(Scanner scanner) {
        //创建学生对象
        Student student = new Student();
        //显示信息
        System.out.println("请输入姓名:");
        student.setUsername(scanner.next());
        System.out.println("请输入性别:");
        student.setSex(scanner.next());
        System.out.println("请输入年龄:(数字)");
        student.setAge(scanner.nextInt());
        //调用业务保存方法
        service.save(student);
    }

    //显示
    public void showStudentMsg() {
        //获取业务方法
        List list = service.findAll();
        if (list.size() > 0) {
            list.forEach(System.out::println);
        } else {
            System.out.println("暂时没有数据");
        }
    }

    //删除
    public void deleteStudent(Scanner scanner) {
        //提示信息
        System.out.println("请输入需要删除的学号");
        service.delete(scanner.next());
    }

    //更新学生信息
    public void updateStudent() {
        //提示信息,封装修改的数据到实体对象中
        Student student = new Student();
        System.out.println("请输入学号:");
        student.setSid(scanner.next());
        System.out.println("请输入姓名:");
        student.setUsername(scanner.next());
        System.out.println("请输入性别:");
        student.setSex(scanner.next());
        System.out.println("请输入年龄");
        student.setAge(scanner.nextInt());
        service.update(student);
    }
}