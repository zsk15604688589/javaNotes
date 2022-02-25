package com.holo.front;

import com.holo.action.UserAction;

import java.util.Scanner;

/**
 * @author Holo
 * @date 2022/2/24 17:53
 */
public class Front {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAction action = new UserAction();
        boolean flag = true;
        do {
            System.out.println("1.save;2.show;3.delete;4.update;5.exit");
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    action.save(scanner);
                    break;
                case 2:
                    action.show();
                    break;
                case 3:
                    action.delete(scanner);
                    break;
                case 4:
                    action.update(scanner);
                    break;
                case 5:
                    flag = false;
            }
        } while (flag);
    }
}