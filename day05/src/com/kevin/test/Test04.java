package com.kevin.test;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数:");
        int b = sc.nextInt();
        System.out.print("请输入第三个整数:");
        int c = sc.nextInt();
        sort(a, b, c);
    }

    private static void sort(int a, int b, int c) {
        int[] arr = {a, b, c};
        int temp = 0;
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("从大到小的顺序是: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
