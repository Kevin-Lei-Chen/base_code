package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-16
 */
public class Clock {
   private int hour;
   private int minute;
   private int second;

    public Clock() {
    }

    public Clock(int hour, int minute, int second) {
        //this.hour = hour;
        //this.minute = minute;
        //this.second = second;
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour < 24){
            this.hour = hour;
        }else {
            System.out.println("你输入的小时数有误");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute < 60){
            this.minute = minute;
        }else {
            System.out.println("你输入的分钟数有误");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second >= 0 && second < 60){
            this.second = second;
        }else {
            System.out.println("你输入的秒数有误");
        }
    }
}
