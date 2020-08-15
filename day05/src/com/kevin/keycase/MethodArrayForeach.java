package com.kevin.keycase;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class MethodArrayForeach {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        arrayForeach(arr);
    }
    public static void arrayForeach(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //判断是否是最后一个
            if(i == arr.length - 1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
