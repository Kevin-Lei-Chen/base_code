package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12 10:53
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("--------");

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
