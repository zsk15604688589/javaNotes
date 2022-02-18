package com.holo.domain;

/**
 * @author Holo
 * @date 2022/2/16 16:54
 */

//必须使用引用类型
public class Student {
    private String sid; //学号:唯一不能重复的
    private String username;
    private String sex;
    private Integer age;
    private String dateTime;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}