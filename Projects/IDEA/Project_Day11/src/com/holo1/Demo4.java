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