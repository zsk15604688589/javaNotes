package com.holo.action;


import com.holo.dao.User;
import com.holo.service.UserService;
import com.holo.service.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

/**
 * @author Holo
 * @date 2022/2/24 17:49
 */
public class UserAction {
    private UserService service = new UserServiceImpl();

    //save
    public void save(Scanner scanner) {
        User user = new User();
        System.out.println("请添加姓名:");
        user.setName(scanner.next());
        System.out.println("请添加性别:");
        user.setSex(scanner.next());
        System.out.println("请添加年龄:");
        user.setAge(scanner.nextInt());
        service.saveUser(user);
    }

    //show
    public void show() {
        List<User> list = service.show();
        list.forEach(System.out::println);
    }

    //delete
    public void delete(Scanner scanner) {
        User user = new User();
        System.out.println("请输入被删除用户的ID:");
        user.setId(scanner.nextInt());
        service.deleteUser(user);
    }

    //update
    public void update(Scanner scanner) {
        User user = new User();
        System.out.println("请输入更新用户信息的id");
        user.setId(scanner.nextInt());
        System.out.println("请输出姓名:");
        user.setName(scanner.next());
        System.out.println("请输入性别:");
        user.setSex(scanner.next());
        System.out.println("请输入年龄:");
        user.setAge(scanner.nextInt());
        service.updateUser(user);
        System.out.println("更新信息成功");
    }
}