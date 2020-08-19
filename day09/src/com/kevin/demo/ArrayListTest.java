package com.kevin.demo;

import java.util.ArrayList;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-19
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //addMethod();
        //removeMethod();
        //setMethod();
        //getAndSizeMethod();
    }

    private static void getAndSizeMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("666");

        String s = list.get(4);
        System.out.println(s);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);
    }

    private static void setMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("666");

        String s = list.set(4, "555");
        System.out.println(s);
        System.out.println(list);
    }

    private static void removeMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("666");

        boolean b1 = list.remove("111");
        boolean b2 = list.remove("abc");
        System.out.println(b1);
        System.out.println(b2);
        //"111"已经被删除,所以1号索引变为"333"
        String s = list.remove(1);
        System.out.println(s);
        System.out.println(list);
    }

    private static void addMethod() {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("666");

        list.add(4,"555");
        System.out.println(list);
    }
}
