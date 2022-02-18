package com.holo.front;

import com.holo.action.StudentAction;

import java.util.Scanner;

/**
 * @author Holo
 * @date 2022/2/16 18:20
 */
public class StudentFront {
    public static void main(String[] args) {
        //控制台对象
        Scanner scanner = new Scanner(System.in);
        //创建action
        StudentAction action = new StudentAction();
        boolean flag = true;
        System.out.println("1添加 2显示 3删除 4更新 5退出");
        //循环
        do {
            //获取控制台数据
            int key = scanner.nextInt();
            switch (key) {
                case 1://添加
                    action.saveStudent(scanner);
                    break;
                case 2://显示
                    action.showStudentMsg();
                    break;
                case 3://删除
                    action.deleteStudent(scanner);
                    break;
                case 4://更新
                    action.updateStudent();
                    break;
                case 5://退出
                    flag = false;
                    break;
            }
        } while (flag);
    }
}