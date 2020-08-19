package com.kevin.keycase;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-16
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("李四",21);
        student.show();

        student.setName("王五");
        student.setAge(23);
        student.show();
    }
}
