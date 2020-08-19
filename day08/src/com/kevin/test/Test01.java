package com.kevin.test;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker worker = new Worker();
        System.out.println("请录入工人姓名:");
        worker.setName(sc.nextLine());
        System.out.println("请录入工人年龄:");
        worker.setYear(sc.nextInt());
        System.out.println("该工人对象的属性信息如下:");
        System.out.println("姓名:" + worker.getName());
        System.out.println("工龄:" + worker.getYear());


    }
}
