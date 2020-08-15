package com.kevin.keycase;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12
 */
public class ArrayFind {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 54, 76};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查找的数:");
        int num = sc.nextInt();
        //查找的标志索引
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("未找到查询的数");
        }else{
            System.out.println("查找数的索引为" + index);
        }
    }
}
