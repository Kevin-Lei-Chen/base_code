package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class MethodTest1 {
    public static void main(String[] args) {
        //print(20,10);
        //test1();
        //int result = getMax(2,3);//推荐使用
        //System.out.println(getMax(3,4));
        String st = "bbb";                      //@487
        test2(st);                              //@489
        System.out.println(st);
        String st2 = new String("ccc"); //@491
        test3(st2);                             //@489
        System.out.println(st2);
        int[] arr = {1, 2, 4, 5};               //@493
        System.out.println(arr);                //[I@39a054a5
        String str1 = "haha";                   //@495
        String str2 = "haha";                   //@495
        System.out.println(str1 == str2);

        Integer a = 11;                         //@496
        Integer b = 1111;                       //@497
        test3(a);
        test3(b);
        System.out.println(a);
        System.out.println(b);
        Integer c = 11;                         //@496
        System.out.println(c == a);
    }

    public static void print(int n, int m){
        if(n > m){
            System.out.println("你输入的数据有误");
            return;
        }
        System.out.println(n + "到" + m +"之间的奇数有:");
        for (int i = n; i <= m; i++) {
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    public static void test1(){

        System.out.println(5 / 3 + 1.0); // 2   5/3是int型
    }

    public static void test2(String st){
        st = "aaa";                         //@489
    }
    public static void test3(Integer a){
        a = 22;                             //@498
    }

    public static void test3(String st){
        st = new String("aaa");     //@489
    }

    public static int getMax(int a, int b){
        if(a > b){
            return a;
        }else {
            return b;
        }
    }
}
