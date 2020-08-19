package com.kevin.test;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号:");
        String s = sc.nextLine();
        boolean b = isLegal(s);
        if(b){
            System.out.println("合法");
        }else{
            System.out.println("不合法");
        }
    }

    private static boolean isLegal(String s) {
        char[] sArr = s.toCharArray();
        char start = sArr[0];
        char end = sArr[sArr.length - 1];
        //判断长度18,不以0开头,最后一位是X或数字,false 不合法
        if(sArr.length == 18 && start != '0'
                && (end == 'X' || (end >= '0' && end <= '9'))){
            //循环,判断前17为是否为数字
            for (int i = 0; i < sArr.length - 1; i++) {
                //如果不是数字,不合法
                if(sArr[i] < '0' || sArr[i] > '9'){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
}
