package com.holo;

import java.util.UUID;
import java.util.zip.CRC32;

//业务类
public class StudentService {
    //依赖数据库
    private static Student[] array = DataBaseHolo.getInstance().getStudents();


    /**
     * TODO 获取对应学生下标
     *
     * @param sid 学号
     * @return 学生下标
     */
    public static int findByIndex(int sid) {
        for (int index = 0; index < array.length; index++) {
            //根据下标获取对应的学生对象
            Student student = array[index];
            //判断是否存在
            if (sid == 0) {
                if (student == null) return index;
            } else {
                if (student != null && student.getId() == sid) return index;
            }
        }
        return -1;
    }

    /**
     * TODO 保存学生信息
     *
     * @param student 学生对象(地址)
     */
    public static void save(Student student) {
        //获取一个空位置
        if (student != null) {
            int index = findByIndex(0);
            if (index != -1) {
                array[index] = student;
                System.out.println("保存成功");
            } else {
                System.out.println("满了");
            }

        } else {
            System.out.println("请添加学生信息");
        }

    }

    /**
     * TODO 显示学生信息
     */
    public static void findAll() {
        //遍历数组中学生的信息
        for (int index = 0; index < array.length; index++) {
            //获取学生对象
            Student student = array[index];
            if (student != null) {
                System.out.println(
                        "学号：" + student.getId() + "\t" +
                                "姓名：" + student.getUsername() + "\t" +
                                "性别：" + student.getSex() + "\t" +
                                "年龄：" + student.getAge() + "\t");
            }
        }
    }

    /**
     * TODO 删除学生
     *
     * @param sid 学号
     */
    public static void delete(int sid) {
        //获取学生在数组中的位置
        int index = findByIndex(sid);
        //判断
        if (index != -1) {
            array[index] = null;
            System.out.println("操作成功");
        } else {
            System.out.println("查无此学生，请重新输入");
        }
    }

    public static void update(int sid, String name) {
        //按照学号查找对应的下标
        int index = findByIndex(sid);
        //判断
        if (index != -1) {
            //获取这个学生
            Student student = array[index];
            //修改姓名
            student.setUsername(name);
            System.out.println("操作成功");
        } else {
            System.out.println("查无此学生，请重新输入");
        }
    }

    public static long getValue() {
        //不重复
        String str = UUID.randomUUID().toString();
        CRC32 crc32 = new CRC32();
        crc32.update(str.getBytes());
        //获取
        long value = crc32.getValue();
        return value;
    }
}