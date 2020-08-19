package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("red ").append("blue ").append("green");

        System.out.println("反转前" + sb);
        sb.reverse();
        System.out.println("反转后" + sb);

        String s = sb.toString();
        System.out.println(s);
    }
}
