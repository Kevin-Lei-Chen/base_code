package com.kevin.keycase;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class InfoCharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
