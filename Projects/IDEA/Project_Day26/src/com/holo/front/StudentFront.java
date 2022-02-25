package com.holo.front;

import com.holo.action.StudentAction;

import java.util.Scanner;

/**
 * @author Holo
 * @date 2022/2/23 17:52
 */
public class StudentFront {
    public static void main(String[] args) {
        StudentAction action = new StudentAction();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("1添加2显示3删除4更新5退出");

        do {
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    action.saveStudent(scanner);
                    break;
                case 2:
                    action.show();
                    break;
                case 3:
                    action.deleteStudent(scanner);
                    break;
                case 4:
                    action.updateStudent(scanner);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}