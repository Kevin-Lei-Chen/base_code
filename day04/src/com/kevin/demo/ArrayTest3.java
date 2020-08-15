package com.kevin.demo;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12 15:36
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的数:");
        int num = sc.nextInt();
        int[] arr = {12, 23, 34, 45, 56};
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
