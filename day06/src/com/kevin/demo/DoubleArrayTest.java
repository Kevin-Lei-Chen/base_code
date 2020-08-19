package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-15
 */
public class DoubleArrayTest {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {6, 7, 8, 9};

        int[][] arr = new int[3][3];
        // 正常,直接通过地址赋值
        //int[][] arr = {arr1, arr2, arr3};
        // 正常,同样创建3个无名的一位数组,再将其地址赋值给arr
        //int[][] arr = {{6, 7, 8, 9},{6, 7, 8}, {6, 7, 8}};

        arr[0] = arr1;
        arr[1] = arr2;

        arr[2] = arr3;
        arr[2][3] = 10; //正常  赋值后arr[2]存的是arr3的地址
                        //所以可以访问到3号索引的值

        //arr[2][3] = 10; //报错 先访问3号索引,arr[2]存的是自己开辟的
        //arr[2] = arr3;  //内存地址,所以不存在3号索引

        System.out.println(arr[0][3]); //输出55
        System.out.println(arr[1][3]); //输出5
        System.out.println(arr[2][3]); //输出9
        System.out.println("-------------");
        for (int i = 0; i < arr.length; i++) {
            //结果为5 5 4,与arr1,2,3长度相同
            System.out.println(arr[i].length);
        }

    }
}
