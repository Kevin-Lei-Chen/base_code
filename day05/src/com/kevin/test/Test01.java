package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class Test01 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 2.6;
        double min = getMin(a,b);
        System.out.println(min);
    }

    private static double getMin(double a, double b) {
        return a < b ? a : b;
    }
}
