package com.kevin.keycase;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class MobileNumberShield {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号:");
        String s = sc.nextLine();
        String start = s.substring(0,3);
        String end = s.substring(7);
        System.out.println(start + "****" + end);
    }
}
