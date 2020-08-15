package com.kevin.test;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数:");
        int n = sc.nextInt();
        System.out.println("请输入列数:");
        int m = sc.nextInt();
        printAt(n,m);
    }

    private static void printAt(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
