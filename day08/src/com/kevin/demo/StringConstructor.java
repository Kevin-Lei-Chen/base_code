package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class StringConstructor {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] arr = {'a', 'b', 'c'};
        String s2 = new String(arr);
        System.out.println(s2);

        String s3 = new String("123");
        System.out.println(s3);

    }
}
