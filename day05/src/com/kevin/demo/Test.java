package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12 9:28
 */
public class Test {
    public static void main(String[] args) {
        oddEven(9);
    }
    public static void oddEven(int num){
        if(num % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
