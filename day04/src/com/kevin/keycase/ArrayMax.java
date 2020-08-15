package com.kevin.keycase;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12
 */
public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {12,45,98,73,60};
        //获取第一个元素作为max初始值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
