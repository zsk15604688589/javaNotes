
package com.holo;

import java.util.UUID;
import java.util.zip.CRC32;

public class Demo1 {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        CRC32 crc32 = new CRC32();
        crc32.update(str.getBytes());
        //获取
        long value = crc32.getValue();
        System.out.println(value);

    }
}