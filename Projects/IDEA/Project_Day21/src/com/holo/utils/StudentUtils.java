package com.holo.utils;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.zip.CRC32;

/**
 * @author Holo
 * @date 2022/2/16 16:58
 */

//工具类
public class StudentUtils {
    //私有化构造方法,不让外界创建对象
    private StudentUtils() {
    }
    //获取不重复学号
    public static String getKeyString(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    //获取数字类型的学号
    public static long geyKeyLong(){
        CRC32 crc32 = new CRC32();
        crc32.update(UUID.randomUUID().toString().getBytes());
        return crc32.getValue();
    }

    //使用日期模拟学号
    public static String getKeyStringDate() {
        //获取当前的日期(就是服务器的日期)
        LocalDateTime now = LocalDateTime.now();
        //设置日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return formatter.format(now);
    }

    //获取日期
    public static String getDate() {
        //获取当前的日期(就是服务器的日期)
        LocalDateTime now = LocalDateTime.now();
        //设置日期格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return formatter.format(now);
    }


}