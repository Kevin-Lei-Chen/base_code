package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12
 */
public class Test02 {
    public static void main(String[] args) {
        double[] arr = {12.9,53.54,75.0,99.1,3.14};
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("最小值为:" + min);
    }
}
