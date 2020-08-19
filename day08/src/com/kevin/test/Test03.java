package com.kevin.test;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.nextLine();
        boolean b = isSymmetry(s);
        if(b){
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }
    }

    private static boolean isSymmetry(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            return true;
        }else {
            return false;
        }
    }
}
