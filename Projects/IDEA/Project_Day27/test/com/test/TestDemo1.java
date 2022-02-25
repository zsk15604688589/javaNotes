package com.test;

import com.holo.dao.BaseDaoImpl;
import com.holo.dao.User;
import org.junit.Test;

/**
 * @author Holo
 * @date 2022/2/24 17:28
 */
public class TestDemo1 {

    @Test
    public void test1(){
        User user = new User();
        user.setName("Leon");
        user.setAge(23);
        user.setSex("boy");
        user.setId(10010);

    }
}