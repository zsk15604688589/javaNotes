///*
// * Copyright 2022 tu.cn All right reserved. This software is the
// * confidential and proprietary information of tu.cn ("Confidential
// * Information"). You shall not disclose such Confidential Information and shall
// * use it only in accordance with the terms of the license agreement you entered
// * into with Tu.cn
// */
//package com.holo;
//
//import java.io.IOException;
//
///**
// * @author Holo
// * @date 2022/2/9 20:40
// */
//public class 自定义异常类和接口 {
//    //自定义异常类
//    class UserNotFound extends IOException {
//    }
//
//    class PasswordException extends UserNotFound {
//    }
//
//    class RegisterException extends Exception {
//    }
//
//    class UserDaoTmpl implements UserDao {
//        @Override
////        public void show() throws UserNotFound {
////        }
//
////        public void show() throws UserNotFound, PasswordException {
////        }
//        public void show() throws UserNotFound, RegisterException {
//        }
//    }
//
//
//    //创建接口
//    interface UserDao {
//        //编写一个方法
//        void show() throws UserNotFound;
//    }
//
//}