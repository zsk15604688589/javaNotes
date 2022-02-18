### 5.3.1 分类完成功能

+ 使用数组模拟数据库：可以创建一个单独的类
+ 实现功能CRUD：独立的类完成
+ 前端：独立类完成

### 5.3.2 开发

+ 开发流程图：开发就是这个过程的倒过程![开发流程](../Img/%E5%BC%80%E5%8F%91%E6%B5%81%E7%A8%8B.png)

#### 5.3.2.1 创建实体类：即JavaBean

 [点击打开Student.java](..\Projects\IDEA\Project_Day11\src\com\holo\Student.java) 

#### 5.3.2.2 创建数据库类：就是管理数组的

 [点击打开DataBaseHolo.java](..\Projects\IDEA\Project_Day11\src\com\holo\DataBaseHolo.java) 

#### 5.3.2.3 业务类service

 [点击打开StudentService.java](..\Projects\IDEA\Project_Day11\src\com\holo\StudentService.java) 

#### 5.3.2.4 前端控制类

+ action:负责接收用户的数据，并且封装到实体类对象中
  +  [点击打开StudentAction.java](..\Projects\IDEA\Project_Day11\src\com\holo\StudentAction.java) 

+ 前端
  +  [点击打开StudentFront.java](..\Projects\IDEA\Project_Day11\src\com\holo\StudentFront.java) 


#### 5.3.2.5 工具类

[点击打开StudentUtils.java](..\Projects\IDEA\Project_Day11\src\com\holo\StudentUtils.java) 

+ 提供一个不重复的id
+ 提供一个日期

## 5.4 类的继承

### 5.4.1 继承：

+ 实现了代码重用率；例如：A继承B，那么，A就拥有B的所有特性；

+ Java中的类是单继承性

+ 继承的关键字extends

+ 继承优先

+ 案例：class A extends B{}

### 5.4.2 代码重用率

```java
package com.holo1;

public class Demo {

    public static void main(String[] args) {
        Student student = new Student();
        //可以直接调用父类对象的方法
        student.setAge(11);
        System.out.println(student.getAge());
    }
}

class Student extends Person {
    private int sid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}

class User extends Person {
    private int uid;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}

class Person {
    private String username;
    private String sex;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

运行结果:`11`

+ 当创建子类对象时，父类对象先被创建出来(无父即无子)，子类会默认调用父类的构造方法；

```java
package com.holo1;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();
    }
}

class Student extends Person {
    public Student() {
        System.out.println("子类构造方法");
    }
}

class Person {
    public Person() {
        System.out.println("父类构造方法");
    }
}
```

运行结果:

```
父类构造方法
子类构造方法
```

### **5.4.3** **类的重写**(覆盖)-都是对方法

+ **重载：**
  - 在同一个类中
  - 方法名称相同
  - 只跟方法的参数：个数、顺序、类型不同即可
  - 与方法的修饰符和返回类型无关

+ **重写：**
  - 必须是子类和父类有继承关系
  - 覆盖只能出现在子类中
  - 在子类中被覆盖的方法，必须与父类的方法“完全”一样，也就是说方法名称、返回类型、方法、参数，要完全一致
  - 子类方法的访问权限不能小于父类方法的访问权限
  - 子类不能抛出比父类更多的异常，但是，可以抛出父类异常的子异常
  - 父类的静态方法不能被子类覆盖
  - 父类的私有方法不能被覆盖
  - 覆盖针对的是“方法”而非”属性“
  - 重写就是改变了父类的行为

#### 5.4.3.1 案例：

```java
public class Demo2 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.move();
    }
}

class Animal {
    public void move() {
        System.out.println("动物在移动...");
    }
}

class Cat extends Animal {
    public void move() {
        System.out.println("小猫在移动...");
    }
}
```

运行结果:**`小猫在移动...`**

通过上面的案例，可以看到，**父类指向子类的引用**，**子类改变了父类的行为**。

多态就是多种形态：

+ overload(重载)是多态的一种，属于**编译期绑定**，就是**静态绑定**；

+ override(重写)是**运行期间绑定**的(**后期绑定**)

多态存在的条件：

1. `有继承`

2. `有覆盖`

3. `父类指向子类的引用`

#### 5.4.3.2 对静态方法覆盖

```java
public class Demo3 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.move();
    }
}

class Animal {
    public static void move() {
        System.out.println("动物在移动...");
    }
}

class Cat extends Animal {
    public static void move() {
        System.out.println("小猫在移动...");
    }
}
```

运行结果:

```
动物在移动...
```

+ 静态方法不产生覆盖

<img src="../Img/静态方法不产生覆盖.png" alt="静态方法不产生覆盖" style="zoom: 33%;" />

#### 5.4.3.3 成员方法可以覆盖，但是，成员变量不能被覆盖

```java
package com.holo1;

public class Demo4 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.move();
        System.out.println(cat.name);
    }
}

class Animal {
    public String name = "动物";

    public void move() {
        System.out.println("动物在移动...");
    }
}

class Cat extends Animal {
    public String name = "小猫";

    public void move() {
        System.out.println("小猫在移动...");
    }
}
```

运行结果:

```
小猫在移动...
动物
```

