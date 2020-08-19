package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-16
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println(teacher.name);
        System.out.println(teacher.age);

        teacher.name = "zhs";
        teacher.age = 25;
        System.out.println(teacher.name);
        System.out.println(teacher.age);

        teacher.eat();
        teacher.teach("java65");

    }
}
