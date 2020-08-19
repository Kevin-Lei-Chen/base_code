package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-16
 */
public class Test02 {
    public static void main(String[] args) {
        Clock clock = new Clock(19, 3, 21);
        System.out.println(clock.getHour() + "时" + clock.getMinute()
                + "分" + clock.getSecond() + "秒");
        clock.setHour(21);
        clock.setMinute(55);
        clock.setSecond(21);
        System.out.println(clock.getHour() + "时" + clock.getMinute()
                + "分" + clock.getSecond() + "秒");

    }
}
