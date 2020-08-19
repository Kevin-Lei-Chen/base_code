package com.kevin.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-17
 */
public class Test {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    private static void test2() {
        int[] arr= new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("低于平均值的元素个数:" + lessAvg(arr));

    }
    public static int lessAvg(int[] arr){
        double sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("数组元素平均值:" + avg);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        return count;
    }

    public static void test1(){
        int[] arr = new int[6];
        Random r = new Random();
        System.out.println("随机数组:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(61) + 6;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("请输入一个[3-6]之间的整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("满足条件的元素:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % num == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
