package com.kevin.keycase;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息:");
        String str = sc.nextLine();
        String[] sArr = str.split(",");
        Student student = new Student(sArr[0], sArr[1]);
        System.out.println(student.getName() + "---" + student.getAge());
    }
}
