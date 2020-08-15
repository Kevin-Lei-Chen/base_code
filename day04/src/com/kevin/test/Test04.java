package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr = {72,89,65,87,91,82,71,93,76,68};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("平均分为:" + avg);
    }
}
