package com.holo.test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Set;

public class DemoTest {

    @Test
    public void test1() {
        String str = "";
        for (int i = 0; i < 10; i++) {
            //这样拼接字符串的方式会产生大量垃圾对象
            str += i;
        }
        System.out.println(str);
    }

    @Test
    public void test2() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            //推荐使用
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }

    @Test
    public void test3() {
        StringBuilder stringBuilder = new StringBuilder();
        //拼接数字
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i).append(",");
        }
        //去掉最后一个逗号
        stringBuilder.deleteCharAt(stringBuilder.toString().length() - 1);
        System.out.println(stringBuilder);
    }

    @Test
    public void test4() {
        StringBuilder stringBuilder = new StringBuilder();
        //拼接数字
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i).append(",");
        }
        //去掉最后一个逗号
        String s = stringBuilder.toString();
        String substring = s.substring(0, s.length() - 1);
        System.out.println(substring);
    }

    @Test
    public void test5() {
        StringBuilder stringBuilder = new StringBuilder();
        //拼接数字
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
            //判断
            if (i != 9) {
                stringBuilder.append(",");
            }
        }
        System.out.println(stringBuilder);
    }

    @Test
    public void test6() {
        String str = "hadoop";
        StringBuilder stringBuilder = new StringBuilder(str);
        //调用方法
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }

    @Test
    public void test7() {
        String str = "100";
        //转为包装类型
        Integer integer = Integer.valueOf(str);
        //转为基本类型
        int i = Integer.parseInt(str);
    }

    @Test
    public void test8() {
        //取值的范围是按照byte的范围获取的
        Integer i = 128;
        Integer n = 128;
        System.out.println(i == n);
    }

    @Test
    public void test9() {
        //传统的日期类不建议使用,因为,效率低
        Date date = new Date();
        System.out.println(date);
        //设置日期格式:HH表示24小时制,hh表示12小时制
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }

    @Test
    public void test10() {
        //获取日期
        LocalDate date = LocalDate.now();
        System.out.println(date);
        //获取时间
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }

    @Test
    public void test11() {
        //获取日期时间
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }

    @Test
    public void test12() {
        //获取日期时间
        LocalDateTime dateTime = LocalDateTime.now();
        //使用标准化格式
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化
        System.out.println(formatter.format(dateTime));
    }

    @Test
    public void test13() {
        //获取日期时间
        LocalDateTime dateTime = LocalDateTime.now();
        //自定义格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //格式化
        System.out.println(formatter.format(dateTime));
    }

    @Test
    public void test14() {
        //指定日期时间
        LocalDateTime dateTime = LocalDateTime.of(2002, 8, 17, 12, 00);
        System.out.println(dateTime);
    }

    @Test
    public void test15() {
        //添加年、月、日
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime plusDays = dateTime.plusDays(13);
        System.out.println(plusDays);
    }

    @Test
    public void test16() {
        //减少年、月、日
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime minusDays = dateTime.minusDays(11);
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(minusDays));
    }

    @Test
    public void test17() {
        //获取日期中的:年/月/日/时....
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(dateTime));
        System.out.println("getYear()-------->" + dateTime.getYear());
        System.out.println("getMonth()------->" + dateTime.getMonth());
        System.out.println("getMonthValue()-->" + dateTime.getMonthValue());
        System.out.println("getHour()-------->" + dateTime.getHour());
        System.out.println("getDayOfYear()--->" + dateTime.getDayOfYear());
        System.out.println("getDayOfMonth()-->" + dateTime.getDayOfMonth());
        System.out.println("getDayOfWeek()--->" + dateTime.getDayOfWeek());
    }

    @Test
    public void test18() {
        //时间戳
        System.out.println("长整型时间戳:" + System.currentTimeMillis());
    }

    @Test
    public void test19() {
        //默认的时区时间
        System.out.println("本地的时区:" + LocalDateTime.now());
        Instant instant = Instant.now();
        //我们的时区和标准默认的时区相差8个小时
        System.out.println("默认的时区:" + instant);
        //必须添加上相差的8个小时
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println("我们的时区:" + offsetDateTime);
        //获取时间戳
        System.out.println("获取实践戳:" + offsetDateTime.toEpochSecond());
    }

    @Test
    public void test20() {
        //计算时间差
        LocalDateTime datetime1 = LocalDateTime.of(2022, 8, 11, 22, 07);
        LocalDateTime datetime2 = LocalDateTime.of(2022, 8, 17, 11, 00);

        //求差,时间求差用Duration
        Duration duration = Duration.between(datetime1, datetime2);
        System.out.println(duration.toDays());
        System.out.println(duration.getSeconds());
        System.out.println(duration.toHours());
    }

    @Test
    public void test21() {
        //计算日期差
        LocalDate datetime1 = LocalDate.of(2022, 8, 11);
        LocalDate datetime2 = LocalDate.of(2022, 8, 17);

        //求差,日期求差用Period
        Period between = Period.between(datetime1, datetime2);
        System.out.println("天数" + between.getDays());
        System.out.println("月数" + between.toTotalMonths());
    }

    @Test
    public void test22() {
        //时间校准器
        LocalDateTime dateTime = LocalDateTime.now();
        //获取这个月最后一天
        LocalDateTime with = dateTime.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(with);
    }

    @Test
    public void test23() {
        //查看时区
        Set<String> set = ZoneId.getAvailableZoneIds();
        set.forEach(System.out::println);
    }

    @Test
    public void test24() {
        //指定时区
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }
}




