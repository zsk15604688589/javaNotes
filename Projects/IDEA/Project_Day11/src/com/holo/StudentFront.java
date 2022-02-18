package com.holo;

import java.util.Scanner;

public class StudentFront {
    public static void main(String[] args) {
        //依赖于action层
        StudentAction action = new StudentAction();
        //控制台
        Scanner scanner = new Scanner(System.in);
        //循环
        boolean isRunning = true;
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
                    isRunning = false;
                    break;
            }
        } while (isRunning);
    }
}