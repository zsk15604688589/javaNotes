package com.holo;

/**
 * @author Holo
 * @date 2022/2/17 15:04
 */

public class Person {
    private String username;
    private Integer age;

    public Person() {
    }

    public Person(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "username='" + username + '\'' + ", age=" + age + '}';
    }
}
//public class Person implements Comparable {
//
//    private String username;
//    private Integer age;
//
//    public Person() {
//    }
//
//    public Person(String username, Integer age) {
//        this.username = username;
//        this.age = age;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "username='" + username + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        int result = this.age - ((Person) o).getAge();
//        //int result = ((Person) o).getAge() - this.age;
//        return result;
//    }
//}

//public class Person {
//    private Integer id;
//    private String username;
//
//    public Person() {
//    }
//
//    public Person(Integer id, String username) {
//        this.id = id;
//        this.username = username;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                '}';
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o instanceof Person) {
//            Person person = (Person) o;
//            if (person.getId().equals(id) && person.getUsername().equals(username)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//    @Override
//    public int hashCode() {
//        return id.hashCode() - username.hashCode();
//    }
//}