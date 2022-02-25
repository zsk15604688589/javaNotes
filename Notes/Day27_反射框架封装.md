## 10.3 完整的反编译

```java
package com.test;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestDemo0 {

    @Test
    public void test1() throws Exception {

        StringBuilder sb = new StringBuilder();
        //获取反射类型
        Class<Student> aClass = Student.class;
        //获取包名称
        sb.append(aClass.getPackage()).append("; \n");
        //获取修饰符
        sb.append(Modifier.toString(aClass.getModifiers())).append(" ");
        //判断是类文件还是接口文件
        if (!aClass.isInterface()) {
            sb.append("class ");
            //获取类名称
            sb.append(aClass.getName());
            sb.append(aClass.getSimpleName());
            //判断是否有父类和接口
            if (!aClass.getSuperclass().getSimpleName().equals("Object")) {
                sb.append(" ").append("extends ").append(aClass.getSuperclass().getSimpleName());
            }
            //获取接口
            Class<?>[] interfaces = aClass.getInterfaces();
            if (interfaces.length > 0) {
                sb.append(" implements ");
                for (Class<?> anInterface : interfaces) {
                    sb.append(anInterface.getSimpleName()).append(",");
                }
                //去掉最后的逗号
                sb.deleteCharAt(sb.length() - 1);
                sb.append("{ \n");
            }
            // Field[] fields = aClass.getFields();//获取的是公有类型的
            Field[] fields = aClass.getDeclaredFields();//获取所有属性
            for (Field field : fields) {
                sb.append("  ");
                //获取修饰符
                sb.append(Modifier.toString(field.getModifiers())).append(" ");
                //获取类型
                sb.append(field.getType().getSimpleName()).append(" ");
                //获取名称
                sb.append(field.getName()).append(";\n");
            }
            //获取构造方法
            Constructor<?>[] constructors = aClass.getDeclaredConstructors();
            if (constructors.length > 0) {
                for (Constructor<?> constructor : constructors) {
                    sb.append("  ");
                    //获取构造方法的参数
                    sb.append(Modifier.toString(constructor.getModifiers())).append("  ");
                    sb.append(aClass.getSimpleName()).append("(");
                    //判断方法是否有参数
                    if (constructor.getParameterCount() > 0) {
                        Class<?>[] types = constructor.getParameterTypes();
                        for (Class<?> type : types) {
                            sb.append(type.getSimpleName()).append("  ").append("arg").append(",");
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    sb.append("){}\n");
                }
            }
            //获取方法
            Method[] methods = aClass.getDeclaredMethods();
            if (methods.length > 0) {
                for (Method method : methods) {
                    sb.append("  ");
                    sb.append(Modifier.toString(method.getModifiers())).append(" ");
                    sb.append(method.getReturnType().getSimpleName()).append(" ").append(method.getName()).append("(");
                    //获取方法参数
                    Class<?>[] types = method.getParameterTypes();
                    if (types.length > 0) {
                        for (Class<?> type : types) {
                            sb.append(type.getSimpleName()).append(" ").append("arg").append(".");
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    sb.append("){}\n");
                }
            }
        }
        System.out.println(sb);
    }
}
```

# 第十一章 反射封装框架

## 11.1 底层封装

### 11.1.1 接口

```java
/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.holo.dao;

import java.io.File;
import java.util.List;

/**
 * @author Holo
 * @date 2022/2/24 16:35
 */
public interface BaseDao<T> {

    //保存
    void save(T t, String table) throws Exception;

    //按照id查找文件
    File findById(T t, String table) throws Exception;

    //删除
    void delete(T t, String table) throws Exception;

    //更新
    void update(T t, String table) throws Exception;

    //显示
    List<T> findAll(Class aclass, String table);
}
```



### 11.1.2 接口实现

