package com.kevin.demo;

import com.kevin.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-19
 */
public class StudentList {
    public static void main(String[] args) {
        //studentList();
        //test1();
    }

    private static void test1() {
        ArrayList<Student> list= new ArrayList<>();

        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        return stu;
    }

    private static void studentList() {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",25);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu);
        }
    }
}
