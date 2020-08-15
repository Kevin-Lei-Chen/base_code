package com.kevin.demo;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12 15:36
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个整数:");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和为:" + sum);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
