package com.kevin.demo;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class subStringMethodTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号:");
        String telNumber = sc.nextLine();
        String start = telNumber.substring(0,3);
        String end = telNumber.substring(11 - 4);
        System.out.println(start + "****" + end);
    }
}
