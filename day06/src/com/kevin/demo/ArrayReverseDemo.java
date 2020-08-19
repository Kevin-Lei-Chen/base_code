package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-15
 */
public class ArrayReverseDemo {
    public static void main(String[] args) {
        int[] arr = {23, 34, 45, 25, 56};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
