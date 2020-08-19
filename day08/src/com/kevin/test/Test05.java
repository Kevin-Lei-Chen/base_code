package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(getString(null));
        System.out.println(getString(new int[0]));
        System.out.println(getString(arr));
    }
    public static String getString(int[] arr){
        if(arr == null){
            return null;
        }
        if(arr.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
