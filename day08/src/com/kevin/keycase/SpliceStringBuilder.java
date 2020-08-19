package com.kevin.keycase;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class SpliceStringBuilder {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        String result = arrayToString(arr);
        System.out.println(result);
    }
    public static String arrayToString(int[] arr){
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
