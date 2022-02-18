package com.holo;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.zip.CRC32;

public class StudentUtils {
    //构造方法私有化
    private StudentUtils() {
    }

    //静态方法
    public static String getKeyString() {
        return UUID.randomUUID().toString();
    }

    //静态方法
    public static int getKeyInt() {
        CRC32 crc32 = new CRC32();
        crc32.update(getKeyString().getBytes());
        long value = crc32.getValue();

        //long强制转换为int
        return (int) value;
    }

    //日期
    public static String getDateString() {
        return LocalDateTime.now().toString();
    }
}