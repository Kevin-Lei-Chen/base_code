package com.kevin.demo;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class StringForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.nextLine();
        //test1(s);
        //test2(s);
        getCount(s);
    }

    private static void test2(String s) {
        char[] arrc = s.toCharArray();
        for (int i = 0; i < arrc.length; i++) {
            System.out.print(arrc[i] + " ");
        }
        System.out.println();
    }

    private static void test1(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void getCount(String s){
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c >= 'a' && c <= 'z'){
                smallCount++;
            }else if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if(c >= '0' && c <= '9'){
                numCount++;
            }
        }
        System.out.println("大写字符:" + bigCount);
        System.out.println("小写字符:" + smallCount);
        System.out.println("字母字符:" + numCount);
    }
}
