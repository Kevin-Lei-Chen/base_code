package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class arrayToStringTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);
    }
    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i == arr.length - 1){
                sb.append("]");
            }else{
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
