package com.kevin.exam;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-15
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数:");
        int c = sc.nextInt();
        int max = getMax(a, b, c);
        System.out.println("最大值为:" + max);
    }

    private static int getMax(int a, int b, int c) {
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }
}
