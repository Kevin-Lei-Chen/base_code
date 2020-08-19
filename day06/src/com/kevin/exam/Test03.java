package com.kevin.exam;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-15
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级人数:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        Random r = new Random();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //随机成绩
            arr[i] = r.nextInt(101);
            //计算不及格人数
            if(arr[i] < 60){
                count++;
            }
            //计算总成绩
            sum += arr[i];
        }
        double avg = 1.0 * sum / num;
        System.out.println("不及格人数:" + count);
        System.out.println("班级平均分:" + avg);
    }
}
