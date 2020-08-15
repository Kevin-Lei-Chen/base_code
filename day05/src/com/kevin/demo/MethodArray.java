package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class MethodArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        //printArray(arr);
        int max = getMax(arr);
        System.out.println(max);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
