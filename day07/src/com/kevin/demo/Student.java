package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-16
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("你给的年龄有误");
        } else {
            this.age = age;
        }
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
