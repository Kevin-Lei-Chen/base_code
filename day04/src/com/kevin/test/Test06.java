package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-12
 */
public class Test06 {
    public static void main(String[] args) {
        int[] arr1 = {72,89,65,87,91,82,71,93,76,68};
        int[] arr2 = new int[arr1.length];
        //奇数索引
        int odd = 0;
        //偶数索引
        int even = arr1.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 != 0){
                //奇数
                arr2[odd] = arr1[i];
                odd++;
            }else{
                //偶数
                arr2[even] = arr1[i];
                even--;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
    }
}
