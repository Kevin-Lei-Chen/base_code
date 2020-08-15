package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class Test05 {
    public static void main(String[] args) {
        double a = -3.14;
        double b = 2.6;
        double abs_a = absoluteValue(a);
        System.out.println(a + "的绝对值是:" + abs_a);
        double abs_b = absoluteValue(b);
        System.out.println(b + "的绝对值是:" + abs_b);
    }

    private static double absoluteValue(double a) {
        if(a < 0){
            return -a;
        }else {
            return a;
        }
    }
}
