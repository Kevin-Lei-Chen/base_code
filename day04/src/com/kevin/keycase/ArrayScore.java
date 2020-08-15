package com.kevin.keycase;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12
 */
public class ArrayScore {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分:");
            int score = sc.nextInt();
            if(score >= 0 && score <= 100){
                arr[i] = score;
            }else{
                System.out.println("您输入的分数有误(0-100),请重新输入");
                i--;
            }
        }
        //获取最高分
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //获取最低分
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (sum - max - min) / 4;
        System.out.println("最终得分为:" + avg);
    }
}
