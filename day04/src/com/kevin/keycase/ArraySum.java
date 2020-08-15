package com.kevin.keycase;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        //求和累加器
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个整数:");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
