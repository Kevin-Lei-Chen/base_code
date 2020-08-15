package com.kevin.keycase;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-13
 */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(compare(10,20));                 //int
        System.out.println(compare((byte)10,(byte)20));     //byte
        System.out.println(compare((short)10,(short)20));   //short
        System.out.println(compare(10L,20L));               //long
    }

    public static boolean compare(int a, int b){
        System.out.print("int \t");
        return a == b;
    }
    public static boolean compare(byte a, byte b){
        System.out.print("byte \t");
        return a == b;
    }
    public static boolean compare(short a, short b){
        System.out.print("short \t");
        return a == b;
    }
    public static boolean compare(long a, long b){
        System.out.print("long \t");
        return a == b;
    }
}
