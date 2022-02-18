package com.holo;

import java.util.Scanner;

public class StudentAction {

    //依赖于业务层
    private StudentService service = new StudentService();

    //保存学生
    public void saveStudent(Scanner scanner) {
        //创建对象
        Student student = new Student();
        student.setId(StudentUtils.getKeyInt());
        System.out.println("请输入姓名");
        student.setUsername(scanner.next());
        System.out.println("请输入性别");
        student.setSex(scanner.next());
        System.out.println("请输入年龄");
        student.setAge(scanner.nextInt());
        service.save(student);
        //提示
        System.out.println("操作成功");
    }

    //显示学生
    public void show() {
        service.findAll();
    }

    //删除学生
    public void deleteStudent(Scanner scanner) {
        System.out.println("请输入学号");
        service.delete(scanner.nextInt());
    }

    //更新学生
    public void updateStudent(Scanner scanner) {
        //提示
        System.out.println("请输入学号");
        Student student = new Student();
        student.setId(scanner.nextInt());
        System.out.println("请输入新姓名");
        student.setUsername(scanner.next());
        System.out.println("请输入新性别");
        student.setSex(scanner.next());
        System.out.println("请输入新年龄");
        student.setAge(scanner.nextInt());
        //调用更新
        service.update(student);
        System.out.println("操作成功");
    }

}
