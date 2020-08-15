package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class MethodReturnArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] maxAndMin = getMaxAndMin(arr);

        System.out.println("最大值:" + maxAndMin[0]);
        System.out.println("最小值" + maxAndMin[1]);

    }
    public static int[] getMaxAndMin(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int[] maxAndMin = {max, min};
        return maxAndMin;
    }
}
