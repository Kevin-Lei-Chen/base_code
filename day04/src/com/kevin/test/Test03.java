package com.kevin.test;

import java.util.Random;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //要去随机[0-100]的数,所以参数为101
            arr[i] = r.nextInt(101);
            System.out.println(arr[i]);
            //求和
            sum += arr[i];
        }
        System.out.println("和为:" + sum);
    }
}
