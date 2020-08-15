package com.kevin.keycase;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class MethodReturnArray {
    public static void main(String[] args) {
        int[] arr = {12, 3, 464, 2, 34, 234};
        int[] maxAndmin = getMaxAndMin(arr);
        System.out.println("最大值:" + maxAndmin[0]);
        System.out.println("最小值:" + maxAndmin[1]);
    }

    public static int[] getMaxAndMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //判断最大值
            if(arr[i] > max){
                max = arr[i];
            }
            //判断最小值
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int[] maxAndMin = {max, min};
        return maxAndMin;
    }
}
