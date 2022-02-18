### 4.9.4 JavaBean

+ bean就是一种**特殊**的类
+ 含有setter和getter方法
+ 可以看做一个数据的载体

```java
public class Student{
    private int id;
    private String name;
    private String sex;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

## 5.0 项目-优化

### 5.0.1 需求:

+ 对学生信息完成CRUD
+ 使用数组存储学生信息(学生对象)

### 5.0.2 技术

+ javase+数组+循环
+ 技术分析：
  + 创建一个可以存放学生类型的数组
  + 创建保存学生的方法save()
  + 显示学生的方法:findAll()
  + 删除学生的方法:delete()
  + 更新学生的方法：
    + 查询到需要更新的学生:findById()
    + 更新学生的信息:update()只更新姓名
  + 根据学生的**学号**查找在数组中这个学生对应的下标:findByIndex()

### 5.2.3 编码实现

```java
package com.holo;

import java.util.Scanner;

public class Demo {
    //创建一个学生数组
    static Student[] array = new Student[3];

    /**
     * TODO 按照学号查找对应学号的下标,如果sid=0表示需要找空位置完成添加
     *
     * @param sid 表示学号
     * @return 下标
     */

    public static int findByIndex(int sid) {
        for (int index = 0; index < array.length; index++) {
            //根据下标获取对应的学生独享
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
                                "姓名：" + student.getName() + "\t" +
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
            student.setName(name);
            System.out.println("操作成功");
        } else {
            System.out.println("查无此学生，请重新输入");
        }
    }

    /**
     * TODO 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        //控制台对象
        Scanner scanner = new Scanner(System.in);
        //跳出循环体
        boolean flag = true;
        //提示
        System.out.println("1添加；2显示；3删除；4更新；5退出");
        //循环
        do {
            //key
            int key = scanner.nextInt();
            switch (key) {
                case 1://调用方法
                    Student student = new Student();
                    //提示信息
                    System.out.println("请输入学号:");
                    student.setId(scanner.nextInt());
                    System.out.println("请输入姓名");
                    student.setName(scanner.next());
                    System.out.println("请输入性别");
                    student.setSex(scanner.next());
                    System.out.println("请输入年龄");
                    student.setAge(scanner.nextInt());
                    save(student);
                    break;
                case 2://调用方法
                    findAll();
                    break;
                case 3://调用方法
                    System.out.println("请输入学号");
                    delete(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("请输入学号");
                    int sid = scanner.nextInt();
                    System.out.println("请输入姓名");
                    String name = scanner.next();
                    //更新
                    update(sid, name);
                    break;
                case 5:
                    flag = false;
                    break;


            }
        } while (flag);
    }
}

class Student {
    private int id;//学号
    private String name;//学生姓名
    private String sex;//学生性别
    private int age;//学生年龄

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

### 5.2.4 编码实现-优化版

#### 5.2.4.1 扩展

+ 返回字符串

```java
package com.holo;

import java.util.UUID;

public class Demo1 {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        System.out.println(str);

    }
}
```

+ 返回long

```java
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
```

```java
package com.holo;

import java.util.Scanner;
import java.util.UUID;
import java.util.zip.CRC32;

public class Demo {
    //创建一个学生数组
    static Student[] array = new Student[3];

    /**
     * TODO 按照学号查找对应学号的下标,如果sid=0表示需要找空位置完成添加
     *
     * @param sid 表示学号
     * @return 下标
     */

    public static int findByIndex(int sid) {
        for (int index = 0; index < array.length; index++) {
            //根据下标获取对应的学生独享
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
                                "姓名：" + student.getName() + "\t" +
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
            student.setName(name);
            System.out.println("操作成功");
        } else {
            System.out.println("查无此学生，请重新输入");
        }
    }

    public static long getValue(){
        //不重复
        String str = UUID.randomUUID().toString();
        CRC32 crc32 = new CRC32();
        crc32.update(str.getBytes());
        //获取
        long value = crc32.getValue();
        return value;
    }
    /**
     * TODO 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        //控制台对象
        Scanner scanner = new Scanner(System.in);
        //跳出循环体
        boolean flag = true;
        //提示
        System.out.println("1添加；2显示；3删除；4更新；5退出");
        //循环
        do {
            //key
            int key = scanner.nextInt();
            switch (key) {
                case 1://调用方法
                    Student student = new Student();
                    //提示信息
                    student.setId((int)getValue());
                    System.out.println("请输入学号:");
                    student.setId(scanner.nextInt());
                    System.out.println("请输入姓名");
                    student.setName(scanner.next());
                    System.out.println("请输入性别");
                    student.setSex(scanner.next());
                    System.out.println("请输入年龄");
                    student.setAge(scanner.nextInt());
                    save(student);
                    break;
                case 2://调用方法
                    findAll();
                    break;
                case 3://调用方法
                    System.out.println("请输入学号");
                    delete(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("请输入学号");
                    int sid = scanner.nextInt();
                    System.out.println("请输入姓名");
                    String name = scanner.next();
                    //更新
                    update(sid, name);
                    break;
                case 5:
                    flag = false;
                    break;


            }
        } while (flag);
    }
}

class Student {
    private int id;//学号
    private String name;//学生姓名
    private String sex;//学生性别
    private int age;//学生年龄

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

