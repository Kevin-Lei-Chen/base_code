package com.kevin.demo;

import java.util.ArrayList;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-19
 */
public class DeleteElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("111");
        list.add("222");
        list.add("333");
        list.add("111");
        list.add("111");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if("111".equals(s)){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
