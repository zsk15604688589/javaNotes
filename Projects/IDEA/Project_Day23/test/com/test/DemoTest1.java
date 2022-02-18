package com.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Holo
 * @date 2022/2/18 21:38
 */
public class DemoTest1 {

    @Test
    public void test1() {
        Map map = new HashMap();
        map.put(new User(10010), "小明");
        map.put(new User(10011), "小李");
        map.put(new User(10010), "小赵");
        System.out.println(map);
        //{User{id=10010}=小赵, User{id=10011}=小李}
    }
}

//class User {
//    private Integer id;
//
//    public User(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        User user = (User) o;
//        return id.equals(user.getId());
//    }
//
//    @Override
//    public int hashCode() {
//        return id.hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                '}';
//    }
//}