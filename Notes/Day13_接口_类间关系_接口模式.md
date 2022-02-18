## 5.8 接口

+ 接口就是标准，关键字是`interface`
+ 面向对象编程，就是面向接口编程

### 5.8.1 接口分类

#### 5.8.1.1 普通接口：

+ 接口中的方法都是 `public abstract`
+ 接口中可以有实现的方法
+ 接口中的变量都是常量 `public static final`

+ 接口不能实例化，接口中没有构造方法的概念
+ 接口间可以多继承，但是，接口之间不能实现
+ 实现接口的关键字 `implements`

+ 类可以实现多个接口，并且，需要实现接口中所有的抽象方法

#### 5.8.1.2 函数式接口

+ 使用标签：`FunctionInterface`修饰的
+ 接口中可以有实现的方法
+ 接口中只能有且只有一个必须实现的方法

### 5.8.2 创建接口

```java
public interface StudentManager {
    public abstract void save();
    public static final int ABC = 100;
    //实现的方法：使用default关键字就是要覆盖的
    default void delete(){
        System.out.println("这是一个删除方法");
    }
}
```

+ 编写接口时可以省略 `public abstarct`或`static final`

```java
public interface StudentManager {
    void save();
    int ABC = 100;
}
```

#### 5.8.2.2 接口中的变量都是常量，所以不能修改

<img src="../Img/image-20220120162538000.png" alt="image-20220120162538000" style="zoom:67%;" />

#### 5.8.2.3 接口之间不能实例化

<img src="../Img/image-20220120162712650.png" alt="image-20220120162712650" style="zoom: 50%;" />

#### 5.8.2.4 接口之间可以多继承

```java
interface A{
    void mertod1();
}
interface B{
    void method2();
}
interface C extends A,B{}
```

#### 5.8.2.5 接口间不能实现

<img src="../Img/image-20220120163114058.png" alt="image-20220120163114058" style="zoom:67%;" />

#### 5.8.2.6 接口直通通过类实现，并且，需要实现所有的抽象方法

```java
interface A {
    void method1();
}

interface B {
    void method2();
}

interface C extends A, B {
}

class CImp implements C {

    @Override
    public void method1() {
        
    }

    @Override
    public void method2() {

    }
}
```

#### 5.8.2.7 一个类可以同时实现多个接口

```java
interface A {
    void method1();
}

interface B {
    void method2();
}
//实现接口
class CImp implements A,B {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
```

#### 5.8.2.8 皆有父类也要实现接口，继承优先

```java
class Father {
}

interface A {
    void method1();
}

interface B {
    void method2();
}

//实现接口
class CImp extends Father implements A, B {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
```

#### 5.8.2.9 笔试题：抽象类可以实现接口

+ 无非就是添加接口中的抽象方法

```java
interface A {
    void show();
}

//父类
abstract class Father implements A {
}

//实现抽象方法
class CImpl extends Father {

    @Override
    public void show() {
        
    }
}
```

### 5.8.3 接口进一步应用

#### 5.8.3.1 接口的本质

+ 本质就是抽象
+ 采用接口可以很明确的声明了所提供的服务
+ 解决了类的单继承的问题
+ **重要**：实现了可插拔性

#### 5.8.3.2 开发一个系统，需要使用两种数据库：MySQL，Oracle

+ 第一种：不使用接口
  + 代码不能灵活使用，当我们需求改变了需要改动大量的代码，这样还会导致代码重构，因为项目没有扩展性。

```java
public class 不使用接口 {
    public static void main(String[] args) {
        //使用MySQL数据库
        StudentMysql studentMysql = new StudentMysql();
        studentMysql.save1();
        
        //使用Oracle数据库
        StudentOracle studentOracle = new StudentOracle();
        studentOracle.save2();

    }
}

//操作MySQL
class StudentMysql {
    public void save1() {
        System.out.println("保存数据--mysql");
    }

    public void show1() {
        System.out.println("显示数据--mysql");
    }
}

class StudentOracle {
    public void save2() {
        System.out.println("保存数据--Oracle");
    }

    public void show2() {
        System.out.println("显示数据--Oracle");
    }
}
```

+ 第二种：使用接口
  + 体现了扩展性和灵活性
    + 只有符合标准都可以随时更换
    + 面向接口编程(因为，以后做每一件事都要遵守标准和规范)

<img src="../Img/%E4%BD%BF%E7%94%A8%E6%8E%A5%E5%8F%A3%E5%BC%80%E5%8F%91.png" alt="使用接口开发" style="zoom: 25%;" />

```java
public class 使用接口 {
    public static void main(String[] args) {
        StudentMysqlImpl iStudent = new StudentMysqlImpl();//new StudentOracleImpl();
        iStudent.save();
        iStudent.delete();
        iStudent.update();
    }
}
//定义接口
interface Istudent{
    void save();
    void delete();
    void update();
}
//操作MySQL
class StudentMysqlImpl implements Istudent{
    @Override
    public void save(){
        System.out.println("保存数据--mysql");
    }

    @Override
    public void delete() {
        System.out.println("删除数据--mysql");
    }

    @Override
    public void update() {
        System.out.println("更新数据--mysql");
    }
}

//操作MySQL
class StudentOracleImpl implements Istudent{
    @Override
    public void save(){
        System.out.println("保存数据--Oracle");
    }

    @Override
    public void delete() {
        System.out.println("删除数据--Oracle");
    }

    @Override
    public void update() {
        System.out.println("更新数据--Oracle");
    }
}
```

## 5.9 类之间的关系

### 5.9.1 泛化关系(实线空箭头)

+ 类和类之间的继承及接口之间的继承

<img src="../Img/image-20220120171930196.png" alt="image-20220120171930196" style="zoom: 67%;" />

### 5.9.2 实现关系：类对接口的实现(虚线空箭头)

<img src="../Img/image-20220120172426275.png" alt="image-20220120172426275" style="zoom:67%;" />

### 5.9.3 关联关系(实线实箭头)

+ 类与类之间的连接，一个类作为另一类的属性和方法使用，例如：实例变量（成员属性）

<img src="../Img/image-20220120173034737.png" alt="image-20220120173034737" style="zoom: 80%;" />

### 5.9.4 聚合关系(实线空菱形)

+ 聚合关系是关联关系的一中，是较强的一种关联关系；例如：汽车和轮胎，一个代表整体，一个代表局部

<img src="../Img/image-20220120173753635.png" alt="image-20220120173753635" style="zoom:67%;" />

### 5.9.5 合成关系/组装关系(实线实菱形)

+ 合成关系是关联关系的一中，比聚合关系强的一种关系：例如：人和四肢

<img src="../Img/image-20220120174321432.png" alt="image-20220120174321432" style="zoom:67%;" />

### 5.9.6 依赖关系:是比关联关系弱的一中关系(虚线实箭头)

<img src="../Img/image-20220120174746022.png" alt="image-20220120174746022" style="zoom: 67%;" />

## 6.0 is-a、is-like-a、has-a

### 6.0.1 is-a：接口中有的方法，类中必须实现

```java
interface A{
    void method();
}

class AImpl implements A{

    @Override
    public void method() {
        
    }
}
```

### 6.0.2 is-like-a：接口中有的方法，类中必须实现，并且，类中也有自己的方法

```java
interface A {
    void method1();
}

class AImpl implements A {

    @Override
    public void method1() {

    }

    public void method2() {
        
    }
}
```

### 6.0.3 has-a：一个类作为另一类的属性使用

```java
class B{}

class A{
    private B b;
}
```

