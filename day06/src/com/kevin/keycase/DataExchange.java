package com.kevin.keycase;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-15
 */
public class DataExchange {
    public static void main(String[] args) {
        int a = 3;
        int b = 23;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