```java
package com.holo.dao;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * @author Holo
 * @date 2022/2/24 16:39
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
    private Properties properties = new Properties();

    @Override
    public void save(T t, String table) throws Exception {

        //获取反射的类型
        Class<?> aClass = t.getClass();
        //获取属性名称
        Field[] fields = aClass.getDeclaredFields();
        //根据属性名称调用对应的get方法获取数据
        for (Field field : fields) {
            //获取属性名称
            String name = field.getName();
            //get方法
            String methodName = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
            //根据方法名称动态执行方法
            Object value = aClass.getDeclaredMethod(methodName).invoke(t);
//            System.out.println(name + "=" + value);

            //添加到属性类的对象中
            properties.setProperty(name, value.toString());

            //保存到文件
            Writer writer = new FileWriter(table);
            properties.store(writer, "");
        }
    }

    @Override
    public File findById(T t, String table) throws Exception {
        //获取反射类型
        Class<?> aClass = t.getClass();
        String methodName = "getId";

        //获取key的值
        Object value = aClass.getDeclaredMethod(methodName).invoke(t);

        //获取对应目录中所有的文件
        File file = new File(table);
        File[] files = file.listFiles();
        for (File file1 : files) {
            try (FileReader reader = new FileReader(file1)) {
                //加载到属性类中
                properties.load(reader);
                if (value.toString().equals(properties.getProperty("id"))) {
                    return file1;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void delete(T t, String table) throws Exception {

        //判断文件是否存在
        File file = findById(t, table);
        if (file != null) {
            file.delete();
        }
    }

    @Override
    public void update(T t, String table) throws Exception {
        //获取需要修改的文件
        File file = findById(t, table);
        //判断
        if (file != null) {
            //获取反射的类型
            Class<?> aClass = t.getClass();
            //获取属性名称
            Field[] fields = aClass.getDeclaredFields();
            //根据属性名称调用对应的get方法获取数据
            for (Field field : fields) {
                //属性名称
                String name = field.getName();
                //get方法
                String methodName = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
                //根据方法名称动态执行方法
                Object value = aClass.getDeclaredMethod(methodName).invoke(t);

                //添加到属性类的对象中
                properties.setProperty(name, value.toString());
                //更新到文件
                Writer writer = new FileWriter(file);
                properties.store(writer, "");
            }
        }
    }

    @Override
    public List<T> findAll(Class aclass, String table) {
        List<T> list = null;
        //获取所有的文件
        File file = new File(table);
        File[] files = file.listFiles();
        if (files.length > 0) {
            list = new ArrayList<>();
            //把properties文件中的数据还原为对象,再添加到集合中
            for (File file1 : files) {
                try (Reader reader = new FileReader(file1)) {
                    //创建对象
                    T instance = (T) aclass.newInstance();
                    //加载
                    properties.load(reader);
                    Set<Object> keys = properties.keySet();
                    for (Object key : keys) {
                        //方法名称
                        String methodName = "set" + key.toString().substring(0, 1).toUpperCase() + key.toString().substring(1);
                        //获取对应属性的类型
                        Class<?> type = aclass.getDeclaredField(key.toString()).getType();
                        //必须判断属性的类型是否匹配,否则报错
                        if (type.getSimpleName().contains("Integer")) {
                            aclass.getDeclaredMethod(methodName, type).invoke(instance, Integer.valueOf(properties.getProperty(key.toString())));
                        } else if (type.getSimpleName().contains("Double")) {
                            aclass.getDeclaredMethod(methodName, type).invoke(instance, Double.valueOf(properties.getProperty(key.toString())));
                        } else {
                            aclass.getDeclaredMethod(methodName, type).invoke(instance, properties.getProperty(key.toString()));
                        }
                    }
                    //把对象添加到集合汇总
                    list.add(instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
```

## 11.2 业务层

### 11.2.1 接口

```java
package com.holo.service;

import com.holo.dao.User;

import java.util.List;

/**
 * @author Holo
 * @date 2022/2/24 17:37
 */
public interface UserService {

    void saveUser(User user);

    List<User> show();

    void deleteUser(User user);

    void updateUser(User user);

}
```

### 11.2.2 接口实现

```java
package com.holo.service;

import com.holo.dao.BaseDaoImpl;
import com.holo.dao.User;
import com.holo.utils.BaseUtils;

import java.util.List;

/**
 * @author Holo
 * @date 2022/2/24 17:38
 */
public class UserServiceImpl implements UserService {
    private BaseDaoImpl<User> dao = new BaseDaoImpl<>();
    private String table = "files/students/";

    @Override
    public void saveUser(User user) {
        user.setId((int) BaseUtils.getKey());
        try {
            dao.save(user, table + BaseUtils.getFilename());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> show() {
        return dao.findAll(User.class, table);
    }

    @Override
    public void deleteUser(User user) {
        try {
            dao.delete(user, table );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            dao.update(user, table);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## 11.3 工具类

```java
package com.holo.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.zip.CRC32;

/**
 * @author Holo
 * @date 2022/2/24 17:39
 */
public class BaseUtils {
    private BaseUtils() {

    }

    public static String getFilename() {
        return DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now());
    }

    public static long getKey() {
        CRC32 crc32 = new CRC32();
        crc32.update(UUID.randomUUID().toString().getBytes());
        return crc32.getValue();
    }
}
```

## 11.4 控制层

```java
package com.holo.action;


import com.holo.dao.User;
import com.holo.service.UserService;
import com.holo.service.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

/**
 * @author Holo
 * @date 2022/2/24 17:49
 */
public class UserAction {
    private UserService service = new UserServiceImpl();

    //save
    public void save(Scanner scanner) {
        User user = new User();
        System.out.println("请添加姓名:");
        user.setName(scanner.next());
        System.out.println("请添加性别:");
        user.setSex(scanner.next());
        System.out.println("请添加年龄:");
        user.setAge(scanner.nextInt());
        service.saveUser(user);
    }

    //show
    public void show() {
        List<User> list = service.show();
        list.forEach(System.out::println);
    }

    //delete
    public void delete(Scanner scanner) {
        User user = new User();
        System.out.println("请输入被删除用户的ID:");
        user.setId(scanner.nextInt());
        service.deleteUser(user);
    }

    //update
    public void update(Scanner scanner) {
        User user = new User();
        System.out.println("请输入更新用户信息的id");
        user.setId(scanner.nextInt());
        System.out.println("请输出姓名:");
        user.setName(scanner.next());
        System.out.println("请输入性别:");
        user.setSex(scanner.next());
        System.out.println("请输入年龄:");
        user.setAge(scanner.nextInt());
        service.updateUser(user);
        System.out.println("更新信息成功");
    }
}
```

## 11.5 前端

```java
package com.holo.front;

import com.holo.action.UserAction;

import java.util.Scanner;

/**
 * @author Holo
 * @date 2022/2/24 17:53
 */
public class Front {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAction action = new UserAction();
        boolean flag = true;
        do {
            System.out.println("1.save;2.show;3.delete;4.update;5.exit");
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    action.save(scanner);
                    break;
                case 2:
                    action.show();
                    break;
                case 3:
                    action.delete(scanner);
                    break;
                case 4:
                    action.update(scanner);
                    break;
                case 5:
                    flag = false;
            }
        } while (flag);
    }
}
```