package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class Test02 {
    public static void main(String[] args) {
        int max = getMax(54,65,34);
        System.out.println("最大值为:" + max);
    }

    private static int getMax(int a, int b, int c) {
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }
}
