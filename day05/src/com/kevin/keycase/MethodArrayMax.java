package com.kevin.keycase;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class MethodArrayMax {
    public static void main(String[] args) {
        int[] arr = {12, 3, 464, 2, 34, 234};
        int max = getArrayMax(arr);
        System.out.println(max);
    }
    public static int getArrayMax(int[] arr){
        //初始化最大值变量
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
