package com.kevin.test;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.nextLine();
        char[] sArr = str.toCharArray();
        int letterCount = 0;
        int numCount = 0;
        for (int i = 0; i < sArr.length; i++) {
            if ((sArr[i] >= 'a' && sArr[i] <= 'z')
                    || (sArr[i] >= 'A' && sArr[i] <= 'Z')) {
                letterCount++;
            } else if (sArr[i] >= '0' && sArr[i] <= '9') {
                numCount++;
            }
        }
        System.out.print(str + "中字母:" + letterCount
                + "个, 数字:" + numCount + "个.");
    }
}
