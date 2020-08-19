package com.kevin.demo;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class reserveMethodTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }

    }
}
