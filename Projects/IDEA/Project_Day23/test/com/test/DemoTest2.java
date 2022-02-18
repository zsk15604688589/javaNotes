package com.test;

import org.junit.Test;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Holo
 * @date 2022/2/18 21:49
 */
public class DemoTest2 {

    @Test
    public void test1() {
        Map map = new TreeMap((x, y) -> ((User) x).getId() - ((User) y).getId());
        map.put(new User(10010), "小明");
        map.put(new User(10011), "小李");
        map.put(new User(10010), "小赵");
        map.put(new User(10013), "小狗");
        //排序完，并去重
        //输出:{User{id=10010}=小赵, User{id=10011}=小李, User{id=10013}=小狗}
        System.out.println(map);
    }

}

class User {
    private Integer id;

    public User(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}