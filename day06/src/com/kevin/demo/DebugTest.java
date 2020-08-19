package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-15
 */
public class DebugTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            i += sum;
            //循环内的断点,下一次还会到此断点,
            // 跳出循环就需要删除此断点
            //第10行和第11行都是循环内的断点
        }
        System.out.println(sum);
        System.out.println();
    }
}
