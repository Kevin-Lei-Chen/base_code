package com.kevin.exam;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-15
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,1};
        int num = 2;
        boolean b = exist(arr, num);
        if(b){
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }
    }

    private static boolean exist(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
